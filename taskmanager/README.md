Smart Task Management System
A RESTful backend API built with Spring Boot and MongoDB. This project provides a simple task management system featuring secure user authentication, JWT-based session management, and Role-Based Access Control (RBAC).

Features
Secure Login: User registration and login protected by Spring Security and BCrypt.

JWT Authorization: Secure APIs using JSON Web Tokens (JWT).

Role-Based Access Control:

ADMIN: Can create projects, view all users, and assign tasks.

USER: Can view their assigned tasks and update task status.

Tech Stack
Language: Java 21

Framework: Spring Boot 3.x

Security: Spring Security & JWT

Database: MongoDB

Build Tool: Maven

How to Run the Project
Make sure MongoDB is running locally on port 27017 (use MongoDB Compass).

Open the project in your IDE.

Run the TaskManagerApplication.java file.

The server will start on http://localhost:8080.

API Endpoints
POST /api/auth/register - Register a new user

POST /api/auth/login - Login and get JWT token

POST /api/admin/projects/create - Create a project (Admin only)

GET /api/users/all - Get all users (Admin only)

POST /api/tasks/admin/create - Assign a task (Admin only)

GET /api/tasks/my-tasks/{userId} - View your tasks (User)

PUT /api/tasks/{taskId}/status?status=COMPLETED - Update task status