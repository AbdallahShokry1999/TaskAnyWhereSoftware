package com.example.demo.service;

// CourseService.java
import com.example.demo.model.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    List<Course> getAllCourses();
    Course getCourseById(int id);
    void addCourse(Course course);
    void updateCourse(Course course);
    void deleteCourse(int id);

    void updateCourse(int id, Course updatedCourse);

    void deleteCourseById(int id);
}
