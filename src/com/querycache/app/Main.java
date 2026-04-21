package com.querycache.app;

import com.querycache.metrics.CacheMetrics;
import com.querycache.service.QueryService;
import java.util.*;

/**
 * Main Application - Demonstrates Query Plan Caching with 3 Scenarios
 * 
 * This class shows:
 * 1. Performance WITHOUT caching (baseline)
 * 2. Performance WITH caching (benefits)
 * 3. Cache invalidation when schema changes
 * 
 * Key Concepts Demonstrated:
 * - Query normalization (different values use same plan)
 * - Cache hit ratio improvement
 * - Schema change detection and cache invalidation
 */
public class Main {
    
    // ========== TEST DATA ==========
    private static final String[] TEST_QUERIES = {
        "SELECT * FROM orders WHERE customer_id = 101",
        "SELECT * FROM orders WHERE customer_id = 202",
        "SELECT * FROM orders WHERE customer_id = 303",
        "SELECT * FROM products WHERE price > 100",
        "SELECT * FROM products WHERE price < 50",
        "SELECT * FROM users WHERE name = 'John'",
        "SELECT * FROM users WHERE email = 'test@example.com'",
        "SELECT * FROM orders WHERE status = 'active'"
    };
    
    private static final String[] QUERY_PATTERNS = {
        "Orders by customer_id (Pattern 1)",
        "Orders by customer_id (Pattern 1 - same)",
        "Orders by customer_id (Pattern 1 - same)",
        "Products by price > (Pattern 2)",
        "Products by price < (Pattern 3 - different)",
        "Users by name (Pattern 4)",
        "Users by email (Pattern 5 - different)",
        "Orders by status (Pattern 6)"
    };
    
    private static void printSeparator() {
        System.out.println(String.join("", Collections.nCopies(80, "─")));
    }
    
    private static void printDoubleSeparator() {
        System.out.println(String.join("", Collections.nCopies(80, "=")));
    }
    
    public static void main(String[] args) {
        printDoubleSeparator();
        System.out.println("🚀 QUERY PLAN CACHE DEMO - 3 SCENARIOS");
        printDoubleSeparator();
        
        printTestQueries();
        
        runWithoutCache();
        runWithCache();
        runWithSchemaChange();
        
        printFinalSummary();
    }
    
