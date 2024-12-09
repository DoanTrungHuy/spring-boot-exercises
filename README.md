# Spring Boot Exercises  

This repository is designed to guide you through building a real-world backend service using Spring Boot. Each section focuses on critical components necessary for developing a robust and scalable application.  

---

## **Features Overview**  

### 1. **Project Initialization**  
- Build a foundational Spring Boot project with essential components for real-world backend services.

### 2. **Database Configuration**  
- Configure connections to a PostgreSQL database.  
- Develop RESTful APIs with mock data to interact with the database.

### 3. **User Management**  
#### **CRUD Operations**  
- **Create User**:  
  `POST /api/v1/user/add`  
- **Update User**:  
  `PUT /api/v1/user/upd`  
- **Change Password**:  
  `PATCH /api/v1/user/change-pwd`  
- **Confirm Registration**:  
  `PATCH /api/v1/user/confirm?secretCode={code}`  
- **Delete User**:  
  `DELETE /api/v1/user/del/{id}`  

#### **Advanced User Management**  
- **List Users**:  
  `GET /api/v1/user/list`  
- **Search Users**:  
  `GET /api/v1/user/search?firstName={firstName}&...`  
- **User Details**:  
  `GET /api/v1/user/detail/{userId}`  

### 4. **Validation, Debugging, and Exception Handling**  
- Guide on debugging with IntelliJ.  
- Implement advanced exception handling to ensure service stability.

### 5. **Email Functionality with SendGrid**  
- Send individual and bulk marketing emails.  
- Handle email verification for user registration.

### 6. **Security**  
- Overview and implementation of **Spring Security**.  
- Develop authentication APIs for login, logout, and password reset.  
- Implement Role-Based Access Control (**RBAC**) for managing user permissions.

### 7. **Code and Database Review**  
- Review database and source code to ensure high-quality standards.  
- Provide feedback for optimization.

### 8. **Logging and Monitoring**  
#### **Logging with ELK Stack**  
- Integrate **Elasticsearch**, **Logstash**, and **Kibana** for advanced logging.  

#### **Logging with Kafka**  
- Aggregate logs and push them to Kafka for large-scale applications.

#### **Monitoring with Grafana and Prometheus**  
- Set up **Grafana** and **Prometheus** to monitor application performance and metrics.

### 9. **Build and Deployment**  
- Build and package the application using Docker.  
- Push the packaged application to a repository.

### 10. **CI/CD Integration**  
- Implement CI/CD pipelines with tools like **SonarQube** for code quality checks.
