# MobileFoundary 📱🏬

[![GitHub Repo](https://img.shields.io/badge/GitHub-Mobile%20Foundary-blue)](https://github.com/Shilpask123/Mobile-Foundary)

**Mobile Foundary** is a **Java Spring Boot backend application** that allows users to **browse and explore mobile phones** with detailed specifications. The application provides features for **customer management, product management, and purchase tracking**, and it uses **MySQL Workbench** as the database.

---

## 🏗️ Project Architecture

The project follows a **layered architecture**:

- **Controllers** – Handle incoming HTTP requests and route them to the appropriate services.  
- **Services** – Contain business logic and coordinate interactions between controllers and repositories.  
- **Repositories** – Perform database operations using **JPA/Hibernate**.  
- **Entities** – Represent database tables as Java classes.

---

## 🔗 RESTful APIs

The application exposes **RESTful APIs** for all core operations and demonstrates:

- **Spring Boot MVC architecture**  
- **Integration with MySQL database**  
- **CRUD operations** for customers, products, and purchases  
- **Structured, maintainable, and scalable backend design**

---

> ⚠️ Sensitive configuration values (like database username/password) are excluded from GitHub using `.gitignore`.

---

## 🚀 Features

### 👤 Customer Management
- Customer Registration
- Customer Login
- View Customer Details

### 📦 Product Management
- Add Mobile Products
- View Products
- Update Product Details
- Delete Products
- Search products by brand or name
- Sort products by price

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

```bash
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
```
---
## 🗄️ Database

- **Database Name:** `mobilefoundary`  
- **Database Tool:** MySQL Workbench  

> ⚠️ Tables were created automatically in MySQL Workbench using **JPA entity classes** from the project.

- **Tables:**  
  1. **Customer** – stores customer information (id, name, email, phone)  
  2. **Product** – stores mobile product details (id, name, brand, price, specs)  
  3. **Purchase** – stores purchase details linking Customer and Product  

> ⚠️ Make sure your `application.properties` is configured for MySQL:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mobilefoundary
spring.datasource.username=your_username   # Replace with your MySQL username
spring.datasource.password=your_password   # Replace with your MySQL password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

---

## 🔗 REST API Endpoints

### 👤 Customer APIs
- POST /customers/register
- POST /customers/login

### 📦 Product APIs
- GET /products
- POST /products
- PUT /products/{id}
- DELETE /products/{id}

### 🛒 Purchase APIs
- POST /purchase
- GET /purchase/history

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
