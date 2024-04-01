package com.example.demo.repository;

import com.example.demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    // Method to find a course by its ID
    Optional<Course> findById(int id);

    // Method to retrieve all courses
    List<Course> findAll();

    // Method to save a new course or update an existing one
    <S extends Course> S save(S course);

    // Method to delete a course by its ID
    void deleteById(int id);
}

