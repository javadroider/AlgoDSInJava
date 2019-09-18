## Example 1: Tuning performance
**Situation**: Performance problem where the application server had to be restarted every second day.

**Action**:

– Used JMeter to simulate the load conditions.

– Identified the cause of the problem to be leaking database connections due to not properly closing the connections under an exceptional scenario.

– Used the profiling tool “VisualVM” & identified a memory leak where long living objects were holding on to short lived objects. jvisualvm to detect memory leak.

– Fixed the database connection leaks by closing the connections in a finally block.

– Fixed the code to release memory consumed by the short lived objects.

– Tuned the JVM & GC settings. 15 key considerations to write low latency applications in Java

– Load and endurance tested the fixed code with the load testing tool JMeter to confirm that the issue has been fixed.

Result: The application became a true mission critical 24×7 type with a much improved performance.

## Example 2: Code quality

**Situation**: Java code that is hard to maintain and reuse. Changes to one module may break another module.

**Action**:

– Wrote unit tests with proper Mockito mock objects for the existing un-maintainable code.

– Introduced SonarQube to ascertain code coverage & code quality metrics. Fixed the blocker, critical, and major severity items.

– Re-factored the code with OO concepts and design patterns in a test driven manner to improve maintainability.

– Large procedural style if/else statements were replaced with objects adhering to the Open-Closed design principle.

– Code duplication was eliminated with the help of SonarQube tool & refactoring.

– Reran the unit tests to ensure that the functionality is not broken due to refactoring.

Result: The application became much easier to maintain, extend, and reuse. The test coverage was increased from 27% to 76%.
