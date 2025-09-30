# Internship Project

This repository contains my **internship projects**, structured by weeks.  
Each week builds upon the previous one, gradually forming a complete Spring Boot application.

---

## Week 1: Environment Setup & Project Initialization
Focus: Establishing the core development environment and generating the foundational Spring Boot project.

- Created a basic Spring Boot project using [Spring Initializr](https://start.spring.io/).
- Implemented a simple REST controller with a **"Hello World"** endpoint.
- Tested in the browser: [http://localhost:8080/hello](http://localhost:8080/hello).

---

## Week 2: Version Control, Project Structure & Initial Database Integration
Focus: Introducing Git version control, logical package organization, and database setup.

- Verified and updated `.gitignore` (added `.env`, `.gitattributes`, `pom.xml`, etc.).
- Added a clear **README.md** documenting weekly progress.
- Created 4 main packages:
    - `controller`
    - `model`
    - `repository`
    - `service`
- Moved `HelloWorld` controller into the **controller** package.
- Configured **H2 in-memory database**:
    - Updated `src/main/resources/application.properties`.
    - Verified via [http://localhost:8080/h2-console](http://localhost:8080/h2-console).
- Created `User` entity in the **model** package with JPA annotations.
- Added `UserRepository` interface in the **repository** package.

---

## Week 3: User Registration & Login (Backend)
Focus: Building foundational backend components for authentication.

- Integrated **BCrypt password hashing** using Spring Security Crypto.
- Added **DTOs** for user registration and login.
- Implemented `UserService` and `UserServiceImpl`:
    - `registerUser()` saves new users with hashed passwords.
    - `findByUsername()` retrieves users by username.
    - `verifyLogin()` checks raw password against stored hash.
- Created `AuthController` with REST endpoints:
    - `POST /api/auth/register` → Register a new user.
    - `POST /api/auth/login` → Verify credentials.
- Verified endpoints via Postman / cURL.

---

## ⚡ Tech Stack
- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Spring Security Crypto
- Maven/Gradle

---

## 🗺️ Roadmap
- ✅ Week 1–3: Core setup, DB, basic authentication
- 🔜 Week 4+: Add JWT authentication, roles/permissions
- 🚀 Long-term: Extend into a learning platform prototype
