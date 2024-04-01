package com.example.demo.repository;

import com.example.demo.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

    // Method to find a quiz by its ID
    Optional<Quiz> findById(int id);

    // Method to retrieve all quizzes
    List<Quiz> findAll();

    // Method to save a new quiz or update an existing one
    <S extends Quiz> S save(S quiz);

    // Method to delete a quiz by its ID
    void deleteById(int id);
}
