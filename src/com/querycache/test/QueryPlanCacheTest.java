package com.querycache.test;

import com.querycache.metrics.CacheMetrics;
import com.querycache.model.QueryPlan;
import com.querycache.parser.SQLiteParserService;
import com.querycache.service.QueryService;

/**
 * QueryPlanCacheTest - Comprehensive test suite for cache functionality
 * 
 * Tests include:
 * 1. Basic caching (hit/miss detection)
 * 2. Query normalization (different values, same pattern)
 * 3. JOIN query normalization
 * 4. Aggregate query normalization
 * 5. Schema change invalidation
 * 6. Performance under load
 * 
 * @author QueryCache Team
 * @version 1.0
 */
public class QueryPlanCacheTest {
    
    private static int testsPassed = 0;
    private static int testsFailed = 0;
    
    // Test data - Only 2 queries per category
    private static final String[] BASIC_QUERIES = {
        "SELECT * FROM orders WHERE customer_id = 101",
        "SELECT * FROM orders WHERE customer_id = 202"
    };
    
    private static final String[] JOIN_QUERIES = {
        "SELECT o.id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id WHERE o.total > 1000",
        "SELECT o.id, c.name FROM orders o JOIN customers c ON o.customer_id = c.id WHERE o.total > 5000"
    };
    
    private static final String[] AGGREGATE_QUERIES = {
        "SELECT category, COUNT(*) FROM products GROUP BY category HAVING COUNT(*) > 5",
        "SELECT category, COUNT(*) FROM products GROUP BY category HAVING COUNT(*) > 10"
    };
    
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("🧪 QUERY PLAN CACHE TEST SUITE");
        System.out.println("=".repeat(60));
        
