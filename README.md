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

Clone the repository:


git clone https://github.com/Khenidhruvin2001/socialmedia-app.git
cd socialmedia-app

## ⚙️ Configuration

| Component   | Configuration Details                                                                 |
|-------------|----------------------------------------------------------------------------------------|
| MongoDB     | `spring.data.mongodb.uri=mongodb://localhost:27017/socialmedia`                       |
| MySQL       | `spring.datasource.url=jdbc:mysql://localhost:3306/socialmedia`<br>`spring.datasource.username=root`<br>`spring.datasource.password=yourpassword` |
| Swagger     | Access at: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) |
| React Frontend | Access at: [http://localhost:3000](http://localhost:3000)                             |

