# MobileFoundary 📱🏬

[![GitHub Repo](https://img.shields.io/badge/GitHub-Mobile%20Foundary-blue)](https://github.com/Shilpask123/Mobile-Foundary)

**Mobile Foundary** is a Java **Spring Boot** backend application that allows users to **browse and explore mobile phones** with detailed specifications. It includes **customers, products, and purchase management**, using **MySQL Workbench** as the database.  

The project follows a layered architecture using Controllers, Services, Repositories, and Entities, and exposes RESTful APIs.

This project demonstrates **Spring Boot MVC architecture, REST APIs, and MySQL integration**.

---

## 🚀 Features

### 👤 Customer Management
- Customer Registration
- Customer Login

### 📦 Product Management
- Add Mobile Products
- View Products
- Update Product Details
- Delete Products

### 🛒 Purchase Management
- Purchase Mobile Products
- Store Purchase Records
- Payment Processing (Service Layer)


---

## 🧰 Technologies Used

| Layer | Technology |
|-------|-----------|
| Backend | Java, Spring Boot, Spring MVC |
| Database | MySQL (Workbench) |
| ORM | JPA/Hibernate |
| Build Tool | Maven |
| Version Control | Git, GitHub |

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 4.0.0**
- **Spring Web MVC**
- **Spring Data JPA (Hibernate)**
- **MySQL 8**
- **Lombok**
- **Maven**
- **Embedded Tomcat Server**

---

## 🧱 Project Structure

MobileFoundary
│
├── src/main/java/com/retouch/MobileFoundary
│   ├── Controller
│   │   ├── CustomerController.java
│   │   ├── ProductController.java
│   │   └── PurchaseController.java
│   │
│   ├── Entity
│   │   ├── Customer.java
│   │   ├── Product.java
│   │   └── Purchase.java
│   │
│   ├── Repository
│   │   ├── CustomerRepository.java
│   │   ├── ProductRepository.java
│   │   └── PurchaseRepository.java
│   │
│   ├── Services
│   │   ├── PurchaseServices.java
│   │   └── PaymentGateway.java
│   │
│   └── MobileFoundaryApplication.java
│
├── src/main/resources
│   └── application.properties
│
├── src/test/java
│   └── MobileFoundaryApplicationTests.java
│
├── pom.xml
└── README.md

---

## 🗄️ Database

- **Database Name:** `mobilefoundary`
- **ORM Tool:** Hibernate (JPA)
- Tables are auto-created/updated using JPA annotations.

> ⚠️ Sensitive configuration values are excluded from GitHub using `.gitignore`.

---

## 🔗 REST API Endpoints

### 👤 Customer APIs

---

## 🧪 Testing

- APIs tested using **Postman**
- Spring Boot Test dependencies included

---

## 🧠 Key Concepts Used

- RESTful API design
- Spring Boot annotations
- JPA & Hibernate ORM
- Entity relationships
- Service layer abstraction
- Database CRUD operations
- Exception handling basics
- Git & GitHub version control

---

## 🔐 Future Enhancements

- Spring Security with JWT
- Password encryption
- Global exception handling
- Swagger API documentation
- Pagination and sorting
- Cloud deployment

---

## 📌 Conclusion

This project demonstrates real-world backend development using Spring Boot and MySQL, focusing on clean architecture, maintainability, and REST API best practices.
