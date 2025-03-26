# Social Media RESTful API

A full-stack Spring Boot + React application for managing users, posts, follows, likes, comments, and notifications using both MySQL and MongoDB.  
This project demonstrates hybrid SQL + NoSQL integration, RESTful API design, and end-to-end social media functionality.

---

## 📄 Project Report

Includes detailed API testing with Swagger, feature demonstration via screenshots, and backend architecture design.

---

## 🚀 Features

- User Registration & Management (CRUD)
- Post Creation, Search & Deletion
- Follower System (Follow/Unfollow Users)
- Commenting System (MongoDB)
- Likes (MongoDB)
- Tagging System
- Messaging (MongoDB)
- Notifications (MongoDB)
- Swagger API Documentation
- Exception Handling and Validation

---

## 🛠 Tech Stack

| Technology        | Purpose                                 |
|-------------------|-----------------------------------------|
| **Java 21**       | Core backend logic                      |
| **Spring Boot**   | RESTful API framework                   |
| **MySQL**         | Relational storage for Users, Posts     |
| **MongoDB**       | NoSQL storage for Comments, Likes, etc. |
| **React.js**      | Frontend Interface                      |
| **Swagger**       | API Documentation                       |
| **Maven**         | Dependency Management                   |

---

## 🧰 Getting Started

### Prerequisites

- Java 21+
- MySQL & MongoDB installed
- Maven

---

## Installation

## 📦 Clone the Repository

```bash
git clone https://github.com/Khenidhruvin2001/socialmedia-app.git
cd socialmedia-app
```

---

## ⚙️ Configuration

### 🟢 MongoDB
Edit your `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/socialmedia
```

### 🟡 MySQL

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/socialmedia
spring.datasource.username=root
spring.datasource.password=yourpassword
```

---

## ▶️ Running the Application

```bash
mvn clean install
mvn spring-boot:run
```

- Swagger UI: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)
- React Frontend: [http://localhost:3000](http://localhost:3000)

---

## 📚 Modules & API Endpoints

### 1. 👤 User Management

| Method | Endpoint          | Description       |
|--------|-------------------|-------------------|
| GET    | /api/users        | Get all users     |
| GET    | /api/users/{id}   | Get user by ID    |
| POST   | /api/users        | Register user     |
| PUT    | /api/users/{id}   | Update user       |
| DELETE | /api/users/{id}   | Delete user       |

### 2. 📝 Post Management

| Method | Endpoint               | Description        |
|--------|------------------------|--------------------|
| GET    | /api/posts             | Get all posts      |
| POST   | /api/posts             | Create new post    |
| DELETE | /api/posts/{id}        | Delete post        |
| GET    | /api/posts/user/{id}   | Get posts by user  |

### 3. 🔁 Follow System

| Method | Endpoint                    | Description         |
|--------|-----------------------------|---------------------|
| POST   | /api/follows/follow         | Follow a user       |
| POST   | /api/follows/unfollow       | Unfollow a user     |
| GET    | /api/follows/user/{userId}  | Get following list  |

### 4. ❤️ Likes (MongoDB)

| Method | Endpoint                      | Description             |
|--------|-------------------------------|-------------------------|
| GET    | /api/likes                    | Get all likes           |
| POST   | /api/likes                    | Like a post             |
| DELETE | /api/likes                    | Remove a like           |
| GET    | /api/likes/user/{userId}      | Get likes by user       |
| GET    | /api/likes/post/{postId}      | Get likes for a post    |

---
