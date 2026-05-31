# Renovation Budget Tracker
[![Java CI](https://github.com/Britten66/reno-budget-tracker/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/Britten66/reno-budget-tracker/actions/workflows/maven.yml)
 
A REST API for tracking a home renovation budget across categories like paint, flooring, and extras. Built with Java and Spring Boot, tested with JUnit 5.
 
## Why I built this
 
I'm renovating and splitting one investment across a few jobs such as paint, flooring, taking out a wall. I wanted a simple way to track spending against the budget, and it turned into a project to get hands-on with Spring Boot, unit testing, and a CI pipeline.
 
## What it does
 
You add expenses by category and it does the math: total spent, budget remaining, spending per category, whether you've gone over budget, and what percent of the budget is used. It runs as a web API, so each of those is reachable at a URL.


## Testing

For testing I used @BeforeEach to avoid repeating setup before each test, and a parameterized test to check multiple category inputs (paint, Paint, PAINT)

#
here are my passing tests.

<img width="608" height="353" alt="image" src="https://github.com/user-attachments/assets/e3315613-4a2b-4037-8b5d-df50aa5a18f6" />

#

#
Part of clean code used is meaningful names, for expenses and tests it was important to make sure all defined variables and classes were clearly defined 

#
here is a showcase of some of those names that stand out to me in this project 

<img width="631" height="221" alt="image" src="https://github.com/user-attachments/assets/05d8da03-4e85-417d-ac40-b683b0c68c9c" />

#
here is a showcase of using immutablilty by creating expense with using final also with no setters, so a cost can't be changed after it's created.
The constructor also rejects negative amounts.
<img width="649" height="205" alt="image" src="https://github.com/user-attachments/assets/b15c2fc4-c4bd-4e3e-a9db-a9b22c7a4a4f" />

#



here is an example of my actions passing along with secret protection 
#

<img width="531" height="335" alt="image" src="https://github.com/user-attachments/assets/f8e9e2c2-602f-4709-bee5-10f9d6b8ed21" />


## Tech & dependencies
 
- **Java 21**
- **Spring Boot**  generated from start.spring.io with the Spring Web dependency
- **JUnit 5**
- **Maven** build and dependencies
## CI
 
A GitHub Actions workflow runs the test suite on every pull request to `main` runs `./mvnw test`. Builds pass green before anything merges.
 

## Here is a problem I hit
 
When I moved the project between machines, the Maven wrapper folder (`.mvn`) didn't come across because hidden folders got skipped. I fixed it by installing Maven and running `mvn -N wrapper:wrapper` to regenerate it... which mattered because GitHub Actions runs `./mvnw` and needs that folder.

this cost me a day at least of trouble shooting figuring out why that was happening 
it resulted in my files being moved out of folders among other confusing bugs. 
 
---
 
Built by Christopher Britten 
