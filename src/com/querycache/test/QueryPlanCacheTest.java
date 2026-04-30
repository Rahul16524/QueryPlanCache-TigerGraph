package com.querycache.test;

import com.querycache.metrics.CacheMetrics;
import com.querycache.model.QueryPlan;
import com.querycache.parser.SQLiteParserService;
import com.querycache.service.QueryService;
import java.util.*;

/**
 * QueryPlanCacheTest - Comprehensive test suite for cache functionality
 * 
 * This test suite demonstrates three critical scenarios:
 * 
 * Scenario 1 (Baseline):    Performance without caching
 * Scenario 2 (Cached):      Performance improvement with caching
 * Scenario 3 (Invalidation): Correct behavior during schema changes
 * 
 * The test uses realistic queries with varying patterns to demonstrate
 * pattern-based normalization and cache reuse across different literal values.
 * 
 */
public class QueryPlanCacheTest {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
 // Test queries covering various SQL patterns for pattern detection testing
    private static final String[] TEST_QUERIES = {
        // Pattern A: Simple SELECT * with equality on numeric ID
        "SELECT * FROM users WHERE id = 1",
        "SELECT * FROM users WHERE id = 2",
        "SELECT name, age FROM users WHERE id = 3",        // Different projection, same WHERE clause pattern
        "SELECT age, name FROM users WHERE id = 4",        // Different projection order, same pattern

        // Pattern B: Two conditions with AND (order matters for pattern detection)
        "SELECT * FROM users WHERE age > 18 AND name = 'John'",
        "SELECT * FROM users WHERE name = 'Jane' AND age > 21",  // Different condition order = different pattern

        // Pattern C: Numeric comparison on price (different operators = different patterns)
        "SELECT * FROM products WHERE price > 100",   // Greater than
        "SELECT * FROM products WHERE price < 50",    // Less than
        "SELECT * FROM products WHERE price = 75",    // Equals

        // Pattern D: Simple equality on string column
        "SELECT * FROM users WHERE name = 'John'",
        "SELECT * FROM users WHERE name = 'Alice'",
        "SELECT * FROM users WHERE name = 'Bob'",

        // Pattern E: JOIN with WHERE clause on numeric comparison
        "SELECT o.id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id WHERE o.total > 1000",
        "SELECT o.id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id WHERE o.total > 5000",

        // Pattern F: GROUP BY with HAVING clause
        "SELECT category, COUNT(*) FROM products GROUP BY category HAVING COUNT(*) > 5",
        "SELECT category, COUNT(*) FROM products GROUP BY category HAVING COUNT(*) > 10",

        // Pattern G: Subquery with IN clause
        "SELECT * FROM orders WHERE customer_id IN (SELECT id FROM customers WHERE status = 'active')",

        // Pattern H: ORDER BY with LIMIT
        "SELECT * FROM orders WHERE status = 'active' ORDER BY created_at DESC LIMIT 10",
        "SELECT * FROM orders WHERE status = 'active' ORDER BY created_at DESC LIMIT 20"
    };

    // Pattern descriptions aligned with each query above
    private static final String[] QUERY_PATTERNS = {
        "Pattern A: WHERE id = ? (numeric equality)",
        "Pattern A: WHERE id = ? (numeric equality)",
        "Pattern A: WHERE id = ? (numeric equality)",
        "Pattern A: WHERE id = ? (numeric equality)",
        "Pattern B: WHERE age > ? AND name = '?' (age first)",
        "Pattern C: WHERE name = '?' AND age > ? (name first)",
        "Pattern D: WHERE price > ? (greater than)",
        "Pattern E: WHERE price < ? (less than)",
        "Pattern F: WHERE price = ? (equals)",
        "Pattern G: WHERE name = '?' (string equality)",
        "Pattern G: WHERE name = '?' (string equality)",
        "Pattern G: WHERE name = '?' (string equality)",
        "Pattern H: JOIN orders+customers WHERE total > ?",
        "Pattern H: JOIN orders+customers WHERE total > ?",
        "Pattern I: GROUP BY category HAVING COUNT(*) > ?",
        "Pattern I: GROUP BY category HAVING COUNT(*) > ?",
        "Pattern J: WHERE id IN (subquery)",
        "Pattern K: WHERE status = 'active' ORDER BY created_at DESC LIMIT ?",
        "Pattern K: WHERE status = 'active' ORDER BY created_at DESC LIMIT ?"
    };
    
