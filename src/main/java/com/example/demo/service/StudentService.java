package com.example.demo.service;

// StudentService.java

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);

    List<Student> getAllStudents();
    Student getStudentById(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int id);

    void updateStudent(int id, Student updatedStudent);

    void deleteStudentById(int id);
}
