package com.example.demo.service;

// QuizService.java
import com.example.demo.model.Quiz;

import java.util.List;

public interface QuizService {
    Quiz saveQuiz(Quiz quiz);

    List<Quiz> getAllQuizzes();
    Quiz getQuizById(int id);
    void addQuiz(Quiz quiz);
    void updateQuiz(Quiz quiz);
    void deleteQuiz(int id);

    void updateQuiz(int id, Quiz updatedQuiz);

    void deleteQuizById(int id);
}
