package com.example.demo.controller;

// StudentController.java
import com.example.demo.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentController {
    ResponseEntity<List<Student>> getAllStudents();
    ResponseEntity<Student> getStudentById(int id);
    ResponseEntity<Void> addStudent(Student student);
    ResponseEntity<Void> updateStudent(int id, Student student);
    ResponseEntity<Void> deleteStudent(int id);
}
