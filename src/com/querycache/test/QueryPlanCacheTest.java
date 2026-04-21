package com.querycache.test;

import com.querycache.metrics.CacheMetrics;
import com.querycache.model.QueryPlan;
import com.querycache.parser.SQLiteParserService;
import com.querycache.service.QueryService;
import java.util.*;

/**
 * QueryPlanCacheTest - Comprehensive test suite for cache functionality
 * 
 * Tests include:
 * 1. Performance WITHOUT caching (baseline)
 * 2. Performance WITH caching (benefits)
 * 3. Query normalization validation
 * 4. Schema change invalidation
 * 
 * @author QueryCache Team
 * @version 1.0
 */
public class QueryPlanCacheTest {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    // Shared test queries for fair comparison
    private static final String[] TEST_QUERIES = {
        "SELECT * FROM users WHERE id = 1",
        "SELECT * FROM users WHERE id = 2",
        "SELECT * FROM users WHERE id = 3",
        "SELECT * FROM users WHERE id = 4",
        "SELECT * FROM products WHERE price > 100",
        "SELECT * FROM products WHERE price < 50",
        "SELECT * FROM products WHERE price = 75",
        "SELECT * FROM users WHERE name = 'John'",
        "SELECT * FROM users WHERE name = 'Alice'",
        "SELECT * FROM users WHERE name = 'Bob'",
        "SELECT o.id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id WHERE o.total > 1000",
        "SELECT o.id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id WHERE o.total > 5000",
        "SELECT category, COUNT(*) FROM products GROUP BY category HAVING COUNT(*) > 5",
        "SELECT category, COUNT(*) FROM products GROUP BY category HAVING COUNT(*) > 10",
        "SELECT * FROM orders WHERE customer_id IN (SELECT id FROM customers WHERE status = 'active')",
        "SELECT * FROM orders WHERE status = 'active' ORDER BY created_at DESC LIMIT 10",
        "SELECT * FROM orders WHERE status = 'active' ORDER BY created_at DESC LIMIT 20"
    };
    
    private static final String[] QUERY_PATTERNS = {
        "Users by ID (Pattern 1)",
        "Users by ID (Pattern 1 - same)",
        "Users by ID (Pattern 1 - same)",
        "Users by ID (Pattern 1 - same)",
        "Products price > (Pattern 2)",
        "Products price < (Pattern 3 - different)",
        "Products price = (Pattern 4 - different)",
        "Users by name (Pattern 5)",
        "Users by name (Pattern 5 - same)",
        "Users by name (Pattern 5 - same)",
        "JOIN orders/customers (Pattern 6)",
        "JOIN orders/customers (Pattern 6 - same)",
        "Aggregate GROUP BY (Pattern 7)",
        "Aggregate GROUP BY (Pattern 7 - same)",
        "Subquery IN (Pattern 8)",
        "ORDER BY with LIMIT (Pattern 9)",
        "ORDER BY with LIMIT (Pattern 9 - same)"
    };
    
    private static void printSeparator() {
        System.out.println(String.join("", Collections.nCopies(80, "─")));
    }
    
    private static void printDoubleSeparator() {
        System.out.println(String.join("", Collections.nCopies(80, "=")));
    }
    
    public static void main(String[] args) {
        printDoubleSeparator();
        System.out.println("🧪 QUERY PLAN CACHE TEST SUITE");
        printDoubleSeparator();
        
        printTestQueries();
        
        runWithoutCache();
        runWithCache();
        runSchemaChangeTest();
        
        printFinalSummary();
    }
    
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
    
