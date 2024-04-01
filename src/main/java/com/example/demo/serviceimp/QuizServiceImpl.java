package com.example.demo.serviceimp;

import com.example.demo.model.Quiz;
import com.example.demo.repository.QuizRepository;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public Quiz getQuizById(int id) {
        return quizRepository.findById(id).orElse(null);
    }

    @Override
    public void addQuiz(Quiz quiz) {

    }

    @Override
    public void updateQuiz(Quiz quiz) {

    }

    @Override
    public void deleteQuiz(int id) {

    }

    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public void updateQuiz(int id, Quiz updatedQuiz) {
        Quiz existingQuiz = quizRepository.findById(id).orElse(null);
        if (existingQuiz != null) {
            // Update existing quiz with data from updatedQuiz
            existingQuiz.setId(updatedQuiz.getId());
            // Add more fields to update as needed
            quizRepository.save(existingQuiz);
        }
    }

    @Override
    public void deleteQuizById(int id) {
        quizRepository.deleteById(id);
    }
}
