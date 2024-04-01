package com.example.demo.controller;

// CourseController.java
import com.example.demo.model.Course;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CourseController {
    ResponseEntity<List<Course>> getAllCourses();
    ResponseEntity<Course> getCourseById(int id);
    ResponseEntity<Void> addCourse(Course course);
    ResponseEntity<Void> updateCourse(int id, Course course);
    ResponseEntity<Void> deleteCourse(int id);
}

