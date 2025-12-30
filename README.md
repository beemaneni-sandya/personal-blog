# Personal Blog Application

## Overview
A Spring Boot–based personal blog application that allows creating, managing,
and displaying blog content using server-side rendering. The project
demonstrates core web application concepts using the MVC pattern and clean
application structure.

## Problem Statement
Managing blog content without a structured application can become difficult
to maintain and extend. This project provides a lightweight blogging platform
that centralizes content management and presentation.

## Solution
The application enables:
- Creation and management of blog articles
- Server-side rendering of blog content
- Clean separation between controllers, views, and content
- Simple, maintainable application structure

## Architecture
The project follows a structured application design:
- **Controller / Routing Layer** – Handles incoming requests
- **Service / Logic Layer** – Manages business logic
- **Data Layer** – Handles data storage and retrieval
- **Configuration Layer** – Application configuration and setup

## Tech Stack
- **Language:** Java 17
- **Framework:** Spring Boot
- **Web:** Spring Boot Web (MVC)
- **Templating Engine:** Thymeleaf
- **Build Tool:** Maven
- **Server:** Embedded Tomcat
- **Version Control:** Git

## Key Features
- Server-rendered blog pages using Thymeleaf
- Structured MVC application design
- File-based content storage for simplicity
- Easy to extend and customize

## How to Run
1. Clone the repository:
   ```bash
   git clone git@github.com:beemaneni-sandya/personal-blog.git
2. Navigate to the project directory:
   ```bash
   cd personal-blog
3. Run the application:
   ```bash
   ./mvnw spring-boot:run
4. Open in browser:
   ```bash
   http://localhost:8080


## Future Enhancements
- Database-backed content storage
- User authentication and authorization
- Rich text editor support
- Deployment to cloud platforms
