package com.example.demo.serviceimp;

import com.example.demo.model.Course;
import com.example.demo.repository.CourseRepository;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public void addCourse(Course course) {

    }

    @Override
    public void updateCourse(Course course) {

    }

    @Override
    public void deleteCourse(int id) {

    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void updateCourse(int id, Course updatedCourse) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse != null) {
            // Update existing course with data from updatedCourse
            existingCourse.setName(updatedCourse.getName());
            // Add more fields to update as needed
            courseRepository.save(existingCourse);
        }
    }

    @Override
    public void deleteCourseById(int id) {
        courseRepository.deleteById(id);
    }
}