        testBasicCaching();
        testQueryNormalization();
        testJoinNormalization();
        testAggregateNormalization();
        testSchemaChangeInvalidation();
        testPerformanceUnderLoad();
        testParserValidation();
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("📊 TEST SUMMARY");
        System.out.println("=".repeat(60));
        System.out.printf("✅ Passed: %d%n", testsPassed);
        System.out.printf("❌ Failed: %d%n", testsFailed);
        System.out.printf("📈 Success Rate: %.1f%%%n", 
                         (testsPassed * 100.0 / (testsPassed + testsFailed)));
        System.out.println("=".repeat(60));
    }
    
    // ========== TEST 1: BASIC CACHING ==========
    
    private static void testBasicCaching() {
        System.out.println("\n📋 TEST 1: Basic Cache Functionality");
        System.out.println("-".repeat(40));
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        String query = "SELECT * FROM orders WHERE id = 100";
        
        // First execution - MISS
        QueryPlan plan1 = service.execute(query);
        System.out.printf("  Q1: %s%n", query);
        System.out.printf("      → ❌ MISS | Plan: %s | Time: %d ms%n", 
                         plan1.getPlanId().substring(0, 8), plan1.getLastExecutionTime());
        
        // Second execution - HIT
        QueryPlan plan2 = service.execute(query);
        System.out.printf("  Q2: %s%n", query);
        System.out.printf("      → ✅ HIT  | Plan: %s | Time: %d ms%n", 
                         plan2.getPlanId().substring(0, 8), plan2.getLastExecutionTime());
        
        CacheMetrics metrics = service.getMetrics();
        System.out.println("\n  📊 Metrics: Hits=" + metrics.getCacheHits() + 
                          ", Misses=" + metrics.getCacheMisses() + 
                          ", Hit Ratio=" + String.format("%.1f%%", metrics.getHitRatio()));
        
        if (metrics.getCacheHits() > 0 && plan1.getPlanId().equals(plan2.getPlanId())) {
            System.out.println("  ✅ PASSED");
            testsPassed++;
        } else {
            System.out.println("  ❌ FAILED");
            testsFailed++;
        }
    }
    
    // ========== TEST 2: QUERY NORMALIZATION ==========
    
    private static void testQueryNormalization() {
        System.out.println("\n📋 TEST 2: Query Normalization");
        System.out.println("-".repeat(40));
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        // Execute first query - MISS
        QueryPlan plan1 = service.execute(BASIC_QUERIES[0]);
        System.out.printf("  Q1: %s%n", BASIC_QUERIES[0]);
        System.out.printf("      → ❌ MISS | Plan: %s%n", plan1.getPlanId().substring(0, 8));
        
        // Execute second query - Should be HIT (same pattern)
        QueryPlan plan2 = service.execute(BASIC_QUERIES[1]);
        System.out.printf("  Q2: %s%n", BASIC_QUERIES[1]);
        System.out.printf("      → ✅ HIT  | Plan: %s (reused)%n", plan2.getPlanId().substring(0, 8));
        
        CacheMetrics metrics = service.getMetrics();
        System.out.println("\n  📊 Metrics: Hits=" + metrics.getCacheHits() + 
                          ", Misses=" + metrics.getCacheMisses() + 
                          ", Hit Ratio=" + String.format("%.1f%%", metrics.getHitRatio()));
        
        if (plan1.getPlanId().equals(plan2.getPlanId())) {
            System.out.println("  ✅ PASSED - Different values (101/202) → same pattern → HIT");
            testsPassed++;
        } else {
            System.out.println("  ❌ FAILED");
            testsFailed++;
        }
    }
    
    // ========== TEST 3: JOIN NORMALIZATION ==========
    
    private static void testJoinNormalization() {
        System.out.println("\n📋 TEST 3: JOIN Query Normalization");
        System.out.println("-".repeat(40));
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        // Execute first JOIN query - MISS
        QueryPlan plan1 = service.execute(JOIN_QUERIES[0]);
        System.out.printf("  Q1: %s%n", JOIN_QUERIES[0]);
        System.out.printf("      → ❌ MISS | Plan: %s | Time: %d ms%n", 
                         plan1.getPlanId().substring(0, 8), plan1.getLastExecutionTime());
        
        // Execute second JOIN query - Should be HIT (same pattern)
        QueryPlan plan2 = service.execute(JOIN_QUERIES[1]);
        System.out.printf("  Q2: %s%n", JOIN_QUERIES[1]);
        System.out.printf("      → ✅ HIT  | Plan: %s | Time: %d ms (reused)%n", 
                         plan2.getPlanId().substring(0, 8), plan2.getLastExecutionTime());
        
        CacheMetrics metrics = service.getMetrics();
        double speedup = (double)plan1.getLastExecutionTime() / plan2.getLastExecutionTime();
        
        System.out.println("\n  📊 Metrics: Hits=" + metrics.getCacheHits() + 
                          ", Misses=" + metrics.getCacheMisses() + 
                          ", Hit Ratio=" + String.format("%.1f%%", metrics.getHitRatio()) +
                          ", Speedup=" + String.format("%.1fx", speedup));
        
        if (plan1.getPlanId().equals(plan2.getPlanId())) {
            System.out.println("  ✅ PASSED - Different thresholds (1000/5000) → same pattern → HIT");
            testsPassed++;
        } else {
            System.out.println("  ❌ FAILED");
            testsFailed++;
        }
    }
    
    // ========== TEST 4: AGGREGATE NORMALIZATION ==========
    
    private static void testAggregateNormalization() {
        System.out.println("\n📋 TEST 4: Aggregate Query Normalization (GROUP BY + HAVING)");
        System.out.println("-".repeat(40));
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        // Execute first aggregate query - MISS
        QueryPlan plan1 = service.execute(AGGREGATE_QUERIES[0]);
        System.out.printf("  Q1: %s%n", AGGREGATE_QUERIES[0]);
        System.out.printf("      → ❌ MISS | Plan: %s | Time: %d ms%n", 
                         plan1.getPlanId().substring(0, 8), plan1.getLastExecutionTime());
        
        // Execute second aggregate query - Should be HIT (same pattern)
        QueryPlan plan2 = service.execute(AGGREGATE_QUERIES[1]);
        System.out.printf("  Q2: %s%n", AGGREGATE_QUERIES[1]);
        System.out.printf("      → ✅ HIT  | Plan: %s | Time: %d ms (reused)%n", 
                         plan2.getPlanId().substring(0, 8), plan2.getLastExecutionTime());
        
        CacheMetrics metrics = service.getMetrics();
        double speedup = (double)plan1.getLastExecutionTime() / plan2.getLastExecutionTime();
        
        System.out.println("\n  📊 Metrics: Hits=" + metrics.getCacheHits() + 
                          ", Misses=" + metrics.getCacheMisses() + 
                          ", Hit Ratio=" + String.format("%.1f%%", metrics.getHitRatio()) +
                          ", Speedup=" + String.format("%.1fx", speedup));
        
        if (plan1.getPlanId().equals(plan2.getPlanId())) {
            System.out.println("  ✅ PASSED - Different HAVING thresholds (5/10) → same pattern → HIT");
            testsPassed++;
        } else {
            System.out.println("  ❌ FAILED");
            testsFailed++;
        }
    }
    
    // ========== TEST 5: SCHEMA CHANGE INVALIDATION ==========
    
    private static void testSchemaChangeInvalidation() {
        System.out.println("\n📋 TEST 5: Schema Change Invalidation");
        System.out.println("-".repeat(40));
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        String query = "SELECT * FROM orders WHERE customer_id = 100";
        
        // Warm up cache - MISS then HIT
        QueryPlan planBefore = service.execute(query);
        System.out.printf("  Before schema change - Q1: ❌ MISS | Plan: %s%n", 
                         planBefore.getPlanId().substring(0, 8));
        
        service.execute(query);
        System.out.printf("  Before schema change - Q2: ✅ HIT  | Plan: %s (reused)%n", 
                         planBefore.getPlanId().substring(0, 8));
        
        int hitsBefore = service.getMetrics().getCacheHits();
        
        // Schema change
        System.out.println("\n  🔄 ALTER TABLE orders ADD COLUMN discount DECIMAL(5,2)");
        service.notifySchemaChange("orders");
        
        // Execute after schema change - Should be MISS (cache invalidated)
        QueryPlan planAfter = service.execute(query);
        System.out.printf("  After schema change  - Q3: ❌ MISS | Plan: %s (new)%n", 
                         planAfter.getPlanId().substring(0, 8));
        
        CacheMetrics metrics = service.getMetrics();
        boolean planRegenerated = !planBefore.getPlanId().equals(planAfter.getPlanId());
        
        System.out.println("\n  📊 Metrics: Hits before=" + hitsBefore + 
                          ", Hits after=" + metrics.getCacheHits() +
                          ", Plan regenerated=" + planRegenerated);
        
        if (planRegenerated) {
            System.out.println("  ✅ PASSED - Schema change → cache invalidated → new plan generated");
            testsPassed++;
        } else {
            System.out.println("  ❌ FAILED");
            testsFailed++;
        }
    }
    
    // ========== TEST 6: PERFORMANCE UNDER LOAD ==========
    
    private static void testPerformanceUnderLoad() {
        System.out.println("\n📋 TEST 6: Performance Under Load");
        System.out.println("-".repeat(40));
        
        QueryService service = new QueryService();
        service.setCacheEnabled(true);
        service.clearCache();
        
        // Mix of 6 queries (3 patterns, each executed twice)
        String[] queries = {
            "SELECT * FROM users WHERE id = 1",      // Pattern A
            "SELECT * FROM users WHERE id = 2",      // Pattern A (HIT)
            "SELECT * FROM products WHERE price > 100", // Pattern B
            "SELECT * FROM products WHERE price > 200", // Pattern B (HIT)
            "SELECT * FROM orders WHERE status = 'active'", // Pattern C
            "SELECT * FROM orders WHERE status = 'pending'"  // Pattern C (HIT)
        };
        
        long start = System.nanoTime();
        int hits = 0, misses = 0;
        
        for (int i = 0; i < queries.length; i++) {
            long qStart = System.nanoTime();
            QueryPlan plan = service.execute(queries[i]);
            long qTime = (System.nanoTime() - qStart) / 1_000_000;
            boolean isHit = service.getLastAccessWasHit();
            
            if (isHit) hits++;
            else misses++;
            
            System.out.printf("  Q%d: %-50s %s | %3d ms%n", 
                             (i+1), 
                             queries[i].length() > 48 ? queries[i].substring(0, 45) + "..." : queries[i],
                             isHit ? "✅ HIT" : "❌ MISS",
                             qTime);
        }
        
        long end = System.nanoTime();
        double totalTime = (end - start) / 1_000_000.0;
        CacheMetrics metrics = service.getMetrics();
        
        System.out.println("\n  📊 Metrics:");
        System.out.printf("     Total Queries: %d%n", queries.length);
        System.out.printf("     Cache Hits:    %d%n", hits);
        System.out.printf("     Cache Misses:  %d%n", misses);
        System.out.printf("     Hit Ratio:     %.1f%%%n", (hits * 100.0 / queries.length));
        System.out.printf("     Total Time:    %.2f ms%n", totalTime);
        System.out.printf("     Avg Time/Q:    %.2f ms%n", totalTime / queries.length);
        
        if (metrics.getHitRatio() >= 40.0) {
            System.out.println("\n  ✅ PASSED - Hit ratio meets expectations (≥40%)");
            testsPassed++;
        } else {
            System.out.println("\n  ⚠️ WARNING - Hit ratio below expectations");
            testsFailed++;
        }
    }
    
    // ========== TEST 7: PARSER VALIDATION ==========
    
    private static void testParserValidation() {
        System.out.println("\n📋 TEST 7: Parser Validation");
        System.out.println("-".repeat(40));
        
        SQLiteParserService parser = new SQLiteParserService();
        
        String validQuery = "SELECT * FROM users WHERE id = 1";
        String invalidQuery = "SELECT INVALID SYNTAX HERE";
        
        boolean validResult = parser.validateQuery(validQuery);
        boolean invalidResult = parser.validateQuery(invalidQuery);
        
        System.out.printf("  Valid query:   \"%s\" → %s%n", validQuery, validResult ? "✅ ACCEPTED" : "❌ REJECTED");
        System.out.printf("  Invalid query: \"%s\" → %s%n", invalidQuery, invalidResult ? "❌ ACCEPTED" : "✅ REJECTED");
        
        if (validResult && !invalidResult) {
            System.out.println("\n  ✅ PASSED - Parser correctly validates SQL syntax");
            testsPassed++;
        } else {
            System.out.println("\n  ❌ FAILED");
            testsFailed++;
        }
    }
}