# MyCalculator
 Educational project. Testing
Stage 1: Create a calculator
Step 1
Create a Spring Boot calculator project.
Step 2
Include the Spring Web module upon creation.
Stage 2: Code Coverage with Tests
Before adding dependencies, check that there is no dependency in your project (pom.xml)
spring-boot-starter-test
Step 1. Finalize the division method.
Now, if you pass the number 0 as the second parameter, you need to throw the exception of its successor IllegalArgumentException from the calculator method with the corresponding error text. The controller can no longer be used to check a parameter.

Step 2. Create a test class and write tests for all calculator methods in it. 2 sets of parameters for each.
Write an additional test for the division method that checks for throwing an exception.
