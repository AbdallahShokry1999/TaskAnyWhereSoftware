package com.example.demo.controller;

// QuizController.java
import com.example.demo.model.Quiz;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuizController {
    ResponseEntity<List<Quiz>> getAllQuizzes();
    ResponseEntity<Quiz> getQuizById(int id);
    ResponseEntity<Void> addQuiz(Quiz quiz);
    ResponseEntity<Void> updateQuiz(int id, Quiz quiz);
    ResponseEntity<Void> deleteQuiz(int id);
}

