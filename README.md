# Job Posting Web Application (Backend)

A RESTful web application built using Spring Boot for managing job listings with full CRUD support. Implements layered architecture with JPA and MySQL.

## 🔧 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## ✅ Features

- Add, update, delete, and view job posts
- RESTful API architecture
- Layered design with controller, service, repository

## 🧱 Project Structure

- `controller/` – REST endpoints
- `service/` – Business logic
- `repository/` – JPA interfaces
- `model/` – Job entity

## 🚀 Getting Started

### Prerequisites
- Java 17+
- Maven
- MySQL

### Run Locally

```bash
git clone https://github.com/nikhilmangali1/JobPost.git
cd JobPost
./mvnw spring-boot:run
