package com.example.demo.controller;

// TeacherController.java
import com.example.demo.model.Teacher;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TeacherController {
    ResponseEntity<List<Teacher>> getAllTeachers();
    ResponseEntity<Teacher> getTeacherById(int id);
    ResponseEntity<Void> addTeacher(Teacher teacher);
    ResponseEntity<Void> updateTeacher(int id, Teacher teacher);
    ResponseEntity<Void> deleteTeacher(int id);
}
