# Renovation Budget Tracker
 
A REST API for tracking a home renovation budget across categories like paint, flooring, and extras. Built with Java and Spring Boot, tested with JUnit 5.
 
## Why I built this
 
I'm renovating and splitting one investment across a few jobs such as paint, flooring, taking out a wall. I wanted a simple way to track spending against the budget, and it turned into a project to get hands-on with Spring Boot, unit testing, and a CI pipeline.
 
## What it does
 
You add expenses by category and it does the math: total spent, budget remaining, spending per category, whether you've gone over budget, and what percent of the budget is used. It runs as a web API, so each of those is reachable at a URL.


## Testing

For testing I used @BeforeEach to avoid repeating setup before each test, and a parameterized test to check multiple category inputs (paint, Paint, PAINT)

#


#



here is an example of my actions passing along with secret protection 

<img width="531" height="335" alt="image" src="https://github.com/user-attachments/assets/f8e9e2c2-602f-4709-bee5-10f9d6b8ed21" />

#

## Tech & dependencies
 
- **Java 21**
- **Spring Boot**  generated from start.spring.io with the Spring Web dependency
- **JUnit 5**
- **Maven** build and dependencies
## CI
 
A GitHub Actions workflow runs the test suite on every pull request to `main` runs `./mvnw test`. Builds pass green before anything merges.
 
## Clean code
 
A few things I focused on:
 
- Meaningful names: descriptive loop variables like `singleExpense` instead of `e` (a habit from *Clean Code*, Ch. 2)
- Immutability:  `Expenses` can't be changed once created
One job per class .. Expenses holds a cost, BudgetTracker does calculations, BudgetController handles the web layer.
  
## Here is a problem I hit
 
When I moved the project between machines, the Maven wrapper folder (`.mvn`) didn't come across because hidden folders got skipped. I fixed it by installing Maven and running `mvn -N wrapper:wrapper` to regenerate it... which mattered because GitHub Actions runs `./mvnw` and needs that folder.

this cost me a day at least of trouble shooting figuring out why that was happening 
it resulted in my files being moved out of folders among other confusing bugs. 
 
---
 
Built by Christopher Britten 
