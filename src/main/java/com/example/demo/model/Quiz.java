package com.example.demo.model;

// Quiz.java
public class Quiz {
    private int id;
    private String topic;
    private int durationMinutes;

    // Constructors
    public Quiz() {
    }

    public Quiz(int id, String topic, int durationMinutes) {
        this.id = id;
        this.topic = topic;
        this.durationMinutes = durationMinutes;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}

