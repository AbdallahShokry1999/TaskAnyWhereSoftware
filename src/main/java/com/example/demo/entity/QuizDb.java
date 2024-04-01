package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "quizzes")
public class QuizDb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    // Constructors, getters, and setters
    // ...

    // Constructor
    public QuizDb() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
