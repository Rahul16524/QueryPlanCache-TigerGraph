package com.querycache.model;

import java.util.ArrayList;
import java.util.List;

/**
 * QueryPlan - Represents a database execution plan for a SQL query
 * 
 * Contains:
 * - Unique plan identifier (UUID)
 * - Normalized query pattern
 * - Generation time (how long to create this plan)
 * - Estimated execution cost
 * - Schema version for cache validation
 * - Tables accessed by this query
 * - Usage statistics (access count, last execution time)
 * 
 * @author QueryCache Team
 * @version 1.0
 */
public class QueryPlan {
    
    // ========== FIELDS ==========
    
    /** Unique identifier for this plan (UUID format) */
    private final String planId;
    
    /** Normalized query string (literals replaced with '?') */
    private final String normalizedQuery;
    
    /** Time taken to generate this plan (milliseconds) */
    private final long generationTime;
    
    /** Estimated execution cost (higher = more expensive) */
    private final double estimatedCost;
    
    /** Schema version when this plan was created (for invalidation) */
    private int schemaVersion;
    
    /** List of tables this query accesses */
    private final List<String> tablesAccessed;
    
    /** Number of times this plan has been reused */
    private int accessCount;
    
    /** Last execution timestamp (milliseconds since epoch) */
    private long lastExecutionTime;
    
    // ========== CONSTRUCTOR ==========
    
    /**
     * Creates a new QueryPlan
     * 
     * @param planId Unique identifier for this plan
     * @param normalizedQuery Normalized query string
     * @param generationTime Time taken to generate (ms)
     * @param estimatedCost Estimated execution cost
     */
    public QueryPlan(String planId, String normalizedQuery, long generationTime, double estimatedCost) {
        this.planId = planId;
        this.normalizedQuery = normalizedQuery;
        this.generationTime = generationTime;
        this.estimatedCost = estimatedCost;
        this.tablesAccessed = new ArrayList<>();
        this.accessCount = 0;
        this.schemaVersion = 0;
        this.lastExecutionTime = 0;
    }
    
    // ========== GETTERS ==========
    
    /** Returns unique plan identifier */
    public String getPlanId() {
        return planId;
    }
    
    /** Returns normalized query string */
    public String getNormalizedQuery() {
        return normalizedQuery;
    }
    
    /** Returns plan generation time in milliseconds */
    public long getGenerationTime() {
        return generationTime;
    }
    
    /** Returns estimated execution cost */
    public double getEstimatedCost() {
        return estimatedCost;
    }
    
    /** Returns schema version for cache validation */
    public int getSchemaVersion() {
        return schemaVersion;
    }
    
    /** Returns list of tables accessed by this query */
    public List<String> getTablesAccessed() {
        return tablesAccessed;
    }
    
    /** Returns number of times this plan was reused */
    public int getAccessCount() {
        return accessCount;
    }
    
    /** Returns last execution time in milliseconds */
    public long getLastExecutionTime() {
        return lastExecutionTime;
    }
    
    // ========== SETTERS ==========
    
    /** Sets schema version (called when storing in cache) */
    public void setSchemaVersion(int schemaVersion) {
        this.schemaVersion = schemaVersion;
    }
    
    /** Adds a table to the accessed tables list (no duplicates) */
    public void addTableAccessed(String table) {
        if (!tablesAccessed.contains(table)) {
            tablesAccessed.add(table);
        }
    }
    
    /** Increments the access count (called on cache hit) */
    public void incrementAccessCount() {
        this.accessCount++;
    }
    
    /** Sets the last execution time */
    public void setLastExecutionTime(long lastExecutionTime) {
        this.lastExecutionTime = lastExecutionTime;
    }
    
    // ========== UTILITY METHODS ==========
    
    /**
     * Returns string representation of this plan
     * Useful for debugging and logging
     */
    @Override
    public String toString() {
        return String.format("QueryPlan{id='%s', tables=%s, cost=%.2f, version=%d, accesses=%d, lastExec=%dms}",
                            planId, tablesAccessed, estimatedCost, schemaVersion, accessCount, lastExecutionTime);
    }
}