    private static void printTestQueries() {
        System.out.println("\n📋 TEST QUERIES (Same across all scenarios): \n");
        printSeparator();
        System.out.println();
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            System.out.printf("  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n \n", QUERY_PATTERNS[i]);
        }
        printSeparator();
    }
    
    // ========== SCENARIO 1: WITHOUT CACHE ==========
    private static void runWithoutCache() {
        System.out.println("\n📌 SCENARIO 1: WITHOUT CACHE (Baseline) \n");
        printSeparator();
        System.out.println("\n⚙️  Mode: Cache DISABLED");
        System.out.println("📝 Behavior: Generate execution plan for EVERY query \n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(false);
        
        long startTime = System.currentTimeMillis();
        List<QueryExecution> executions = new ArrayList<>();
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long queryStart = System.nanoTime();
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
            
            executions.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                             false, queryTime, plan.getPlanId(), 
                                             plan.getEstimatedCost()));
            
            System.out.printf("\n\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      	Pattern: %s%n", QUERY_PATTERNS[i]);
            System.out.printf("\n      🔄 Generated new plan (cache disabled)%n");
            System.out.printf("      📊 Plan ID: %-8s | Cost: %6.2f | Time: %3d ms%n \n", 
                    plan.getPlanId().substring(0, 8), plan.getEstimatedCost(), queryTime);
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\n 📊 SCENARIO 1 METRICS: \n");
        System.out.printf("  • Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  • Total Queries: %d%n", TEST_QUERIES.length);
        System.out.printf("  • Plans Generated: %d (100%%)%n", TEST_QUERIES.length);
        System.out.printf("  • Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        printSeparator();
        
        DemoStats.baselineTime = totalTime;
        DemoStats.baselineAvgTime = (double)totalTime / TEST_QUERIES.length;
        DemoStats.baselineExecutions = executions;
    }
    
    // ========== SCENARIO 2: WITH CACHE ==========
    private static void runWithCache() {
        System.out.println("\n📌 SCENARIO 2: WITH CACHE (Normal Operation) \n");
        printSeparator();
        System.out.println("\n⚙️  Mode: Cache ENABLED");
        System.out.println("📝 Behavior: Reuse cached plans for identical patterns \n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        long startTime = System.currentTimeMillis();
        int misses = 0, hits = 0;
        List<QueryExecution> executions = new ArrayList<>();
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long queryStart = System.nanoTime();
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
            
            boolean isHit = service.getLastAccessWasHit();
            if (isHit) hits++; else misses++;
            
            executions.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                             isHit, queryTime, plan.getPlanId(), 
                                             plan.getEstimatedCost()));
            
            System.out.printf("\n\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            if (isHit) {
                System.out.printf("\n      ✅ CACHE HIT - Reused plan (Accessed %d times)%n", plan.getAccessCount());
            } else {
                System.out.printf("\n      ❌ CACHE MISS - Generated new plan%n");
            }
            System.out.printf("      📊 Plan ID: %-8s | Cost: %6.2f | Time: %3d ms%n \n", 
                    plan.getPlanId().substring(0, 8), plan.getEstimatedCost(), queryTime);
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\n 📊 SCENARIO 2 METRICS: \n");
        System.out.printf("  • Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  • Cache Hits: %d | Cache Misses: %d%n", hits, misses);
        System.out.printf("  • Hit Ratio: %.1f%% | Miss Ratio: %.1f%%%n", 
                          (hits * 100.0 / TEST_QUERIES.length),
                          (misses * 100.0 / TEST_QUERIES.length));
        System.out.printf("  • Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        
        System.out.println("\n  📦 Cache Contents:");
        var cache = service.getCache();
        System.out.printf("    • Total cached plans: %d%n", cache.getSize());
        printSeparator();
        
        DemoStats.cacheTime = totalTime;
        DemoStats.cacheHits = hits;
        DemoStats.cacheMisses = misses;
        DemoStats.cacheAvgTime = (double)totalTime / TEST_QUERIES.length;
        DemoStats.cacheExecutions = executions;
    }
    
    // ========== SCENARIO 3: SCHEMA CHANGE ==========
    private static void runWithSchemaChange() {
        System.out.println("\n📌 SCENARIO 3: SCHEMA CHANGE (Cache Invalidation) \n");
        printSeparator();
        System.out.println("\n⚙️  Mode: Cache ENABLED + Schema Change");
        System.out.println("📝 Behavior: Cache invalidated when schema changes \n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        // ===== PHASE A: Populate cache =====
        System.out.println("\n  🟢 PHASE A: First execution (populating cache)");
        System.out.println("  ───────────────────────────────────────────── \n");
        
        List<QueryExecution> phaseA = new ArrayList<>();
        long phaseAStart = System.currentTimeMillis();
        
        for (int i = 0; i < 3; i++) {
            long queryStart = System.nanoTime();
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
            boolean isHit = service.getLastAccessWasHit();
            
            phaseA.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                         isHit, queryTime, plan.getPlanId(), 
                                         plan.getEstimatedCost()));
            
            System.out.printf("    Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("        → %s | Plan: %s | Time: %d ms%n%n",
                    isHit ? "HIT" : "MISS (cached)",
                    plan.getPlanId().substring(0, 8),
                    queryTime);
        }
        
        long phaseATime = System.currentTimeMillis() - phaseAStart;
        int phaseAHits = (int) phaseA.stream().filter(e -> e.isHit).count();
        
        System.out.println("\n    📊 Phase A Metrics (Before Schema Change):");
        System.out.printf("      • Total Time: %d ms%n", phaseATime);
        System.out.printf("      • Cache Hits: %d | Misses: %d%n", phaseAHits, 3 - phaseAHits);
        System.out.printf("      • Hit Ratio: %.1f%%%n", (phaseAHits * 100.0 / 3));
        System.out.printf("      • Avg Query Time: %.2f ms%n", (double)phaseATime / 3);
        
        // ===== SCHEMA CHANGE =====
        System.out.println("\n  🔄 SCHEMA CHANGE DETECTED!");
        System.out.println("  ─────────────────────────────────────────────");
        System.out.println("  📝 ALTER TABLE orders ADD COLUMN discount DECIMAL(5,2)");
        
        long invalidateStart = System.nanoTime();
        service.notifySchemaChange("orders");
        long invalidateTime = (System.nanoTime() - invalidateStart) / 1_000_000;
        
        System.out.printf("  ⚡ Cache invalidation completed in %d ms%n", invalidateTime);
        
        // ===== PHASE B: After schema change =====
        System.out.println("\n  🟡 PHASE B: Execute queries AFTER schema change");
        System.out.println("  ─────────────────────────────────────────────");
        System.out.println("  NOTE: Cache invalidated for 'orders' table\n");
        
        List<QueryExecution> phaseB = new ArrayList<>();
        long phaseBStart = System.currentTimeMillis();
        int regeneratedPlans = 0;
        
        for (int i = 0; i < 3; i++) {
            long queryStart = System.nanoTime();
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
            boolean isHit = service.getLastAccessWasHit();
            
            phaseB.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                         isHit, queryTime, plan.getPlanId(), 
                                         plan.getEstimatedCost()));
            
            if (!isHit) regeneratedPlans++;
            
            System.out.printf("    Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            if (isHit) {
                System.out.printf("        → ✅ HIT (Cached plan reused) | Plan: %s | Time: %d ms%n%n",
                                plan.getPlanId().substring(0, 8), queryTime);
            } else {
                System.out.printf("        → 🔄 MISS (Regenerated with new schema) | Plan: %s | Time: %d ms%n%n",
                                plan.getPlanId().substring(0, 8), queryTime);
            }
        }
        
        long phaseBTime = System.currentTimeMillis() - phaseBStart;
        int phaseBHits = (int) phaseB.stream().filter(e -> e.isHit).count();
        
        System.out.println("\n    📊 Phase B Metrics (After Schema Change):");
        System.out.printf("      • Total Time: %d ms%n", phaseBTime);
        System.out.printf("      • Cache Hits: %d | Misses: %d%n", phaseBHits, 3 - phaseBHits);
        System.out.printf("      • Hit Ratio: %.1f%%%n", (phaseBHits * 100.0 / 3));
        System.out.printf("      • Plans Regenerated: %d%n", regeneratedPlans);
        System.out.printf("      • Avg Query Time: %.2f ms%n", (double)phaseBTime / 3);
        
        // ===== PHASE C: New pattern =====
        System.out.println("\n  🟢 PHASE C: Execute NEW query pattern (different value)");
        System.out.println("  ─────────────────────────────────────────────");
        String newQuery = "SELECT * FROM orders WHERE customer_id = 999";
        long queryStart = System.nanoTime();
        var plan = service.execute(newQuery);
        long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
        boolean isHit = service.getLastAccessWasHit();
        
        System.out.printf("    Query: %s%n", newQuery);
        System.out.printf("        → %s | Plan: %s | Time: %d ms%n", 
                isHit ? "✅ HIT (Pattern already cached)" : "❌ MISS (New pattern cached)",
                plan.getPlanId().substring(0, 8), queryTime);
        
        System.out.println();
        printSeparator();
        System.out.println("📊 SCHEMA CHANGE IMPACT ANALYSIS");
        printSeparator();
        System.out.println("  Impact on cache effectiveness:");
        System.out.printf("    • Hit ratio BEFORE schema change: %.1f%%%n", (phaseAHits * 100.0 / 3));
        System.out.printf("    • Hit ratio AFTER schema change: %.1f%%%n", (phaseBHits * 100.0 / 3));
        System.out.printf("    • Hit ratio degradation: %.1f%% (intentional invalidation)%n", 
                         ((phaseAHits * 100.0 / 3) - (phaseBHits * 100.0 / 3)));
        System.out.printf("    • Cache invalidation time: %d ms%n", invalidateTime);
        System.out.printf("    • Plans regenerated: %d%n", regeneratedPlans);
        
        System.out.println("\n  ✅ Why this is CORRECT behavior:");
        System.out.println("    1. Schema changes require cache invalidation for affected tables");
        System.out.println("    2. Stale execution plans could produce wrong results");
        System.out.println("    3. New plans are generated with the updated schema");
        System.out.println("    4. Cache gradually warms up again with new plans");
        printSeparator();
        
        DemoStats.schemaChangeBeforeHitRatio = (phaseAHits * 100.0 / 3);
        DemoStats.schemaChangeAfterHitRatio = (phaseBHits * 100.0 / 3);
        DemoStats.schemaChangeRegeneratedPlans = regeneratedPlans;
        DemoStats.schemaChangeInvalidationTime = invalidateTime;
    }
    
    // ========== FINAL SUMMARY ==========
    private static void printFinalSummary() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("📊 FINAL PERFORMANCE COMPARISON");
        System.out.println("=".repeat(80));
        
        System.out.println("\n📈 CACHE PERFORMANCE (Fair Comparison):");
        System.out.println("   Comparing: WITHOUT CACHE vs WITH CACHE");
        System.out.println("   (Both scenarios use same queries with no schema changes)\n");
        
        System.out.printf("%-35s %15s %20s %15s %15s%n", 
                         "Scenario", "Total Time", "Avg Time/Query", "Hit Ratio", "Speedup");
        System.out.println("─".repeat(95));
        
        double improvement = ((DemoStats.baselineTime - DemoStats.cacheTime) * 100.0) / DemoStats.baselineTime;
        double speedup = (double)DemoStats.baselineTime / DemoStats.cacheTime;
        
        System.out.printf("%-35s %10d ms %15.2f ms %14s %14.1fx%n", 
                         "1. WITHOUT CACHE", 
                         DemoStats.baselineTime, 
                         DemoStats.baselineAvgTime,
                         "N/A",
                         1.0);
        
        System.out.printf("%-35s %10d ms %15.2f ms %13.1f%% %14.1fx%n", 
                         "2. WITH CACHE", 
                         DemoStats.cacheTime, 
                         DemoStats.cacheAvgTime,
                         (DemoStats.cacheHits * 100.0 / TEST_QUERIES.length),
                         speedup);
        
        System.out.println("─".repeat(95));
        System.out.printf("📈 PERFORMANCE IMPROVEMENT: %.1f%% faster with cache%n", improvement);
        System.out.printf("⚡ SPEEDUP FACTOR: %.1fx (%.1f ms saved per query on average)%n", 
                         speedup, (DemoStats.baselineAvgTime - DemoStats.cacheAvgTime));
        System.out.printf("✅ CACHE EFFICIENCY: %.1f%% hit rate across %d queries%n", 
                         (DemoStats.cacheHits * 100.0 / TEST_QUERIES.length),
                         TEST_QUERIES.length);
        
        System.out.println("\n  📊 Per-Query Breakdown (Scenario 1 vs 2):");
        System.out.printf("  %-4s %-45s %-15s %-15s%n", "Q#", "Query Pattern", "No Cache (ms)", "With Cache (ms)");
        System.out.println("  ───────────────────────────────────────────────────────────────────────────────");
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long noCacheTime = DemoStats.baselineExecutions.get(i).executionTime;
            long withCacheTime = DemoStats.cacheExecutions.get(i).executionTime;
            String hitStatus = DemoStats.cacheExecutions.get(i).isHit ? "✅ HIT" : "❌ MISS";
            
            String pattern = QUERY_PATTERNS[i];
            if (pattern.length() > 43) pattern = pattern.substring(0, 40) + "...";
            
            System.out.printf("  %-4d %-45s %-15d %-15d %s%n", 
                             (i+1), pattern, noCacheTime, withCacheTime, hitStatus);
        }
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("🔄 SCHEMA CHANGE IMPACT (Separate Analysis)");
        System.out.println("=".repeat(80));
        System.out.println("  NOTE: Schema change metrics are shown separately because");
        System.out.println("  comparing them with normal cache operation would be unfair.\n");
        
        System.out.println("  Impact of schema change on cache effectiveness:");
        System.out.printf("    • Hit ratio BEFORE schema change: %.1f%%%n", DemoStats.schemaChangeBeforeHitRatio);
        System.out.printf("    • Hit ratio AFTER schema change: %.1f%%%n", DemoStats.schemaChangeAfterHitRatio);
        System.out.printf("    • Hit ratio degradation: %.1f%% (intentional cache invalidation)%n", 
                         (DemoStats.schemaChangeBeforeHitRatio - DemoStats.schemaChangeAfterHitRatio));
        System.out.printf("    • Cache invalidation time: %d ms%n", DemoStats.schemaChangeInvalidationTime);
        System.out.printf("    • Plans regenerated after schema change: %d%n", DemoStats.schemaChangeRegeneratedPlans);
        
        System.out.println("\n  ✅ Why this is CORRECT behavior:");
        System.out.println("    1. Schema changes require cache invalidation for affected tables");
        System.out.println("    2. Stale execution plans could produce wrong results");
        System.out.println("    3. New plans are generated with the updated schema");
        System.out.println("    4. Cache gradually warms up again with new plans");
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("🎯 KEY TAKEAWAYS");
        System.out.println("=".repeat(80));
        System.out.println("  1. Query plan caching provides significant performance improvement");
        System.out.println("  2. Pattern-based normalization enables reuse across different literal values");
        System.out.println("  3. Schema changes correctly invalidate affected cache entries");
        System.out.println("  4. Cache hit ratio directly correlates with performance gain");
        System.out.println("  5. Temporary performance dip after schema change is expected and acceptable");
        System.out.println("=".repeat(80));
    }
    
    // ========== HELPER CLASSES ==========
    static class QueryExecution {
        int queryNum;
        String query;
        String pattern;
        boolean isHit;
        long executionTime;
        String planId;
        double cost;
        
        QueryExecution(int queryNum, String query, String pattern, boolean isHit, 
                      long executionTime, String planId, double cost) {
            this.queryNum = queryNum;
            this.query = query;
            this.pattern = pattern;
            this.isHit = isHit;
            this.executionTime = executionTime;
            this.planId = planId;
            this.cost = cost;
        }
    }
    
    static class DemoStats {
        static long baselineTime = 0;
        static double baselineAvgTime = 0;
        static List<QueryExecution> baselineExecutions = new ArrayList<>();
        
        static long cacheTime = 0;
        static double cacheAvgTime = 0;
        static int cacheHits = 0;
        static int cacheMisses = 0;
        static List<QueryExecution> cacheExecutions = new ArrayList<>();
        
        static double schemaChangeBeforeHitRatio = 0;
        static double schemaChangeAfterHitRatio = 0;
        static int schemaChangeRegeneratedPlans = 0;
        static long schemaChangeInvalidationTime = 0;
    }
}