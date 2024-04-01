package com.example.demo.repository;


import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// Annotate the interface as a repository
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // This method will be used to find a student by their ID
    // It returns an Optional<Student> which may contain the student if found
    // 'findById' is a predefined method in JpaRepository
    Optional<Student> findById(int id);

    // This method will be used to retrieve all students from the database
    // It returns a List<Student> containing all students
    // 'findAll' is a predefined method in JpaRepository
    List<Student> findAll();

    // This method will be used to save a new student or update an existing one
    // It takes a Student object as input and returns the saved/updated student
    // 'save' is a predefined method in JpaRepository
    <S extends Student> S save(S student);

    // This method will be used to delete a student by their ID
    // It returns void as it does not need to return any value
    // 'deleteById' is a predefined method in JpaRepository
    void deleteById(int id);
}
