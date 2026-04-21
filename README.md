# Query Plan Cache for Interpreted Queries - Java Implementation

## 📋 Project Overview

This project implements a **Query Plan Caching Mechanism** in Java that optimizes SQL query execution by storing and reusing execution plans for structurally identical queries. When similar queries with different literal values execute (e.g., `SELECT * FROM users WHERE id = 101` and `SELECT * FROM users WHERE id = 202`), the system recognizes their structural similarity and reuses the cached plan, eliminating redundant parsing and optimization overhead. This mimics how real database systems like Oracle, PostgreSQL, and MySQL use plan caching to improve query performance.

## 🎯 Problem Statement

In real-world databases, executing queries repeatedly with different parameter values triggers redundant plan generation, wasting computation time. For example, an e-commerce application might execute `SELECT * FROM orders WHERE customer_id = 101` and `SELECT * FROM orders WHERE customer_id = 202` thousands of times per day. Without caching, the database generates a nearly identical execution plan each time, consuming CPU cycles and increasing response time. This project addresses this inefficiency by implementing a query plan cache that recognizes structural similarity between queries and reuses existing plans.

## 🔧 Technologies & Tools Used

| Tool / Module | Version | Purpose |
|---------------|---------|---------|
| **Java** | 11+ | Core programming language for caching and normalization |
| **ANTLR** | 4.13.1 | SQL parsing and AST generation for query normalization |
| **ConcurrentHashMap** | Java Built-in | Thread-safe cache storage for concurrent query execution |
| **Visitor Pattern** | Design Pattern | AST traversal to replace literals with placeholders |
| **UUID** | Java Built-in | Unique identifier generation for query plans |

### System Requirements

| Component | Minimum | Recommended |
|-----------|---------|-------------|
| **Java JDK** | 11 | 17+ |
| **ANTLR** | 4.13.1 | 4.13.1 |
| **Memory** | 512 MB | 1 GB |
| **Disk Space** | 50 MB | 100 MB |
| **OS** | Windows/Linux/Mac | Any with Java support |

### Required Files

| File | Purpose |
|------|---------|
| `antlr-4.13.1-complete.jar` | ANTLR runtime for lexer/parser generation |
| `SQLite.g4` | ANTLR grammar file for SQL parsing |

## 💡 Design Strategy

### 1. Identifying Similar Queries (Query Normalization)

**Strategy:** Transform constants into placeholders (`?`) so that queries with the same structure but different literal values produce the same normalized form.

**How it works:**
- Parse SQL query using ANTLR to build Abstract Syntax Tree (AST)
- Traverse AST using Visitor pattern
- Replace all literal values (numbers, strings) with `?`
- Preserve operators, table names, column names, and query structure
- Convert everything to lowercase for case-insensitive matching

| Original Query | Normalized Query |
|----------------|------------------|
| `SELECT * FROM users WHERE id = 101` | `select * from users where id = ?` |
| `SELECT * FROM users WHERE id = 202` | `select * from users where id = ?` (SAME! Cache Hit) |
| `SELECT * FROM products WHERE price > 100` | `select * from products where price > ?` |

### 2. Cache Hit vs Cache Miss

| Type | Description | Performance |
|------|-------------|-------------|
| **Cache Hit** | Query's normalized form exists in cache | 1-3 ms (30-60x faster) |
| **Cache Miss** | Query's normalized form NOT in cache | 45-85 ms (must generate plan) |

**Why Cache Hits Matter:**
- Each cache hit saves 40-80 ms of plan generation time
- With 1000 queries/second, saving 60 ms = 60 seconds saved per second!
- Higher hit ratio = better performance

### 3. Cache Structure

| Component | Description |
|-----------|-------------|
| **Key** | Normalized query string (e.g., `"select * from users where id = ?"`) |
| **Value** | QueryPlan object (ID, cost, tables, version, accessCount) |
| **Storage** | ConcurrentHashMap (thread-safe, O(1) operations) |

### 4. Cache Invalidation Strategy

**Problem:** When table schema changes (`ALTER TABLE`), cached plans become STALE and may produce WRONG results!

**Solution - Table-based Invalidation:**

| Step | Action |
|------|--------|
| 1 | Each QueryPlan tracks tables it accesses |
| 2 | Schema versions maintained per table |
| 3 | On schema change, increment version for affected table |
| 4 | Remove all cached plans accessing that table |
| 5 | Future queries regenerate with new schema |

**Why this approach:** Correctness guaranteed, only invalidates necessary plans, fast O(n) scan.

### 5. Performance Improvement Calculation

| Metric | Without Cache | With Cache | Improvement |
|--------|---------------|------------|-------------|
| Total Time | 1414 ms | 599 ms | 57.6% faster |
| Avg Time/Query | 83.18 ms | 35.24 ms | 2.4x speedup |
| Hit Ratio | N/A | 47.1% | Efficient reuse |

**Real-world impact:** 1 million queries/day with 47% hit ratio saves ~6.3 hours per day!

## 🏗️ System Architecture
```
SQL Query Input (SELECT * FROM users WHERE id = 101)
│
▼
┌─────────────────────────────────────────────────────────────┐
│ ANTLR Lexer & Parser │
│ • Tokenizes SQL into lexemes │
│ • Builds Abstract Syntax Tree (AST) │
└─────────────────────────────────────────────────────────────┘
│
▼
┌─────────────────────────────────────────────────────────────┐
│ QueryVisitor (Normalization) │
│ • Walks AST using Visitor pattern │
│ • Replaces literals (101, 'John') with '?' │
│ • Returns: "select * from users where id = ?" │
└─────────────────────────────────────────────────────────────┘
│
▼
┌─────────────────────────────────────────────────────────────┐
│ QueryService (Cache Logic) │
│ • Uses normalized string as cache key │
│ • Checks cache: exists? → HIT, else → MISS │
│ • On HIT: Return cached plan (1-3 ms) │
│ • On MISS: Generate new plan (45-85 ms) │
└─────────────────────────────────────────────────────────────┘
│
▼
┌─────────────────────────────────────────────────────────────┐
│ QueryPlanCache (Storage) │
│ • ConcurrentHashMap for thread-safe access │
│ • Key: normalized query string │
│ • Value: QueryPlan (ID, cost, tables, version) │
│ • Invalidation: Remove plans when schema changes │
└─────────────────────────────────────────────────────────────┘
```
give this in markupna then I can put in readme
