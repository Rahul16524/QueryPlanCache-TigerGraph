## Query Plan Cache  - Java Implementation

## 📋 Project Overview

This project implements a **Query Plan Caching Mechanism** in Java that optimizes SQL query execution by storing and reusing execution plans for structurally identical queries. When similar queries with different literal values execute (e.g., `SELECT * FROM users WHERE id = 101` and `SELECT * FROM users WHERE id = 202`), the system recognizes their structural similarity and reuses the cached plan, eliminating redundant parsing and optimization overhead. This mimics how real database systems like Oracle, PostgreSQL, and MySQL use plan caching to improve query performance.

## 🎯 Problem Statement

In real-world databases, executing queries repeatedly with different parameter values triggers redundant plan generation, wasting computation time. For example, an e-commerce application might execute `SELECT * FROM orders WHERE customer_id = 101` and `SELECT * FROM orders WHERE customer_id = 202` thousands of times per day. Without caching, the database generates a nearly identical execution plan each time, consuming CPU cycles and increasing response time. This project addresses this inefficiency by implementing a query plan cache that recognizes structural similarity between queries and reuses existing plans, demonstrating how production databases achieve high throughput under concurrent query loads.

## 🔧 Technologies & Tools Used

| Tool / Module | Version | Purpose | Key Functionalities |
|---------------|---------|---------|---------------------|
| **Java** | 11+ | Core programming language | Implements caching, normalization, and testing logic |
| **ANTLR** | 4.13.1 | SQL parsing and syntax tree generation | Converts SQL queries into structured parse trees, detects literals for normalization |
| **ConcurrentHashMap** | Java Built-in | Thread-safe cache storage | Stores and retrieves cached query plans, handles concurrent access |
| **Visitor Pattern** | Design Pattern | AST traversal | Walks parse tree and transforms queries by replacing literals |
| **UUID** | Java Built-in | Unique identifier generation | Creates unique Plan IDs for each query pattern |

### System Requirements

| Component | Minimum Version | Recommended | Purpose |
|-----------|----------------|-------------|---------|
| **Java JDK** | 11 | 17 or higher | Compile and run Java code |
| **ANTLR** | 4.13.1 | 4.13.1 | SQL grammar parsing (JAR file) |
| **Memory (RAM)** | 512 MB | 1 GB or more | Cache storage and parsing operations |
| **Disk Space** | 50 MB | 100 MB | Source code and compiled classes |
| **Operating System** | Windows / Linux / Mac | Any with Java support | Cross-platform compatibility |

### Required Files

| File | Location | Purpose |
|------|----------|---------|
| `antlr-4.13.1-complete.jar` | Project root or classpath | ANTLR library for grammar processing |
| `SQLite.g4` | `src/main/java/com/querycache/parser/` | ANTLR grammar definition file |

## 💡 Design Strategy

### 1. Identifying Similar Queries (Query Normalization)

**Strategy:** Transform constants into placeholders (`?`) so that queries with the same structure but different literal values produce the same normalized form.

**How it works:**
- Parse SQL query using ANTLR to build Abstract Syntax Tree (AST)
- Traverse AST using Visitor pattern
- Replace all literal values (numbers, strings) with `?`
- Preserve operators, table names, column names, and query structure
- Convert everything to lowercase for case-insensitive matching

**Example:**

Original: SELECT * FROM users WHERE id = 101
Normalized: select * from users where id = ?

Original: SELECT * FROM users WHERE id = 202
Normalized: select * from users where id = ? (SAME! Cache Hit)
