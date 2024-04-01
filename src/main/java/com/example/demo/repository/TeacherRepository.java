package com.example.demo.repository;

import com.example.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

    // Method to find a teacher by their ID
    Optional<Teacher> findById(int id);

    // Method to retrieve all teachers
    List<Teacher> findAll();

    // Method to save a new teacher or update an existing one
    <S extends Teacher> S save(S teacher);

    // Method to delete a teacher by their ID
    void deleteById(int id);
}