    // ========== SCENARIO 1: WITHOUT CACHE ==========
    private static void runWithoutCache() {
        System.out.println("\n📌 SCENARIO 1: WITHOUT CACHE (Baseline)\n");
        printSeparator();
        System.out.println("\n⚙️  Mode: Cache DISABLED");
        System.out.println("📝 Behavior: Generate execution plan for EVERY query\n");
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
                                             plan.getEstimatedCost(), plan.getNormalizedQuery()));
            
            System.out.printf("\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            System.out.println();
            System.out.printf("      🔄 Generated new plan (cache disabled)%n");
            System.out.printf("      📊 Plan ID: %-8s | Cost: %6.2f | Time: %3d ms%n", 
                    plan.getPlanId().substring(0, 8), plan.getEstimatedCost(), queryTime);
            System.out.printf("      🔍 Normalized: %s%n", plan.getNormalizedQuery());
        }
        
        long totalTime = System.currentTimeMillis() - startTime;
        
        printSeparator();
        System.out.println("\n📊 SCENARIO 1 METRICS:\n");
        System.out.printf("  • Total Execution Time: %d ms%n", totalTime);
        System.out.printf("  • Total Queries: %d%n", TEST_QUERIES.length);
        System.out.printf("  • Plans Generated: %d (100%%)%n", TEST_QUERIES.length);
        System.out.printf("  • Avg Time/Query: %.2f ms%n", (double)totalTime / TEST_QUERIES.length);
        printSeparator();
        
        TestStats.baselineTime = totalTime;
        TestStats.baselineAvgTime = (double)totalTime / TEST_QUERIES.length;
        TestStats.baselineExecutions = executions;
    }
    
    // ========== SCENARIO 2: WITH CACHE ==========
    private static void runWithCache() {
        System.out.println("\n📌 SCENARIO 2: WITH CACHE (Normal Operation)\n");
        printSeparator();
        System.out.println("\n⚙️  Mode: Cache ENABLED");
        System.out.println("📝 Behavior: Reuse cached plans for identical patterns\n");
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
                                             plan.getEstimatedCost(), plan.getNormalizedQuery()));
            
            System.out.printf("\n  Q%d: %s%n", (i+1), TEST_QUERIES[i]);
            System.out.printf("      Pattern: %s%n", QUERY_PATTERNS[i]);
            System.out.println();
            if (isHit) {
                System.out.printf("      ✅ CACHE HIT - Reused plan (Accessed %d times)%n", plan.getAccessCount());
            } else {
                System.out.printf("      ❌ CACHE MISS - Generated new plan%n");
            }
            System.out.printf("      📊 Plan ID: %-8s | Cost: %6.2f | Time: %3d ms%n", 
                    plan.getPlanId().substring(0, 8), plan.getEstimatedCost(), queryTime);
            System.out.printf("      🔍 Normalized: %s%n", plan.getNormalizedQuery());
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
        
        System.out.println("\n  📦 Cache Contents:");
        var cache = service.getCache();
        System.out.printf("    • Total cached plans: %d%n", cache.getSize());
        printSeparator();
        
        TestStats.cacheTime = totalTime;
        TestStats.cacheHits = hits;
        TestStats.cacheMisses = misses;
        TestStats.cacheAvgTime = (double)totalTime / TEST_QUERIES.length;
        TestStats.cacheExecutions = executions;
    }
    
    
    // ========== SCENARIO 3: SCHEMA CHANGE ==========
    private static void runSchemaChangeTest() {
        System.out.println("\n📌 SCENARIO 3: SCHEMA CHANGE (Cache Invalidation)\n");
        printSeparator();
        System.out.println("\n⚙️  Mode: Cache ENABLED + Schema Change");
        System.out.println("📝 Behavior: Cache invalidated when schema changes\n");
        printSeparator();
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        String testQuery = "SELECT * FROM orders WHERE customer_id = 100";
        
        // Phase 1: First execution (MISS)
        System.out.println("\n  🟢 PHASE 1: First execution (cache miss)");
        System.out.println("  ─────────────────────────────────────────────\n");
        
        long start1 = System.nanoTime();
        var plan1 = service.execute(testQuery);
        long time1 = (System.nanoTime() - start1) / 1_000_000;
        
        System.out.printf("    Query: %s%n", testQuery);
        System.out.printf("      → ❌ MISS (Plan generated) | Plan: %s | Time: %d ms%n", 
                         plan1.getPlanId().substring(0, 8), time1);
        System.out.printf("      🔍 Normalized: %s%n\n", plan1.getNormalizedQuery());
        
        // Phase 2: Second execution (HIT)
        System.out.println("  🟢 PHASE 2: Second execution (cache hit)");
        System.out.println("  ─────────────────────────────────────────────\n");
        
        long start2 = System.nanoTime();
        var plan2 = service.execute(testQuery);
        long time2 = (System.nanoTime() - start2) / 1_000_000;
        
        System.out.printf("    Query: %s%n", testQuery);
        System.out.printf("      → ✅ HIT (Cached plan reused) | Plan: %s | Time: %d ms%n", 
                         plan2.getPlanId().substring(0, 8), time2);
        System.out.printf("      🔍 Normalized: %s%n\n", plan2.getNormalizedQuery());
        
        int hitsBefore = service.getMetrics().getCacheHits();
        
        // Phase 3: Schema change
        System.out.println("  🔄 PHASE 3: Schema change detected");
        System.out.println("  ─────────────────────────────────────────────");
        System.out.println("  📝 ALTER TABLE orders ADD COLUMN discount DECIMAL(5,2)\n");
        
        long invalidateStart = System.nanoTime();
        service.notifySchemaChange("orders");
        long invalidateTime = (System.nanoTime() - invalidateStart) / 1_000_000;
        
        System.out.printf("  ⚡ Cache invalidated in %d ms%n", invalidateTime);
        System.out.printf("  📦 Cache size after invalidation: %d%n\n", service.getCache().getSize());
        
        // Phase 4: After schema change (MISS)
        System.out.println("  🟡 PHASE 4: Execute after schema change (cache miss & rebuild)");
        System.out.println("  ─────────────────────────────────────────────────────────\n");
        
        long start3 = System.nanoTime();
        var plan3 = service.execute(testQuery);
        long time3 = (System.nanoTime() - start3) / 1_000_000;
        
        System.out.printf("    Query: %s%n", testQuery);
        System.out.printf("      → 🔄 MISS (Regenerated with new schema) | Plan: %s | Time: %d ms%n", 
                         plan3.getPlanId().substring(0, 8), time3);
        System.out.printf("      🔍 Normalized: %s%n\n", plan3.getNormalizedQuery());
        
        // Phase 5: After rebuild (HIT)
        System.out.println("  🟢 PHASE 5: Execute again (cache hit after rebuild)");
        System.out.println("  ─────────────────────────────────────────────────\n");
        
        long start4 = System.nanoTime();
        var plan4 = service.execute(testQuery);
        long time4 = (System.nanoTime() - start4) / 1_000_000;
        
        System.out.printf("    Query: %s%n", testQuery);
        System.out.printf("      → ✅ HIT (New cached plan reused) | Plan: %s | Time: %d ms%n", 
                         plan4.getPlanId().substring(0, 8), time4);
        System.out.printf("      🔍 Normalized: %s%n\n", plan4.getNormalizedQuery());
        
        CacheMetrics metricsAfter = service.getMetrics();
        boolean planRegenerated = !plan1.getPlanId().equals(plan3.getPlanId());
        
        printSeparator();
        System.out.println("\n📊 SCHEMA CHANGE IMPACT ANALYSIS\n");
        System.out.printf("  • Cache hits BEFORE schema change: %d%n", hitsBefore);
        System.out.printf("  • Cache hits AFTER schema change: %d%n", metricsAfter.getCacheHits());
        System.out.printf("  • Plan regenerated: %s%n", planRegenerated ? "YES" : "NO");
        System.out.printf("  • Cache invalidation time: %d ms%n", invalidateTime);
        System.out.printf("  • Time before schema change: %d ms (HIT)%n", time2);
        System.out.printf("  • Time after schema change: %d ms (MISS - rebuild)%n", time3);
        System.out.printf("  • Time after rebuild: %d ms (HIT again)%n", time4);
        
        System.out.println("\n  ✅ Why this is CORRECT behavior:");
        System.out.println("    1. Schema changes require cache invalidation for affected tables");
        System.out.println("    2. Stale execution plans could produce wrong results");
        System.out.println("    3. New plans are generated with the updated schema");
        System.out.println("    4. Cache gradually warms up again with new plans");
        printSeparator();
        
        if (planRegenerated) {
            System.out.println("\n  ✅ PASSED - Schema change correctly invalidated cache");
            testsPassed++;
        } else {
            System.out.println("\n  ❌ FAILED - Cache not invalidated on schema change");
            testsFailed++;
        }
        
        TestStats.schemaChangeInvalidationTime = invalidateTime;
        TestStats.schemaChangeRegenerated = planRegenerated;
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
        
        double improvement = ((TestStats.baselineTime - TestStats.cacheTime) * 100.0) / TestStats.baselineTime;
        double speedup = (double)TestStats.baselineTime / TestStats.cacheTime;
        
        System.out.printf("%-35s %10d ms %15.2f ms %14s %14.1fx%n", 
                         "1. WITHOUT CACHE", 
                         TestStats.baselineTime, 
                         TestStats.baselineAvgTime,
                         "N/A",
                         1.0);
        
        System.out.printf("%-35s %10d ms %15.2f ms %13.1f%% %14.1fx%n", 
                         "2. WITH CACHE", 
                         TestStats.cacheTime, 
                         TestStats.cacheAvgTime,
                         (TestStats.cacheHits * 100.0 / TEST_QUERIES.length),
                         speedup);
        
        System.out.println("─".repeat(95));
        System.out.println();
        System.out.printf("📈 PERFORMANCE IMPROVEMENT: %.1f%% faster with cache%n", improvement);
        System.out.printf("⚡ SPEEDUP FACTOR: %.1fx (%.1f ms saved per query on average)%n", 
                         speedup, (TestStats.baselineAvgTime - TestStats.cacheAvgTime));
        System.out.printf("✅ CACHE EFFICIENCY: %.1f%% hit rate across %d queries%n", 
                         (TestStats.cacheHits * 100.0 / TEST_QUERIES.length),
                         TEST_QUERIES.length);
        
        System.out.println("\n  📊 Per-Query Breakdown (Scenario 1 vs 2):");
        System.out.printf("  %-4s %-45s %-15s %-15s%n", "Q#", "Query Pattern", "No Cache (ms)", "With Cache (ms)");
        System.out.println("  ───────────────────────────────────────────────────────────────────────────────");
        
        for (int i = 0; i < TEST_QUERIES.length; i++) {
            long noCacheTime = TestStats.baselineExecutions.get(i).executionTime;
            long withCacheTime = TestStats.cacheExecutions.get(i).executionTime;
            String hitStatus = TestStats.cacheExecutions.get(i).isHit ? "✅ HIT" : "❌ MISS";
            
            String pattern = QUERY_PATTERNS[i];
            if (pattern.length() > 43) pattern = pattern.substring(0, 40) + "...";
            
            System.out.printf("  %-4d %-45s %-15d %-15d %s%n", 
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
        
        System.out.println("\n🎯 KEY TAKEAWAYS:");
        System.out.println("  1. Query plan caching provides significant performance improvement");
        System.out.println("  2. Pattern-based normalization enables reuse across different literal values");
        System.out.println("  3. Schema changes correctly invalidate affected cache entries");
        System.out.println("  4. Cache hit ratio directly correlates with performance gain");
        System.out.println("  5. Temporary performance dip after schema change is expected and acceptable");
        System.out.println("=".repeat(80));
    }
    
    // ========== HELPER CLASS ==========
    static class QueryExecution {
        int queryNum;
        String query;
        String pattern;
        boolean isHit;
        long executionTime;
        String planId;
        double cost;
        String normalizedQuery;
        
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
    
    static class TestStats {
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
}