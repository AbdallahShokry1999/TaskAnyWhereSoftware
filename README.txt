Spring Boot Web Application for Managing Student, Teacher, Quiz, and Course Data

-Overview
  This project is a backend-only web application developed using Java Spring Boot. It provides   functionalities to manage student, teacher, quiz, and course data for the current semester. The   application implements CRUD operations for each entity using Spring Data JPA.

-Features
  Manages student, teacher, quiz, and course data.
  Implements CRUD operations for each entity (Student, Teacher, Quiz, Course).
  Uses Spring Boot for easy setup and configuration.
  Provides RESTful APIs for data manipulation.

-Technologies Used
  Java 11
  Spring Boot 2.5.6
  Spring Data JPA
  MySQL
  Maven 

-Setup Instructions
  Clone the repository to your local machine.
  Ensure you have Java 11 installed on your system.
  Configure your database settings in application.properties file.
  Build the project using Maven 
  Run the application
  Access the application in your web browser at http://localhost:8080.


-Project Structure
  src/main/java: Contains Java source files.
  com.example.demo: Main package for the application.
  controller: Contains controller classes for handling HTTP requests.
  model: Contains entity classes representing the data model.
  repository: Contains repository interfaces for data access.
  service: Contains service classes for business logic.
  DemoApplication.java: Main class to start the Spring Boot application.
  src/main/resources: Contains application configuration files.
  application.properties: Configuration file for Spring Boot application properties.


-API Endpoints
  /students: API endpoints for managing student data.
  /teachers: API endpoints for managing teacher data.
  /quizzes: API endpoints for managing quiz data.
  /courses: API endpoints for managing course data.


-Usage
  Use the provided API endpoints to perform CRUD operations on student, teacher, quiz,   and course data.
  Send HTTP requests (GET, POST, PUT, DELETE) to the respective endpoints using tools like   URL, Postman, or your preferred REST client.
