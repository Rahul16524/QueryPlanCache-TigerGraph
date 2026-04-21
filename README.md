Query Plan Cache for Interpreted Queries
📋 Project Overview
This project implements a Query Plan Caching Mechanism that optimizes SQL query execution by storing and reusing execution plans for structurally identical queries. When similar queries with different literal values are executed (e.g., SELECT * FROM orders WHERE customer_id = 101 and SELECT * FROM orders WHERE customer_id = 202), the system recognizes their structural similarity and reuses the cached execution plan, eliminating redundant parsing and optimization overhead.
