
# Smart Task Management System – Backend API

A secure and scalable RESTful backend API developed using Java and Spring Boot as part of my **Java Development Internship at Oasis Infobyte (AICTE OIB-SIP)**.

This project demonstrates practical backend development skills, including REST API design, secure authentication, JWT-based authorization, role-based access control, and MongoDB database integration.

---

## 📌 Internship Information

| Detail | Information |
|---|---|
| Internship | Java Development Internship |
| Organization | Oasis Infobyte |
| Program | AICTE OIB-SIP Virtual Internship |
| Duration | June 2026 – July 2026 |
| Developer | Piyush Thakur |

> This project was developed during my Oasis Infobyte Java Development Internship to strengthen my practical Java and backend development skills.

---

## 🚀 Project Overview

The Smart Task Management System is a backend application designed to manage users, projects, and tasks through secure RESTful APIs.

The system provides authentication and authorization features that allow administrators to manage projects and assign tasks, while users can access their assigned tasks and update their task status.

---

## ✨ Key Features

### 🔐 Secure Authentication
- User registration and login.
- Password encryption using BCrypt.
- Spring Security integration.

### 🔑 JWT-Based Authorization
- Secure API access using JSON Web Tokens.
- Token-based authentication.
- Protected backend endpoints.

### 👥 Role-Based Access Control (RBAC)

**ADMIN**
- Create projects.
- View all users.
- Assign tasks to users.

**USER**
- View assigned tasks.
- Update task status.

### 📋 Task Management
- Create and assign tasks.
- View assigned tasks.
- Update task status.

### 🗄️ Database Integration
- MongoDB integration.
- Persistent storage for application data.

---

## 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java 21 | Programming Language |
| Spring Boot 3.x | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Token-Based Security |
| BCrypt | Password Encryption |
| MongoDB | Database |
| Maven | Build Tool |
| REST APIs | Backend Communication |

---

## 📂 Project Structure

```text
Smart-Task-Management-System-Backend-API/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │
│   └── test/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
└── .gitignore
```

---

## ⚙️ How to Run the Project

### Prerequisites

Make sure you have:

- Java 21 or compatible JDK.
- Maven (or use the included Maven Wrapper).
- MongoDB installed and running.
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code.

### Step 1: Clone the Repository

```bash
git clone https://github.com/Piyushthakur99/Smart-Task-Management-System---Backend-API.git
```

### Step 2: Open the Project

Open the `taskmanager` project folder in your IDE.

### Step 3: Start MongoDB

Make sure MongoDB is running locally on:

```text
mongodb://localhost:27017
```

You can use MongoDB Compass to verify the database connection.

### Step 4: Run the Application

Run:

```text
TaskManagerApplication.java
```

Or using Maven:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The application will start at:

```text
http://localhost:8080
```

---

## 📡 API Endpoints

### Authentication

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login and receive JWT token |

### Admin APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/admin/projects/create` | Create a project |
| GET | `/api/users/all` | View all users |
| POST | `/api/tasks/admin/create` | Assign a task |

### User APIs

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/tasks/my-tasks/{userId}` | View assigned tasks |
| PUT | `/api/tasks/{taskId}/status?status=COMPLETED` | Update task status |

> API access depends on the authentication and authorization rules implemented in the application.

---

## 🎯 Learning Outcomes

Through this project, I gained practical experience in:

- Java backend development.
- Spring Boot application development.
- RESTful API design.
- Spring Security and JWT authentication.
- Role-Based Access Control.
- MongoDB integration.
- Backend business logic.
- API testing and debugging.
- Object-Oriented Programming.

---

## 👨‍💻 Developer

**Piyush Thakur**

B.Tech Computer Science & Engineering Student  
Java Backend Developer | Spring Boot | REST APIs

### Connect with me

- GitHub: [Piyushthakur99](https://github.com/Piyushthakur99)
- LinkedIn: [Piyush Thakur](https://www.linkedin.com/in/piyush-thakur2246/)

---

## ⭐ Acknowledgement

This project was developed as part of my Java Development Internship at **Oasis Infobyte** under the AICTE OIB-SIP Virtual Internship Program.

The internship provided valuable hands-on experience in Java programming, project development, and backend application development.
