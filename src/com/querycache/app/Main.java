package com.querycache.app;

import com.querycache.metrics.CacheMetrics;
import com.querycache.parser.SQLiteParserService;
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
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
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
        System.out.println("QUERY PLAN CACHE DEMO - 3 SCENARIOS");
        printDoubleSeparator();
        
        printTestQueries();
        
        printTokenAndParseTreeOnce();  // Print tokens and parse tree for first query (once)
        
        runWithoutCache();
        runWithCache();
        runWithSchemaChange();
        
        printFinalSummary();
    }
    
    private static void printTestQueries() {
        System.out.println("\nTEST QUERIES (Same across all scenarios): \n");
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
        System.out.println("\nSCENARIO 1: WITHOUT CACHE (Baseline) \n");
        printSeparator();
        System.out.println("\nMode: Cache DISABLED");
        System.out.println("Behavior: Generate execution plan for EVERY query \n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(false);
        
        long startTime = System.currentTimeMillis();
        List<QueryExecution> executions = new ArrayList<>();
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long queryStart = System.nanoTime();
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
            
            // FIXED: Added normalizedQuery parameter
            executions.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                             false, queryTime, plan.getPlanId(), 
                                             plan.getEstimatedCost(), plan.getNormalizedQuery()));
            
            System.out.printf("\n\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            System.out.printf("\n      Generated new plan (cache disabled)%n");
            System.out.printf("      Plan ID: %-8s | Cost: %6.2f | Time: %3d ms%n", 
                    plan.getPlanId().substring(0, 8), plan.getEstimatedCost(), queryTime);
            System.out.printf("      Normalized: %s%n", plan.getNormalizedQuery());
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\nSCENARIO 1 METRICS: \n");
        System.out.printf("  - Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  - Total Queries: %d%n", TEST_QUERIES.length);
        System.out.printf("  - Plans Generated: %d (100%%)%n", TEST_QUERIES.length);
        System.out.printf("  - Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        printSeparator();
        
        DemoStats.baselineTime = totalTime;
        DemoStats.baselineAvgTime = (double)totalTime / TEST_QUERIES.length;
        DemoStats.baselineExecutions = executions;
    }
    
    // ========== SCENARIO 2: WITH CACHE ==========
    private static void runWithCache() {
        System.out.println("\nSCENARIO 2: WITH CACHE (Normal Operation) \n");
        printSeparator();
        System.out.println("\nMode: Cache ENABLED");
        System.out.println("Behavior: Reuse cached plans for identical patterns \n");
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
            
            // FIXED: Added normalizedQuery parameter
            executions.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                             isHit, queryTime, plan.getPlanId(), 
                                             plan.getEstimatedCost(), plan.getNormalizedQuery()));
            
            System.out.printf("\n\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            if (isHit) {
                System.out.printf("\n      CACHE HIT - Reused plan (Accessed %d times)%n", plan.getAccessCount());
            } else {
                System.out.printf("\n      CACHE MISS - Generated new plan%n");
            }
            System.out.printf("      Plan ID: %-8s | Cost: %6.2f | Time: %3d ms%n", 
                    plan.getPlanId().substring(0, 8), plan.getEstimatedCost(), queryTime);
            System.out.printf("      Normalized: %s%n", plan.getNormalizedQuery());
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\nSCENARIO 2 METRICS: \n");
        System.out.printf("  - Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  - Cache Hits: %d | Cache Misses: %d%n", hits, misses);
        System.out.printf("  - Hit Ratio: %.1f%% | Miss Ratio: %.1f%%%n", 
                          (hits * 100.0 / TEST_QUERIES.length),
                          (misses * 100.0 / TEST_QUERIES.length));
        System.out.printf("  - Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        
        System.out.println("\n  Cache Contents:");
        var cache = service.getCache();
        System.out.printf("    - Total cached plans: %d%n", cache.getSize());
        printSeparator();
        
        DemoStats.cacheTime = totalTime;
        DemoStats.cacheHits = hits;
        DemoStats.cacheMisses = misses;
        DemoStats.cacheAvgTime = (double)totalTime / TEST_QUERIES.length;
        DemoStats.cacheExecutions = executions;
    }
    
    // ========== SCENARIO 3: SCHEMA CHANGE (UPDATED WITH VALIDATION) ==========
    private static void runWithSchemaChange() {
        System.out.println("\nSCENARIO 3: SCHEMA CHANGE (Cache Invalidation) \n");
        printSeparator();
        System.out.println("\nMode: Cache ENABLED + Schema Change");
        System.out.println("Behavior: Cache invalidated when schema changes \n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        String testQuery = "SELECT * FROM orders WHERE customer_id = 100";
        
        // Track validation results
        boolean phase1Correct = false;
        boolean phase2Correct = false;
        boolean phase4Correct = false;
        boolean phase5Correct = false;
        boolean invalidationCorrect = false;
        
        // PHASE 1: First execution - cache miss (cache is empty)
        System.out.println("\n  PHASE 1: First execution (cache miss)");
        System.out.println("  -------------------------------------\n");
        
        long start1 = System.nanoTime();
        var plan1 = service.execute(testQuery);
        long time1 = (System.nanoTime() - start1) / 1_000_000;
        
        boolean isHit1 = service.getLastAccessWasHit();
        System.out.printf("    Query: %s%n", testQuery);
        if (isHit1) {
            System.out.printf("      -> HIT (Unexpected - cache should be empty!) | Plan: %s | Time: %d ms%n", 
                             plan1.getPlanId().substring(0, 8), time1);
        } else {
            System.out.printf("      -> MISS (Plan generated as expected) | Plan: %s | Time: %d ms%n", 
                             plan1.getPlanId().substring(0, 8), time1);
        }
        System.out.printf("      Normalized: %s%n\n", plan1.getNormalizedQuery());
        
        phase1Correct = !isHit1;  // Should be MISS on first execution
        
        // PHASE 2: Second execution - should be cache hit (plan reused)
        System.out.println("  PHASE 2: Second execution (should be cache hit)");
        System.out.println("  ---------------------------------------------\n");
        
        long start2 = System.nanoTime();
        var plan2 = service.execute(testQuery);
        long time2 = (System.nanoTime() - start2) / 1_000_000;
        
        boolean isHit2 = service.getLastAccessWasHit();
        if (isHit2) {
            System.out.printf("    Query: %s%n", testQuery);
            System.out.printf("      -> HIT (Cached plan reused correctly) | Plan: %s | Time: %d ms%n", 
                             plan2.getPlanId().substring(0, 8), time2);
        } else {
            System.out.printf("    Query: %s%n", testQuery);
            System.out.printf("      -> MISS (ERROR - Should have been a cache hit!) | Plan: %s | Time: %d ms%n", 
                             plan2.getPlanId().substring(0, 8), time2);
        }
        System.out.printf("      Normalized: %s%n\n", plan2.getNormalizedQuery());
        
        phase2Correct = isHit2;  // Should be HIT on second execution
        
        // Verify plan1 and plan2 have same ID (cache reuse)
        boolean samePlanBefore = plan1.getPlanId().equals(plan2.getPlanId());
        if (!samePlanBefore) {
            System.out.println("  WARNING: Plans differ before schema change - cache not working properly!");
        }
        
        // PHASE 3: Simulate schema change
        System.out.println("  PHASE 3: Schema change detected");
        System.out.println("  -------------------------------");
        System.out.println("  ALTER TABLE orders ADD COLUMN discount DECIMAL(5,2)\n");
        
        long invalidateStart = System.nanoTime();
        service.notifySchemaChange("orders");
        long invalidateTime = (System.nanoTime() - invalidateStart) / 1_000_000;
        
        System.out.printf("  Cache invalidated in %d ms%n", invalidateTime);
        System.out.printf("  Cache size after invalidation: %d%n\n", service.getCache().getSize());
        
        // Verify cache was actually cleared
        boolean cacheCleared = (service.getCache().getSize() == 0);
        if (cacheCleared) {
            System.out.println("  SUCCESS: Cache cleared correctly");
        } else {
            System.out.println("  ERROR: Cache not cleared after schema change!");
        }
        System.out.println();
        
        // PHASE 4: Execute after schema change - should be cache miss
        System.out.println("  PHASE 4: Execute after schema change (should be cache miss)");
        System.out.println("  ----------------------------------------------------------\n");
        
        long start3 = System.nanoTime();
        var plan3 = service.execute(testQuery);
        long time3 = (System.nanoTime() - start3) / 1_000_000;
        
        boolean isHit3 = service.getLastAccessWasHit();
        System.out.printf("    Query: %s%n", testQuery);
        if (isHit3) {
            System.out.printf("      -> HIT (ERROR - Should have been a miss after invalidation!) | Plan: %s | Time: %d ms%n", 
                             plan3.getPlanId().substring(0, 8), time3);
        } else {
            System.out.printf("      -> MISS (Correct - regenerated with new schema) | Plan: %s | Time: %d ms%n", 
                             plan3.getPlanId().substring(0, 8), time3);
        }
        System.out.printf("      Normalized: %s%n\n", plan3.getNormalizedQuery());
        
        phase4Correct = !isHit3;  // Should be MISS after invalidation
        
        // Check if plan regenerated with NEW ID
        invalidationCorrect = !plan1.getPlanId().equals(plan3.getPlanId());
        if (invalidationCorrect) {
            System.out.println("  SUCCESS: Plan regenerated with NEW ID (different from before)");
            System.out.printf("    Old Plan ID: %s%n", plan1.getPlanId().substring(0, 8));
            System.out.printf("    New Plan ID: %s%n\n", plan3.getPlanId().substring(0, 8));
        } else {
            System.out.println("  ERROR: Plan ID is same as before - not regenerated!");
            System.out.printf("    Plan ID (same): %s%n\n", plan1.getPlanId().substring(0, 8));
        }
        
        // PHASE 5: Execute again after rebuild - should be cache hit
        System.out.println("  PHASE 5: Execute again after rebuild (should be cache hit)");
        System.out.println("  ---------------------------------------------------------\n");
        
        long start4 = System.nanoTime();
        var plan4 = service.execute(testQuery);
        long time4 = (System.nanoTime() - start4) / 1_000_000;
        
        boolean isHit4 = service.getLastAccessWasHit();
        if (isHit4) {
            System.out.printf("    Query: %s%n", testQuery);
            System.out.printf("      -> HIT (New cached plan reused correctly) | Plan: %s | Time: %d ms%n", 
                             plan4.getPlanId().substring(0, 8), time4);
        } else {
            System.out.printf("    Query: %s%n", testQuery);
            System.out.printf("      -> MISS (ERROR - Should have been a cache hit after rebuild!) | Plan: %s | Time: %d ms%n", 
                             plan4.getPlanId().substring(0, 8), time4);
        }
        System.out.printf("      Normalized: %s%n\n", plan4.getNormalizedQuery());
        
        phase5Correct = isHit4;  // Should be HIT after rebuild
        
        // Verify plan3 and plan4 have same ID
        boolean samePlanAfter = plan3.getPlanId().equals(plan4.getPlanId());
        if (!samePlanAfter) {
            System.out.println("  WARNING: Plans differ after rebuild - cache not storing new plans properly!");
        }
        
        printSeparator();
        System.out.println("\nSCHEMA CHANGE IMPACT ANALYSIS\n");
        System.out.printf("  - Plan regenerated with new ID: %s%n", invalidationCorrect ? "YES" : "NO");
        System.out.printf("  - Cache invalidation time: %d ms%n", invalidateTime);
        System.out.printf("  - Time before schema change: %d ms %s%n", time2, isHit2 ? "(HIT)" : "(MISS)");
        System.out.printf("  - Time after schema change: %d ms %s%n", time3, !isHit3 ? "(MISS - rebuild)" : "(HIT - ERROR)");
        System.out.printf("  - Time after rebuild: %d ms %s%n", time4, isHit4 ? "(HIT)" : "(MISS - ERROR)");
        
        System.out.println("\n  Cache Invalidation Logic:");
        System.out.println("    1. Schema changes require cache invalidation for affected tables");
        System.out.println("    2. Stale execution plans could produce wrong results");
        System.out.println("    3. New plans are generated with the updated schema");
        System.out.println("    4. Cache gradually warms up again with new plans");
        printSeparator();
        
        // VALIDATION RESULTS
        System.out.println("\n  VALIDATION RESULTS:");
        System.out.println("  -------------------");
        System.out.printf("  Phase 1 (First exec): %s (Expected: MISS)%n", 
                         phase1Correct ? "PASSED" : "FAILED");
        System.out.printf("  Phase 2 (Second exec): %s (Expected: HIT)%n", 
                         phase2Correct ? "PASSED" : "FAILED");
        
        System.out.printf("  Phase 4 (After schema change): %s (Expected: MISS)%n", 
                         phase4Correct ? "PASSED" : "FAILED");
        System.out.printf("  Phase 5 (After rebuild): %s (Expected: HIT)%n", 
                         phase5Correct ? "PASSED" : "FAILED");
        System.out.printf("  Plan Regeneration: %s (Expected: Different Plan ID)%n", 
                         invalidationCorrect ? "PASSED" : "FAILED");
        
        // Update test counters
        if (phase1Correct && phase2Correct && phase4Correct && phase5Correct && invalidationCorrect && cacheCleared) {
            System.out.println("\n  OVERALL: PASSED - Schema change correctly invalidated cache");
            testsPassed++;
        } else {
            System.out.println("\n  OVERALL: FAILED - Cache invalidation not working correctly");
            testsFailed++;
        }
        
        DemoStats.schemaChangeInvalidationTime = invalidateTime;
        DemoStats.schemaChangeRegenerated = invalidationCorrect;
    }
    
    // ========== FINAL SUMMARY WITH TEST TRACKING ==========
    private static void printFinalSummary() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("FINAL PERFORMANCE COMPARISON");
        System.out.println("=".repeat(80));
        
        System.out.println("\nCACHE PERFORMANCE (Fair Comparison):");
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
        System.out.printf("PERFORMANCE IMPROVEMENT: %.1f%% faster with cache%n", improvement);
        System.out.printf("SPEEDUP FACTOR: %.1fx (%.1f ms saved per query on average)%n", 
                         speedup, (DemoStats.baselineAvgTime - DemoStats.cacheAvgTime));
        System.out.printf("CACHE EFFICIENCY: %.1f%% hit rate across %d queries%n", 
                         (DemoStats.cacheHits * 100.0 / TEST_QUERIES.length),
                         TEST_QUERIES.length);
        
        System.out.println("\n  Per-Query Breakdown (Scenario 1 vs 2):");
        System.out.printf("  %-4s %-45s %-15s %-15s %-10s%n", "Q#", "Query Pattern", "No Cache (ms)", "With Cache (ms)", "Status");
        System.out.println("  -------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long noCacheTime = DemoStats.baselineExecutions.get(i).executionTime;
            long withCacheTime = DemoStats.cacheExecutions.get(i).executionTime;
            String hitStatus = DemoStats.cacheExecutions.get(i).isHit ? "HIT" : "MISS";
            
            String pattern = QUERY_PATTERNS[i];
            if (pattern.length() > 43) pattern = pattern.substring(0, 40) + "...";
            
            System.out.printf("  %-4d %-45s %-15d %-15d %-10s%n", 
                             (i+1), pattern, noCacheTime, withCacheTime, hitStatus);
        }
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("TEST SUMMARY");
        System.out.println("=".repeat(80));
        System.out.printf("Tests Passed: %d%n", testsPassed);
        System.out.printf("Tests Failed: %d%n", testsFailed);
        System.out.printf("Success Rate: %.1f%%%n", 
                         (testsPassed * 100.0 / (testsPassed + testsFailed)));
        System.out.println("=".repeat(80));
        
        System.out.println("\nKEY TAKEAWAYS:");
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
        String normalizedQuery;
        
        // FIXED: Constructor with all 8 parameters including normalizedQuery
        QueryExecution(int queryNum, String query, String pattern, boolean isHit, 
                      long executionTime, String planId, double cost, String normalizedQuery) {
            this.queryNum = queryNum;
            this.query = query;
            this.pattern = pattern;
            this.isHit = isHit;
            this.executionTime = executionTime;
            this.planId = planId;
            this.cost = cost;
            this.normalizedQuery = normalizedQuery;
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
        
        static long schemaChangeInvalidationTime = 0;
        static boolean schemaChangeRegenerated = false;
    }
    
    /**
     * Print lexer tokens and parse tree for the first query
     * This is a one-time setup before performance measurement
     */
    private static void printTokenAndParseTreeOnce() {
        System.out.println("\nTOKENS & PARSE TREE (First query only)\n");
        printSeparator();
        
        SQLiteParserService parser = new SQLiteParserService();
        parser.setDebug(true);
        parser.normalizeQuery(TEST_QUERIES[0]);
        parser.setDebug(false);
        
        System.out.println("\nReady for performance tests\n");
        printSeparator();
    }
}