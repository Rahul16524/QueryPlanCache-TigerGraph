package com.querycache.cache;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.querycache.model.QueryPlan;

/**
 * QueryPlanCache - Stores and manages cached query execution plans
 * 
 * Features:
 * - Thread-safe cache using ConcurrentHashMap
 * - Schema version tracking for cache invalidation
 * - LRU eviction when cache exceeds max size
 * - Selective invalidation by table name
 */
public class QueryPlanCache {
    
    // ========== FIELDS ==========
    
    private final Map<String, QueryPlan> cache;        // Main cache storage (Key → QueryPlan)
    private final Map<String, Integer> schemaVersions; // Tracks schema version per table
    private final int maxSize;                          // Maximum number of plans in cache
    private boolean enabled = true;                     // Cache ON/OFF switch
    
    // ========== CONSTRUCTORS ==========
    
    /**
     * Create cache with default max size (100 plans)
     */
    public QueryPlanCache() {
        this(100); // Default max size 100
    }
    
    /**
     * Create cache with custom max size
     * @param maxSize Maximum number of plans to store
     */
    public QueryPlanCache(int maxSize) {
        this.cache = new ConcurrentHashMap<>();        // Thread-safe map
        this.schemaVersions = new ConcurrentHashMap<>(); // Version tracking
        this.maxSize = maxSize;
    }
    
    // ========== CACHE CONTROL ==========
    
    /**
     * Enable or disable the cache
     * When disabled, get() always returns null (forces plan generation)
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        if (!enabled) {
            System.out.println("  ⚙️ Cache DISABLED");
        } else {
            System.out.println("  ⚙️ Cache ENABLED");
        }
    }
    
    public boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Retrieve a plan from cache by its normalized query key
     * @param key Normalized query string (e.g., "SELECT * FROM orders WHERE id = ?")
     * @return QueryPlan if found and cache enabled, otherwise null
     */
    public QueryPlan get(String key) {
        if (!enabled) return null;  // Cache disabled → always miss
        return cache.get(key);
    }
    
    /**
     * Store a plan in cache
     * - Checks size limit before storing
     - Tags the plan with current schema version
     * 
     * @param key Normalized query string
     * @param plan QueryPlan to store
     */
    public void put(String key, QueryPlan plan) {
        if (!enabled) return;  // Cache disabled → don't store
        
        // Check size limit - if full, remove oldest entry (LRU)
        if (cache.size() >= maxSize) {
            evictLRU();
        }
        
        // IMPORTANT: Tag plan with current schema version before storing
        // This allows future validation when schema changes
        int currentSchemaVersion = getCurrentSchemaVersion(plan.getTablesAccessed());
        plan.setSchemaVersion(currentSchemaVersion);
        
        // Store in cache
        cache.put(key, plan);
    }
    
    // ========== CACHE INVALIDATION ==========
    
    /**
     * Invalidate (remove) all cached plans that access a specific table
     * Called when a table's schema changes (ALTER TABLE)
     * 
     * How it works:
     * 1. Increment schema version counter for this table
     * 2. Iterate through all cached plans
     * 3. Remove plans that reference this table
     * 
     * @param tableName Name of table that changed (e.g., "orders", "users")
     */
    public void invalidateForTable(String tableName) {
        if (!enabled) return;
        
        // STEP 1: Increment schema version for this table
        // Example: orders version 1 → 2 (schema changed!)
        int newVersion = schemaVersions.getOrDefault(tableName, 0) + 1;
        schemaVersions.put(tableName, newVersion);
        
        // STEP 2: Remove all cache entries that use this table
        int removedCount = 0;
        Iterator<Map.Entry<String, QueryPlan>> iterator = cache.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, QueryPlan> entry = iterator.next();
            // Check if this plan accesses the changed table
            if (entry.getValue().getTablesAccessed().contains(tableName)) {
                iterator.remove();  // Remove invalid plan
                removedCount++;
            }
        }
        
        // Report how many entries were removed
        System.out.printf("  🗑️ Invalidated %d cache entries for table: %s%n", 
                         removedCount, tableName);
    }
    
    /**
     * Public wrapper for invalidateForTable
     * Called by QueryService when schema change is detected
     */
    public void notifySchemaChange(String tableName) {
        invalidateForTable(tableName);
    }
    
    /**
     * Clear ALL entries from cache (complete reset)
     */
    public void clear() {
        cache.clear();
        System.out.println("  🗑️ Cache cleared completely");
    }
    
    /**
     * Remove a single entry from cache by its key
     * Used when a specific plan is found to be invalid
     */
    public void evict(String key) {
        if (cache.remove(key) != null) {
            System.out.println("    🗑️ Evicted invalid cache entry: " + 
                              key.substring(0, Math.min(30, key.length())) + "...");
        }
    }
    
    // ========== EVICTION POLICY ==========
    
    /**
     * Evict the Least Recently Used entry (simplified LRU)
     * 
     * Note: This is a simplified implementation.
     * Real LRU would track access timestamps.
     * Here we just remove the first entry (oldest in iteration order).
     */
    private void evictLRU() {
        if (!cache.isEmpty()) {
            String oldestKey = cache.entrySet().iterator().next().getKey();
            cache.remove(oldestKey);
        }
    }
    
    // ========== SCHEMA VERSION MANAGEMENT ==========
    
    /**
     * Get the current schema version for a list of tables
     * Returns the MAX version among all tables
     * 
     * Example:
     *   tables = ["orders", "products"]
     *   schemaVersions = {"orders": 2, "products": 1}
     *   Returns: 2 (the highest version)
     * 
     * Why max? If ANY table changed, the plan is invalid!
     */
    private int getCurrentSchemaVersion(List<String> tables) {
        int maxVersion = 0;
        for (String table : tables) {
            int version = schemaVersions.getOrDefault(table, 0);
            maxVersion = Math.max(maxVersion, version);
        }
        return maxVersion;
    }
    
    /**
     * Check if a cached plan is still valid
     * 
     * A plan is valid if:
     * - Cache is enabled
     * - Plan's schema version == Current schema version
     * 
     * @param key Cache key (for debugging)
     * @param plan Plan to validate
     * @return true if plan can be safely reused
     */
    public boolean isValid(String key, QueryPlan plan) {
        if (!enabled) return false;
        
        // Get current schema version (may have changed since plan was stored)
        int currentSchemaVersion = getCurrentSchemaVersion(plan.getTablesAccessed());
        
        // Compare: Is plan's version up-to-date?
        return plan.getSchemaVersion() == currentSchemaVersion;
    }
    
    // ========== UTILITY METHODS ==========
    
    /**
     * Get number of plans currently in cache
     */
    public int getSize() {
        return cache.size();
    }
}