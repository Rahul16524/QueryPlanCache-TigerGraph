package com.querycache.metrics;

/**
 * CacheMetrics - Simple metrics collector
 * Only tracks what's easy to understand
 */
public class CacheMetrics {
    
    private int totalQueries = 0;
    private int cacheHits = 0;
    private int cacheMisses = 0;
    private long totalExecutionTime = 0;
    
    public int getTotalQueries() { return totalQueries; }
    public int getCacheHits() { return cacheHits; }
    public int getCacheMisses() { return cacheMisses; }
    
    public double getHitRatio() {
        return totalQueries == 0 ? 0 : (cacheHits * 100.0 / totalQueries);
    }
    
    public double getMissRatio() {
        return totalQueries == 0 ? 0 : (cacheMisses * 100.0 / totalQueries);
    }
    
    public double getAvgTimePerQuery() {
        return totalQueries == 0 ? 0 : (double) totalExecutionTime / totalQueries;
    }
    
    public long getTotalExecutionTime() {
        return totalExecutionTime;
    }
    
    public void recordHit(long executionTimeMs) {
        totalQueries++;
        cacheHits++;
        totalExecutionTime += executionTimeMs;
    }
    
    public void recordMiss(long executionTimeMs) {
        totalQueries++;
        cacheMisses++;
        totalExecutionTime += executionTimeMs;
    }
    
    public void reset() {
        totalQueries = 0;
        cacheHits = 0;
        cacheMisses = 0;
        totalExecutionTime = 0;
    }
    
    public void printSummary() {
        System.out.println("\n  📊 METRICS:");
        System.out.printf("  • Total Execution Time: %d ms%n", totalExecutionTime);
        System.out.printf("  • Cache Hits: %d | Cache Misses: %d%n", cacheHits, cacheMisses);
        System.out.printf("  • Hit Ratio: %.1f%% | Miss Ratio: %.1f%%%n", getHitRatio(), getMissRatio());
        System.out.printf("  • Avg Time/Query: %.2f ms%n", getAvgTimePerQuery());
    }
}