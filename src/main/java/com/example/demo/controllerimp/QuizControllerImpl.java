package com.example.demo.controllerimp;

import com.example.demo.controller.QuizController;
import com.example.demo.model.Quiz;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/quizzes")
public class QuizControllerImpl implements QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping
    public ResponseEntity<List<Quiz>> getAllQuizzes() {
        List<Quiz> quizzes = quizService.getAllQuizzes();
        return new ResponseEntity<>(quizzes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable int id) {
        Quiz quiz = quizService.getQuizById(id);
        if (quiz != null) {
            return new ResponseEntity<>(quiz, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> addQuiz(@RequestBody Quiz quiz) {
        quizService.addQuiz(quiz);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateQuiz(@PathVariable int id, @RequestBody Quiz quiz) {
        Quiz existingQuiz = quizService.getQuizById(id);
        if (existingQuiz != null) {
            quiz.setId(id);
            quizService.updateQuiz(quiz);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuiz(@PathVariable int id) {
        Quiz existingQuiz = quizService.getQuizById(id);
        if (existingQuiz != null) {
            quizService.deleteQuiz(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
