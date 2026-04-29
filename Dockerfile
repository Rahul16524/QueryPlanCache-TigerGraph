# Step 1: Use an official Java image as the base
# This gives us Java 21 pre-installed — no need to install it ourselves
FROM eclipse-temurin:21-jdk

# Step 2: Set the working directory inside the container
# All commands below will run from /app
WORKDIR /app

# Step 3: Copy your entire project source into the container
COPY src/ ./src/

# Step 4: Download the ANTLR JAR file
# curl is available in this image, so we download the JAR directly
RUN apt-get update && apt-get install -y curl && \
    curl -O https://www.antlr.org/download/antlr-4.13.2-complete.jar

# Step 5: Compile all Java source files
# -encoding UTF-8 prevents character issues
# -cp tells Java where to find the ANTLR library
RUN javac -encoding UTF-8 \
    -cp ".:antlr-4.13.2-complete.jar" \
    src/com/querycache/cache/QueryPlanCache.java \
    src/com/querycache/metrics/CacheMetrics.java \
    src/com/querycache/model/QueryPlan.java \
    src/com/querycache/parser/*.java \
    src/com/querycache/service/QueryService.java \
    src/com/querycache/test/QueryPlanCacheTest.java

# Step 6: Define the command to run when the container starts
# This runs your test suite (the main entry point of your project)
CMD ["java", "-cp", ".:src:antlr-4.13.2-complete.jar", "com.querycache.test.QueryPlanCacheTest"]