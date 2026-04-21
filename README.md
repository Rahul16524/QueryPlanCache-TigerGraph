📋 Project Overview 

This project implements a Query Plan Caching Mechanism in Java that optimizes SQL query execution by storing and reusing query plans. It demonstrates how databases can avoid regenerating execution plans for similar queries by using query normalization, ANTLR-based parsing, and mock plan generation. The goal is to illustrate the internal workflow of a query cache mechanism in a simplified Java environment.

🎯 Problem Statement

In real-world databases, executing queries repeatedly with different literal values often triggers redundant plan generation, consuming extra computation time. For example, two queries with different parameter values but identical structure may produce identical execution plans — yet most systems will re-plan them each time. This project addresses that inefficiency by implementing a query plan cache that recognizes structural similarity between queries and reuses existing plans.
