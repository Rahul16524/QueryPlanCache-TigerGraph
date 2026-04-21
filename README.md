📋 Project Overview

This project implements a Query Plan Caching Mechanism in Java that optimizes SQL query execution by storing and reusing execution plans for structurally identical queries. When similar queries with different literal values execute (e.g., SELECT * FROM users WHERE id = 101 and SELECT * FROM users WHERE id = 202), the system recognizes their structural similarity and reuses the cached plan, eliminating redundant parsing and optimization overhead.

🎯 Problem Statement

In real-world databases, executing queries repeatedly with different parameter values triggers redundant plan generation, wasting computation time. For example, two queries with different parameter values but identical structure may produce identical execution plans — yet most systems will re-plan them each time. This project addresses this inefficiency by implementing a query plan cache that recognizes structural similarity between queries and reuses existing plans.

<img width="1095" height="536" alt="image" src="https://github.com/user-attachments/assets/5bfdcc8b-39ae-495c-98c8-9ed161099d29" />

## 🔧 Technologies & Tools Used

| Tool / Module | Version | Purpose | Key Functionalities |
|---------------|---------|---------|---------------------|
| **Java** | 11+ | Core programming language | Implements caching, normalization, and testing logic |
| **ANTLR** | 4.13.1 | SQL parsing and syntax tree generation | Converts SQL queries into structured parse trees, detects literals for normalization |
| **ConcurrentHashMap** | Java Built-in | Thread-safe cache storage | Stores and retrieves cached query plans, handles concurrent access |
| **Visitor Pattern** | Design Pattern | AST traversal | Walks parse tree and transforms queries by replacing literals with placeholders |
| **UUID** | Java Built-in | Unique identifier generation | Creates unique Plan IDs for each query pattern |
