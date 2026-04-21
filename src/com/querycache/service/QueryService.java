package com.querycache.service;

import com.querycache.cache.QueryPlanCache;
import com.querycache.metrics.CacheMetrics;
import com.querycache.model.QueryPlan;
import com.querycache.parser.SQLiteParserService;

import java.util.UUID;

public class QueryService {
    
    private final QueryPlanCache cache;
    private final CacheMetrics metrics;
    private final SQLiteParserService parserService;
    private boolean lastAccessWasHit = false;
    
    private static final int PLAN_GEN_BASE_TIME = 45;
    
    public QueryService() {
        this.cache = new QueryPlanCache();
        this.metrics = new CacheMetrics();
        this.parserService = new SQLiteParserService();
        parserService.setDebug(false);  // turn off parser debug output
    }
    
    public void setCacheEnabled(boolean enabled) { cache.setEnabled(enabled); }
    public void clearCache() { cache.clear(); metrics.reset(); }
    public void notifySchemaChange(String tableName) { cache.notifySchemaChange(tableName); }
    public boolean getLastAccessWasHit() { return lastAccessWasHit; }
    public QueryPlanCache getCache() { return cache; }
    public CacheMetrics getMetrics() { return metrics; }
    
    public QueryPlan execute(String query) {
        long startTime = System.currentTimeMillis();
        
        String normalizedQuery = parserService.normalizeQuery(query);
        QueryPlan plan = cache.get(normalizedQuery);
        
        if (plan != null && cache.isValid(normalizedQuery, plan)) {
            // CACHE HIT
            lastAccessWasHit = true;
            plan.incrementAccessCount();
            long executionTime = System.currentTimeMillis() - startTime;
            metrics.recordHit(executionTime);
            plan.setLastExecutionTime(executionTime);
            return plan;
        }
        
        // CACHE MISS or INVALID
        lastAccessWasHit = false;
        
        if (plan != null && !cache.isValid(normalizedQuery, plan)) {
            cache.evict(normalizedQuery);
        }
        
        // Simulate plan generation (no timing recorded)
        try {
            Thread.sleep(PLAN_GEN_BASE_TIME + (int)(Math.random() * 20));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        String planId = UUID.randomUUID().toString();
        double estimatedCost = calculateEstimatedCost(query);
        plan = new QueryPlan(planId, normalizedQuery, 0, estimatedCost); 
        
        extractTables(query, plan);
        cache.put(normalizedQuery, plan);
        
        long executionTime = System.currentTimeMillis() - startTime;
        metrics.recordMiss(executionTime);
        plan.setLastExecutionTime(executionTime);
        
        return plan;
    }
    
    private double calculateEstimatedCost(String query) {
        double cost = 10.0;
        String lowerQuery = query.toLowerCase();
        if (lowerQuery.contains("where")) cost += 5.0;
        if (lowerQuery.contains("join")) cost += 25.0;
        if (lowerQuery.contains("order by")) cost += 8.0;
        if (lowerQuery.contains("group by")) cost += 15.0;
        if (lowerQuery.contains("subquery")) cost += 30.0;
        if (lowerQuery.contains("distinct")) cost += 12.0;
        if (lowerQuery.contains("orders")) cost += 20.0;
        if (lowerQuery.contains("products")) cost += 15.0;
        if (lowerQuery.contains("users")) cost += 10.0;
        return Math.round(cost * 100.0) / 100.0;
    }
    
    private void extractTables(String query, QueryPlan plan) {
        String lowerQuery = query.toLowerCase();
        if (lowerQuery.contains("orders")) plan.addTableAccessed("orders");
        if (lowerQuery.contains("products")) plan.addTableAccessed("products");
        if (lowerQuery.contains("users")) plan.addTableAccessed("users");
        if (lowerQuery.contains("customers")) plan.addTableAccessed("customers");
    }
}