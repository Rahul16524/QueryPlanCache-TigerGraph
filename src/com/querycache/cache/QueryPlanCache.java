package com.querycache.cache;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.querycache.model.QueryPlan;

/**
 * QueryPlanCache
 * -------------------------------------------------------
 * This class stores and manages query execution plans.
 *
 * Think of it like:
 * 👉 "Memory box for query plans"
 *
 * Responsibilities:
 * 1. Store query plans
 * 2. Return plans if already available (CACHE HIT)
 * 3. Remove old plans when cache is full (LRU)
 * 4. Remove plans when schema changes
 */
public class QueryPlanCache {
    
    // ===================== DATA STRUCTURES =====================

    // Main cache → stores (Normalized Query → QueryPlan)
    private final Map<String, QueryPlan> cache;
    
    // Tracks last access time → used for LRU eviction
    private final Map<String, Long> accessTimestamps;
    
    // Tracks schema version for each table
    // Example: users → 2, orders → 1
    private final Map<String, Integer> schemaVersions;
    
    // Maximum number of entries allowed in cache
    private final int maxSize;
    
    // Cache ON/OFF switch
    private boolean enabled = true;
    
    
    // ===================== CONSTRUCTORS =====================

    /**
     * Default constructor → max size = 100
     */
    public QueryPlanCache() {
        this(100);
    }
    
    /**
     * Custom size constructor
     */
    public QueryPlanCache(int maxSize) {
        this.cache = new ConcurrentHashMap<>();
        this.accessTimestamps = new ConcurrentHashMap<>();
        this.schemaVersions = new ConcurrentHashMap<>();
        this.maxSize = maxSize;
    }
    
    
    // ===================== CACHE CONTROL =====================

    /**
     * Enable or Disable cache
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        
        if (enabled) {
            System.out.println("⚙️ Cache ENABLED");
        } else {
            System.out.println("⚙️ Cache DISABLED");
        }
    }

    public boolean isEnabled() {
        return enabled;
    }
    
    
    // ===================== GET (READ FROM CACHE) =====================

    /**
     * Get query plan from cache
     *
     * Steps:
     * 1. If cache disabled → return null
     * 2. Check if plan exists
     * 3. If exists → update timestamp (important for LRU)
     */
    public QueryPlan get(String key) {
        
        // If cache OFF → always behave like MISS
        if (!enabled) return null;
        
        QueryPlan plan = cache.get(key);
        
        if (plan != null) {
            // Update last access time (VERY IMPORTANT for LRU)
            accessTimestamps.put(key, System.currentTimeMillis());
        }
        
        return plan;
    }
    
    
    // ===================== PUT (STORE IN CACHE) =====================

    /**
     * Store a new query plan
     *
     * Steps:
     * 1. If cache full → remove least used plan (LRU)
     * 2. Get current schema version
     * 3. Attach version to plan
     * 4. Store in cache
     */
    public void put(String key, QueryPlan plan) {
        
        if (!enabled) return;
        
        // Step 1: If full → remove least recently used plan
        if (cache.size() >= maxSize) {
            evictLRU();
        }
        
        // Step 2: Get current schema version
        int version = getCurrentSchemaVersion(plan.getTablesAccessed());
        
        // Step 3: Attach version to plan
        plan.setSchemaVersion(version);
        
        // Step 4: Store in cache
        cache.put(key, plan);
        
        // Save timestamp (for LRU)
        accessTimestamps.put(key, System.currentTimeMillis());
    }
    
    
    // ===================== SCHEMA INVALIDATION =====================

    /**
     * Called when table schema changes (ALTER TABLE)
     *
     * Steps:
     * 1. Increase schema version
     * 2. Remove all plans using that table
     */
    public void invalidateForTable(String tableName) {
        
        if (!enabled) return;
        
        // Step 1: Increase schema version
        int newVersion = schemaVersions.getOrDefault(tableName, 0) + 1;
        schemaVersions.put(tableName, newVersion);
        
        int removedCount = 0;
        
        // Step 2: Remove affected plans
        Iterator<Map.Entry<String, QueryPlan>> iterator = cache.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, QueryPlan> entry = iterator.next();
            
            // If query uses this table → remove it
            if (entry.getValue().getTablesAccessed().contains(tableName)) {
                iterator.remove();
                accessTimestamps.remove(entry.getKey());
                removedCount++;
            }
        }
        
        System.out.println("🗑️ Invalidated " + removedCount + " plans for table: " + tableName);
    }

    /**
     * Wrapper method (called from service layer)
     */
    public void notifySchemaChange(String tableName) {
        invalidateForTable(tableName);
    }
    
    
    // ===================== CLEAR / REMOVE =====================

    /**
     * Clear entire cache
     */
    public void clear() {
        cache.clear();
        accessTimestamps.clear();
        System.out.println("🗑️ Cache cleared completely");
    }

    /**
     * Remove a specific query plan
     */
    public void evict(String key) {
        if (cache.remove(key) != null) {
            accessTimestamps.remove(key);
            System.out.println("🗑️ Removed invalid plan: " + key);
        }
    }
    
    
    // ===================== LRU EVICTION =====================

    /**
     * Remove Least Recently Used query
     *
     * Logic:
     * Find query with oldest timestamp
     */
    private void evictLRU() {
        
        if (cache.isEmpty()) return;		// if cache empty, nothing to remove from cache
        
        
        String oldestKey = null;
        long oldestTime = Long.MAX_VALUE;
        
        // Find least recently used query
        for (Map.Entry<String, Long> entry : accessTimestamps.entrySet()) {
            if (entry.getValue() < oldestTime) {
                oldestTime = entry.getValue();
                oldestKey = entry.getKey();
            }
        }
        
        // Remove it
        if (oldestKey != null) {
            cache.remove(oldestKey);
            accessTimestamps.remove(oldestKey);
            
            System.out.println("🗑️ LRU removed: " + oldestKey);
        }
    }
    
    
    // ===================== SCHEMA VERSION LOGIC =====================

    /**
     * Get current schema version
     *
     * Important rule:
     * 👉 If ANY table changed → plan becomes invalid
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
     * Check if plan is still valid
     *
     * Valid only if:
     * plan version == current schema version
     */
    public boolean isValid(String key, QueryPlan plan) {
        
        if (!enabled) return false;
        
        int currentVersion = getCurrentSchemaVersion(plan.getTablesAccessed());
        
        return plan.getSchemaVersion() == currentVersion;
    }
    
    
    // ===================== UTILITY =====================

    public int getSize() {
        return cache.size();
    }
}