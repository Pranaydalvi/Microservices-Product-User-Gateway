# Microservices Product User Gateway

This repository demonstrates a microservices-based architecture built with Spring Boot. It includes services for managing **Products** and **Users**, with features like service discovery, API gateway integration, and inter-service communication using Feign Client.

## 🌟 Features

- **ProductService**: Manage products (CRUD operations).
- **UserService**: Manage users (CRUD operations).
- **Service Registration**: Eureka Server for dynamic service discovery.
- **Zuul Gateway**: API gateway for routing and load balancing.
- **Feign Client**: Simplified inter-service communication.
- **Scalable Architecture**: Separate services for easy scaling and management.
- **Spring Boot**: Framework for building and deploying microservices.

---

## 🏗️ Project Structure

1. **ProductService**: Handles product-related operations.
2. **UserService**: Manages user-related functionalities.
3. **ServiceRegistration**: Eureka Server for service discovery.
4. **ZuulService**: Gateway service using Zuul for routing and filtering requests.
5. **FeignClient**: Enables easy communication between ProductService and UserService.

---

## ⚙️ Technology Stack

- **Language**: Java 8
- **Framework**: Spring Boot
- **Service Discovery**: Eureka
- **API Gateway**: Zuul
- **Inter-Service Communication**: Feign Client
- **Build Tool**: Maven
- **Database**: MySQL (or H2 for testing)

---

## 🚀 Setup and Run Instructions

1. Clone the repository and navigate to the project directory.

2. Build the project using Maven.

3. Start the services in the following order:
   - ServiceRegistration (Eureka)
   - ProductService
   - UserService
   - ZuulService (Gateway)

4. Use the API Gateway to access the services:
   - `http://localhost:8765/product-service/...`
   - `http://localhost:8765/user-service/...`

---

## 📜 API Endpoints

### ProductService
- **GET** `/products`: Fetch all products.
- **POST** `/products`: Add a new product.
- **PUT** `/products/{id}`: Update a product.
- **DELETE** `/products/{id}`: Delete a product.

### UserService
- **GET** `/users`: Fetch all users.
- **POST** `/users`: Add a new user.
- **PUT** `/users/{id}`: Update a user.
- **DELETE** `/users/{id}`: Delete a user.

---

## 🛠️ Future Enhancements

- Add authentication and authorization with Spring Security and JWT.
- Implement resilience patterns using Hystrix or Resilience4j.
- Add monitoring with Spring Boot Actuator and distributed tracing tools like Zipkin or Sleuth.
