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

### Installation

```bash
git clone https://github.com/yourusername/socialmedia-app.git
cd socialmedia-app

MongoDB Configuration
Edit your application.properties:

spring.data.mongodb.uri=mongodb://localhost:27017/socialmedia

MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/socialmedia
spring.datasource.username=root
spring.datasource.password=yourpassword

▶️ Running the Application 
Copy
Edit
mvn clean install
mvn spring-boot:run

Access Swagger Docs: http://localhost:8080/swagger-ui/index.html

React Frontend: http://localhost:3000

📦 Modules & API Endpoints
1. 👤 User Management
Method	Endpoint	Description
GET	/api/users	Get all users
GET	/api/users/{id}	Get user by ID
POST	/api/users	Register user
PUT	/api/users/{id}	Update user
DELETE	/api/users/{id}	Delete user
2. 📝 Post Management
Method	Endpoint	Description
GET	/api/posts	Get all posts
POST	/api/posts	Create new post
DELETE	/api/posts/{id}	Delete post
GET	/api/posts/user/{userId}	Get posts by user
3. 🔁 Follow System
Method	Endpoint	Description
POST	/api/follows/follow	Follow a user
POST	/api/follows/unfollow	Unfollow a user
GET	/api/follows/user/{userId}	Get following list
4. ❤️ Likes (MongoDB)
Method	Endpoint	Description
GET	/api/likes	Get all likes
POST	/api/likes	Like a post
DELETE	/api/likes?postId=&userId=	Unlike a post
GET	/api/likes/user/{userId}	Likes by user
GET	/api/likes/post/{postId}	Likes on a specific post
5. 💬 Comments (MongoDB)
Method	Endpoint	Description
POST	/api/comments	Add a comment
GET	/api/comments/post/{postId}	Get comments for a post
6. 🏷️ Tag Management
Method	Endpoint	Description
POST	/api/tags	Create a tag
GET	/api/tags	Get all tags
DELETE	/api/tags/{id}	Delete a tag by ID
7. 🔔 Notifications (MongoDB)
Method	Endpoint	Description
POST	/api/notifications	Create notification
PUT	/api/notifications/read/{id}	Mark notification as read
GET	/api/notifications/user/{userId}	Get notifications by user ID
8. ✉️ Messages (MongoDB)
Method	Endpoint	Description
POST	/api/messages	Send a message
GET	/api/messages/user/{userId}	Get messages by user ID
9. 🧩 Post-Tag Mapping
Method	Endpoint	Description
POST	/api/post-tags	Associate tag with post
GET	/api/post-tags	Get all post-tag mappings
DELETE	/api/post-tags/{id}	Remove tag from post
📊 MongoDB Collections Used
comments

likes

notifications

messages

🔧 Example SQL Tables
users, posts, follows, tags, post_tags, media

✅ API Documentation
Swagger UI for testing:

📍 http://localhost:8080/swagger-ui/index.html

📈 Future Enhancements
🔐 JWT Authentication

🛡️ Role-Based Access Control

🔍 Full-text Post Search

📱 Mobile App with React Native / Flutter

📊 Dashboard with analytics

📜 License
MIT License © 2025
