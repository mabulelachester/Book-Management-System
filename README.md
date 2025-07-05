# Book-Management-System

📚 Books Management System
A Spring Boot RESTful API for managing books in a library or bookstore environment, supporting CRUD operations with MySQL database, validation, Swagger/OpenAPI documentation, and structured exception handling.

✨ Features

✅ Add a new book

✅ Update existing books

✅ Delete books by ID

✅ Retrieve all books

✅ Find books by ID or name

✅ Input validation with clear error messages

✅ Global exception handling

✅ OpenAPI documentation with Swagger UI

✅ MySQL persistence

✅ Ready for CI/CD pipeline integration

🚀 Getting Started

1️⃣ Prerequisites

✅ Java 21+

✅ Maven 3.9+

✅ MySQL running locally on port 3306 with:

Database: bookdb

Username: root

Password: yourpassword (update in application.properties as needed)

✅ IDE (IntelliJ / Spring Tool Suite / VS Code)

2️⃣ Clone the Repository

git clone https://github.com/your-username/books-management-system.git

cd books-management-system

3️⃣ Database Setup

Run in your MySQL CLI or GUI:


CREATE DATABASE bookdb;

Spring Boot will auto-create the tblbook table using spring.jpa.hibernate.ddl-auto=update.

4️⃣ Run the Application

mvn spring-boot:run

The application will start on http://localhost:8084.

🛠️ API Endpoints

Base URL: http://localhost:8084/api

Method	Endpoint	Description

POST	/addBook	Add a new book

GET	/getAllBooks	Get all books

GET	/findByBookId/{bookId}	Get book by ID

GET	/findByBookName/{bookName}	Get books by name

PUT	/updateById/{bookId}	Update book by ID

DELETE	/deleteByBookId/{bookId}	Delete book by ID

✅ Example Book JSON Payload

{
  "bookName": "Effective Java",
  
  "bookDescription": "A comprehensive Java best practices guide",
  
  "isAvailable": true
}

📑 API Documentation

Once the app is running, access Swagger UI:

http://localhost:8084/swagger-ui/index.html




📬 Contact
Chester Mabulela
📧 chestermabulela@gmail.com