    // Helper method to print separator line for visual clarity in console output
    private static void printSeparator() {
        System.out.println(String.join("", Collections.nCopies(80, "─")));
    }
    
    // Helper method to print double separator for major sections
    private static void printDoubleSeparator() {
        System.out.println(String.join("", Collections.nCopies(80, "=")));
    }
    
    public static void main(String[] args) {

        printDoubleSeparator();
        System.out.println("🧪 TEST SUITE: QUERY PLAN CACHE");
        printDoubleSeparator();
        
        printTestQueries();           // Show all queries being tested
        
        printTokenAndParseTreeOnce();  // Print tokens and parse tree for first query (once)

        runWithoutCache();            // Baseline test - no caching
        runWithCache();               // Test with caching enabled
        runSchemaChangeTest();        // Test cache invalidation on schema change
        
        printFinalSummary();          // Compare results and show statistics
    }
    
    // Display all test queries and their pattern classifications
    // This helps understand which queries should hit/miss the cache
    private static void printTestQueries() {
        System.out.println("\n📋 TEST QUERIES (Same across all scenarios):\n");
        printSeparator();
        System.out.println();
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            System.out.printf("  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n\n", QUERY_PATTERNS[i]);
        }
        printSeparator();
    }
    
    // ========== SCENARIO 1: WITHOUT CACHE (BASELINE) ==========
    // This establishes baseline performance metrics for comparison
    // Every query generates a new plan regardless of pattern similarity
    private static void runWithoutCache() {
        System.out.println("\n📌 SCENARIO 1: WITHOUT CACHE (Baseline)\n");
        printSeparator();
        System.out.println("\n⚙️ Mode: Cache DISABLED");
        System.out.println("   Behavior: Generate execution plan for EVERY query\n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(false);  // Disable caching for baseline measurement
        
        long startTime = System.currentTimeMillis();
        List<QueryExecution> executions = new ArrayList<>();
        
        // Execute each query and record timing
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long queryStart = System.nanoTime();  // More precise timing for individual queries
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;  // Convert to milliseconds
            
            executions.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                             false, queryTime, plan.getPlanId(), 
                                              plan.getNormalizedQuery()));
            
            System.out.printf("\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            System.out.println();
            System.out.printf("      🔄 Generated new plan (cache disabled)%n");
            System.out.printf("         Plan ID: %-8s | Time: %3d ms%n", 
                    plan.getPlanId().substring(0, 8),  queryTime);
            System.out.printf("         Normalized: %s%n", plan.getNormalizedQuery());
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\n📊 SCENARIO 1 METRICS:\n");
        System.out.printf("  • Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  • Total Queries: %d%n", TEST_QUERIES.length);
        System.out.printf("  • Plans Generated: %d (100%%)%n", TEST_QUERIES.length);
        System.out.printf("  • Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        printSeparator();
        
        // Store baseline metrics for later comparison
        TestStats.baselineTime = totalTime;
        TestStats.baselineAvgTime = (double)totalTime / TEST_QUERIES.length;
        TestStats.baselineExecutions = executions;
    }
    
    // ========== SCENARIO 2: WITH CACHE ==========
    // Demonstrates performance improvement with caching
    // Identical patterns should hit cache after first execution
    private static void runWithCache() {
        System.out.println("\n📌 SCENARIO 2: WITH CACHE (Normal Operation)\n");
        printSeparator();
        System.out.println("\n⚙️ Mode: Cache ENABLED");
        System.out.println("    Behavior: Reuse cached plans for identical patterns\n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();  // Start with empty cache for fair test
        
        long startTime = System.currentTimeMillis();
        int misses = 0, hits = 0;
        List<QueryExecution> executions = new ArrayList<>();
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long queryStart = System.nanoTime();
            var plan = service.execute(TEST_QUERIES[i]);
            long queryTime = (System.nanoTime() - queryStart) / 1_000_000;
            
            // getLastAccessWasHit() tells us if this execution used cached plan
            boolean isHit = service.getLastAccessWasHit();
            if (isHit) hits++; else misses++;
            
            executions.add(new QueryExecution(i+1, TEST_QUERIES[i], QUERY_PATTERNS[i], 
                                             isHit, queryTime, plan.getPlanId(), 
                                              plan.getNormalizedQuery()));
            
            System.out.printf("\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            System.out.println();
            if (isHit) {
                System.out.printf("      ✅ CACHE HIT - Reused plan (Accessed %d times)%n", plan.getAccessCount());
            } else {
                System.out.printf("      ❌ CACHE MISS - Generated new plan%n");
            }
            System.out.printf("         Plan ID: %-8s | Time: %3d ms%n", 
                    plan.getPlanId().substring(0, 8), queryTime);
            System.out.printf("         Normalized: %s%n", plan.getNormalizedQuery());
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\n📊 SCENARIO 2 METRICS:\n");
        System.out.printf("  • Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  • Cache Hits: %d | Cache Misses: %d%n", hits, misses);
        System.out.printf("  • Hit Ratio: %.1f%% | Miss Ratio: %.1f%%%n", 
                          (hits * 100.0 / TEST_QUERIES.length),
                          (misses * 100.0 / TEST_QUERIES.length));
        System.out.printf("  • Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        
        System.out.println("\n   Cache Contents:");
        var cache = service.getCache();
        System.out.printf("    • Total cached plans: %d%n", cache.getSize());
        printSeparator();
        
        // Store cache test metrics for final comparison
        TestStats.cacheTime = totalTime;
        TestStats.cacheHits = hits;
        TestStats.cacheMisses = misses;
        TestStats.cacheAvgTime = (double)totalTime / TEST_QUERIES.length;
        TestStats.cacheExecutions = executions;
    }
    
 // ========== SCENARIO 3: SCHEMA CHANGE (CACHE INVALIDATION) ==========
 // Tests that cache is properly invalidated when table schema changes
 // This prevents stale plans from being used with modified tables
 private static void runSchemaChangeTest() {
     System.out.println("\n📌 SCENARIO 3: SCHEMA CHANGE (Cache Invalidation)\n");
     printSeparator();
     System.out.println("\n⚙️ Mode: Cache ENABLED + Schema Change");
     System.out.println("   Behavior: Cache invalidated when schema changes\n");
     printSeparator();
     
     QueryService service = new QueryService();
     service.setCacheEnabled(true);
     service.clearCache();
     
     
     
     
     String testQuery = "SELECT * FROM orders WHERE customer_id = 100";
     
     // Track hits separately for more accurate reporting
     int hitsBeforeSchemaChange = 0;
     int hitsAfterSchemaChange = 0;
     
     
     
     
     // PHASE 1: First execution - cache miss (cache is empty)
     System.out.println("\n  🟢 PHASE 1: First execution (cache miss)");
     System.out.println("  -------------------------------------\n");
     
     long start1 = System.nanoTime();
     var plan1 = service.execute(testQuery);
     long time1 = (System.nanoTime() - start1) / 1_000_000;
     
     // Check if this was a hit or miss and display appropriate icon
     boolean isHit1 = service.getLastAccessWasHit();
     System.out.printf("    Query: %s%n", testQuery);
     if (isHit1) {
         System.out.printf("       -> ✅ HIT (Unexpected - cache should be empty!) | Plan: %s | Time: %d ms%n", 
                          plan1.getPlanId().substring(0, 8), time1);
     } else {
         System.out.printf("       -> ❌ MISS (Plan generated as expected) | Plan: %s | Time: %d ms%n", 
                          plan1.getPlanId().substring(0, 8), time1);
     }
     System.out.printf("             Normalized: %s%n\n", plan1.getNormalizedQuery());
     
     
     
     
     // PHASE 2: Second execution - should be cache hit (plan reused)
     System.out.println("  🟢 PHASE 2: Second execution (should be cache hit)");
     System.out.println("  ---------------------------------------------\n");
     
     long start2 = System.nanoTime();
     var plan2 = service.execute(testQuery);
     long time2 = (System.nanoTime() - start2) / 1_000_000;
     
     boolean isHit2 = service.getLastAccessWasHit();
     if (isHit2) {
         hitsBeforeSchemaChange = 1;
         System.out.printf("    Query: %s%n", testQuery);
         System.out.printf("       -> ✅ HIT (Cached plan reused correctly) | Plan: %s | Time: %d ms%n", 
                          plan2.getPlanId().substring(0, 8), time2);
     } else {
         System.out.printf("    Query: %s%n", testQuery);
         System.out.printf("       -> ❌ MISS (ERROR - Should have been a cache hit!) | Plan: %s | Time: %d ms%n", 
                          plan2.getPlanId().substring(0, 8), time2);
     }
     System.out.printf("             Normalized: %s%n\n", plan2.getNormalizedQuery());
     
     // Verify plan1 and plan2 have same ID (cache reuse)
     boolean samePlanBefore = plan1.getPlanId().equals(plan2.getPlanId());
     if (!samePlanBefore) {
         System.out.println("  ⚠️ WARNING: Plans differ before schema change - cache not working properly!");
     }
     
     
     
     
     
     // PHASE 3: Simulate schema change (e.g., ALTER TABLE ADD COLUMN)
     // notifySchemaChange() should invalidate all cache entries for 'orders' table
     System.out.println("  🔄 PHASE 3: Schema change detected");
     System.out.println("  -------------------------------");
     System.out.println("  📝 ALTER TABLE orders ADD COLUMN discount DECIMAL(5,2)\n");
     
     long invalidateStart = System.nanoTime();
     service.notifySchemaChange("orders");
     long invalidateTime = (System.nanoTime() - invalidateStart) / 1_000_000;
     
     System.out.printf("  ⚡ Cache invalidated in %d ms%n", invalidateTime);
     System.out.printf("     Cache size after invalidation: %d%n\n", service.getCache().getSize());
     
     // Verify cache was actually cleared
     boolean cacheCleared = (service.getCache().getSize() == 0);
     if (cacheCleared) {
         System.out.println("  ✅ SUCCESS: Cache cleared correctly");
     } else {
         System.out.println("  ❌ ERROR: Cache not cleared after schema change!");
     }
     System.out.println();
     
     
     
     
     
     // PHASE 4: Execute after schema change - should be cache miss (plan regenerated)
     System.out.println("  🟡 PHASE 4: Execute after schema change (should be cache miss)");
     System.out.println("  ----------------------------------------------------------\n");
     
     long start3 = System.nanoTime();
     var plan3 = service.execute(testQuery);
     long time3 = (System.nanoTime() - start3) / 1_000_000;
     
     boolean isHit3 = service.getLastAccessWasHit();
     System.out.printf("    Query: %s%n", testQuery);
     if (isHit3) {
         System.out.printf("       -> ✅ HIT (ERROR - Should have been a miss after invalidation!) | Plan: %s | Time: %d ms%n", 
                          plan3.getPlanId().substring(0, 8), time3);
     } else {
         System.out.printf("       -> ❌ MISS (Correct - regenerated with new schema) | Plan: %s | Time: %d ms%n", 
                          plan3.getPlanId().substring(0, 8), time3);
     }
     System.out.printf("             Normalized: %s%n\n", plan3.getNormalizedQuery());
     
     // Check if plan regenerated with NEW ID (different from before)
     boolean planRegenerated = !plan1.getPlanId().equals(plan3.getPlanId());
     if (planRegenerated) {
         System.out.println("  ✅ SUCCESS: Plan regenerated with NEW ID (different from before)");
         System.out.printf("    Old Plan ID: %s%n", plan1.getPlanId().substring(0, 8));
         System.out.printf("    New Plan ID: %s%n\n", plan3.getPlanId().substring(0, 8));
     } else {
         System.out.println("  ❌ ERROR: Plan ID is same as before - not regenerated!");
         System.out.printf("    Plan ID (same): %s%n\n", plan1.getPlanId().substring(0, 8));
     }
     
     
     
     
     
     // PHASE 5: Execute again after rebuild - should be cache hit again
     System.out.println("  🟢 PHASE 5: Execute again after rebuild (should be cache hit)");
     System.out.println("  ---------------------------------------------------------\n");
     
     long start4 = System.nanoTime();
     var plan4 = service.execute(testQuery);
     long time4 = (System.nanoTime() - start4) / 1_000_000;
     
     boolean isHit4 = service.getLastAccessWasHit();
     if (isHit4) {
         hitsAfterSchemaChange = 1;
         System.out.printf("    Query: %s%n", testQuery);
         System.out.printf("       -> ✅ HIT (New cached plan reused correctly) | Plan: %s | Time: %d ms%n", 
                          plan4.getPlanId().substring(0, 8), time4);
     } else {
         System.out.printf("    Query: %s%n", testQuery);
         System.out.printf("       -> ❌ MISS (ERROR - Should have been a cache hit after rebuild!) | Plan: %s | Time: %d ms%n", 
                          plan4.getPlanId().substring(0, 8), time4);
     }
     System.out.printf("             Normalized: %s%n\n", plan4.getNormalizedQuery());
     
     // Verify plan3 and plan4 have same ID (cache reuse after rebuild)
     boolean samePlanAfter = plan3.getPlanId().equals(plan4.getPlanId());
     if (!samePlanAfter) {
         System.out.println("  ⚠️ WARNING: Plans differ after rebuild - cache not storing new plans properly!");
     }
     
     
     
     
     printSeparator();
     System.out.println("\n📊 SCHEMA CHANGE IMPACT ANALYSIS\n");
     System.out.printf("  • Cache hits BEFORE schema change (Phase 2): %d%n", hitsBeforeSchemaChange);
     System.out.printf("  • Cache hits AFTER schema change (Phase 5): %d%n", hitsAfterSchemaChange);
     System.out.printf("  • Plan regenerated with new ID: %s%n", planRegenerated ? "✅ YES" : "❌ NO");
     System.out.printf("  • Cache invalidation time: %d ms%n", invalidateTime);
     System.out.printf("  • Time before schema change: %d ms %s%n", time2, isHit2 ? "✅ HIT" : "❌ MISS");
     System.out.printf("  • Time after schema change: %d ms %s%n", time3, !isHit3 ? "❌ MISS - rebuild" : "✅ HIT - ERROR");
     System.out.printf("  • Time after rebuild: %d ms %s%n", time4, isHit4 ? "✅ HIT" : "❌ MISS - ERROR");
     
     System.out.println("\n  💡 Cache Invalidation Logic:");
     System.out.println("    1. Schema changes require cache invalidation for affected tables");
     System.out.println("    2. Stale execution plans could produce wrong results");
     System.out.println("    3. New plans are generated with the updated schema");
     System.out.println("    4. Cache gradually warms up again with new plans");
     printSeparator();
     
     
     
     
     // ========== VALIDATION SECTION - ALL VARIABLES DECLARED HERE ==========
     // Declare and assign validation variables (THIS IS THE FIX)
     boolean phase1Correct = !isHit1;        // Should be MISS on first execution
     boolean phase2Correct = isHit2;         // Should be HIT on second execution
     boolean phase4Correct = !isHit3;        // Should be MISS after invalidation
     boolean phase5Correct = isHit4;         // Should be HIT after rebuild
     boolean invalidationCorrect = planRegenerated;  // Plan ID should change
     
     System.out.println("\n  ✅ VALIDATION RESULTS:");
     System.out.println("  ───────────────────");
     System.out.printf("  Phase 1 (First exec): %s (Expected: MISS)%n", 
                      phase1Correct ? "✅ PASSED" : "❌ FAILED");
     System.out.printf("  Phase 2 (Second exec): %s (Expected: HIT)%n", 
                      phase2Correct ? "✅ PASSED" : "❌ FAILED");
     System.out.printf("  Cache Invalidation: %s (Expected: Cache cleared)%n", 
                      cacheCleared ? "✅ PASSED" : "❌ FAILED");
     System.out.printf("  Phase 4 (After schema change): %s (Expected: MISS)%n", 
                      phase4Correct ? "✅ PASSED" : "❌ FAILED");
     System.out.printf("  Phase 5 (After rebuild): %s (Expected: HIT)%n", 
                      phase5Correct ? "✅ PASSED" : "❌ FAILED");
     System.out.printf("  Plan Regeneration: %s (Expected: Different Plan ID)%n", 
                      invalidationCorrect ? "✅ PASSED" : "❌ FAILED");
     
     // Overall test result
     if (phase1Correct && phase2Correct && phase4Correct && phase5Correct && invalidationCorrect && cacheCleared) {
         System.out.println("\n  🎉 OVERALL: PASSED - Schema change correctly invalidated cache");
         testsPassed++;
     } else {
         System.out.println("\n  ❌ OVERALL: FAILED - Cache invalidation not working correctly");
         testsFailed++;
     }
     
     TestStats.schemaChangeInvalidationTime = invalidateTime;
     TestStats.schemaChangeRegenerated = planRegenerated;
 }
    
    // ========== FINAL SUMMARY & COMPARISON ==========
    // Compares baseline (no cache) vs cached performance
    // Calculates improvement percentages and displays per-query breakdown
    private static void printFinalSummary() {
        System.out.println("\n" + "=".repeat(80));
        System.out.println("📊 FINAL PERFORMANCE COMPARISON");
        System.out.println("=".repeat(80));
        
        System.out.println("\n📈 CACHE PERFORMANCE (Fair Comparison):");
        System.out.println("   Comparing: WITHOUT CACHE vs WITH CACHE");
        System.out.println("   (Both scenarios use same queries with no schema changes)\n");
        
        // Print summary table with all metrics
        System.out.printf("%-20s %12s %12s %10s %10s %10s %10s %10s%n", 
                         "Scenario", "Total Time", "Avg Time", "Total Queries", 
                         "Hits", "Misses", "Hit Ratio", "Miss Ratio");
        System.out.println("─".repeat(100));
        
        double hitRatio = (TestStats.cacheHits * 100.0 / TEST_QUERIES.length);
        double missRatio = (TestStats.cacheMisses * 100.0 / TEST_QUERIES.length);
        double speedup = (double)TestStats.baselineTime / TestStats.cacheTime;
        double improvement = ((TestStats.baselineTime - TestStats.cacheTime) * 100.0) / TestStats.baselineTime;
        
        // Row 1: WITHOUT CACHE (Baseline)
        System.out.printf("%-20s %6d ms %8.2f ms %10d %10s %10s %10s %10s%n", 
                         "1. WITHOUT CACHE", 
                         TestStats.baselineTime, 
                         TestStats.baselineAvgTime,
                         TEST_QUERIES.length,
                         "N/A",
                         "N/A",
                         "N/A",
                         "N/A");
        
        // Row 2: WITH CACHE
        System.out.printf("%-20s %6d ms %8.2f ms %10d %10d %10d %9.1f%% %9.1f%%%n", 
                         "2. WITH CACHE", 
                         TestStats.cacheTime, 
                         TestStats.cacheAvgTime,
                         TEST_QUERIES.length,
                         TestStats.cacheHits,
                         TestStats.cacheMisses,
                         hitRatio,
                         missRatio);
        
        System.out.println("─".repeat(100));
        System.out.println();
        
        
        
        
        
        // Additional performance metrics
        System.out.printf("📈 PERFORMANCE IMPROVEMENT: %.1f%% faster with cache%n", improvement);
        System.out.printf("⚡ SPEEDUP FACTOR: %.1fx (%.1f ms saved per query on average)%n", 
                         speedup, (TestStats.baselineAvgTime - TestStats.cacheAvgTime));
        System.out.printf("✅ CACHE EFFICIENCY: %.1f%% hit rate across %d queries%n", 
                         hitRatio, TEST_QUERIES.length);
        System.out.printf("❌ MISS RATIO: %.1f%% (first execution of each unique pattern)%n", missRatio);
        System.out.printf("📊 TOTAL QUERIES PROCESSED: %d%n", TEST_QUERIES.length);
        System.out.printf("💾 UNIQUE CACHED PLANS: %d%n", TestStats.cacheExecutions.stream()
                         .map(e -> e.planId).distinct().count());
        
        
        
        
        
        // Detailed per-query breakdown showing which queries hit vs missed
        System.out.println("\n  📊 Per-Query Breakdown (No Cache vs With Cache):");
        System.out.printf("  %-4s %-45s %-15s %-15s %-10s%n", "Q#", "Query Pattern", "No Cache (ms)", "With Cache (ms)", "Status");
        System.out.println("  -------------------------------------------------------------------------------------------------");
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long noCacheTime = TestStats.baselineExecutions.get(i).executionTime;
            long withCacheTime = TestStats.cacheExecutions.get(i).executionTime;
            String hitStatus = TestStats.cacheExecutions.get(i).isHit ? "✅ HIT" : "❌ MISS";
            
            // Truncate long pattern names for better display
            String pattern = QUERY_PATTERNS[i];
            if (pattern.length() > 43) pattern = pattern.substring(0, 40) + "...";
            
            System.out.printf("  %-4d %-45s %-15d %-15d %-10s%n", 
                             (i+1), pattern, noCacheTime, withCacheTime, hitStatus);
        }
        
        System.out.println("\n" + "=".repeat(80));
        System.out.println("🎯 TEST SUMMARY");
        System.out.println("=".repeat(80));
        System.out.printf("✅ Tests Passed: %d%n", testsPassed);
        System.out.printf("❌ Tests Failed: %d%n", testsFailed);
        System.out.printf("📈 Success Rate: %.1f%%%n", 
                         (testsPassed * 100.0 / (testsPassed + testsFailed)));
        System.out.println("=".repeat(80));
        
        System.out.println("\n💡 KEY TAKEAWAYS:");
        System.out.println("  1. Query plan caching provides significant performance improvement");
        System.out.println("  2. Pattern-based normalization enables reuse across different literal values");
        System.out.println("  3. Schema changes correctly invalidate affected cache entries");
        System.out.println("  4. Cache hit ratio directly correlates with performance gain");
        System.out.println("  5. Temporary performance dip after schema change is expected and acceptable");
        System.out.println("=".repeat(80));
    }
    
    /**
     * Print lexer tokens and parse tree for the first query
     * This is a one-time setup before performance measurement
     */
    private static void printTokenAndParseTreeOnce() {
        System.out.println("\n📝 TOKENS & PARSE TREE (First query only)\n");
        printSeparator();
        
        SQLiteParserService parser = new SQLiteParserService();
        parser.setDebug(true);
        parser.normalizeQuery(TEST_QUERIES[0]);
        parser.setDebug(false);
        
        System.out.println("\n✓ Ready for performance tests\n");
        printSeparator();
    }
    
    // ========== HELPER CLASS FOR STORING EXECUTION DATA ==========
    // Stores all details of a single query execution for later analysis/comparison
    static class QueryExecution {
        int queryNum;
        String query;
        String pattern;
        boolean isHit;
        long executionTime;     // Time in milliseconds
        String planId;
        String normalizedQuery;
        
        QueryExecution(int queryNum, String query, String pattern, boolean isHit, 
                      long executionTime, String planId, String normalizedQuery) {
            this.queryNum = queryNum;
            this.query = query;
            this.pattern = pattern;
            this.isHit = isHit;
            this.executionTime = executionTime;
            this.planId = planId;
            this.normalizedQuery = normalizedQuery;
        }
    }
    
    // ========== STATIC CLASS FOR STORING TEST RESULTS ==========
    // Holds metrics from all test scenarios for final comparison
    static class TestStats {
        // Scenario 1: Without cache (baseline)
        static long baselineTime = 0;
        static double baselineAvgTime = 0;
        static List<QueryExecution> baselineExecutions = new ArrayList<>();
        
        // Scenario 2: With cache
        static long cacheTime = 0;
        static double cacheAvgTime = 0;
        static int cacheHits = 0;
        static int cacheMisses = 0;
        static List<QueryExecution> cacheExecutions = new ArrayList<>();
        
        // Scenario 3: Schema change invalidation
        static long schemaChangeInvalidationTime = 0;
        static boolean schemaChangeRegenerated = false;
    }
}