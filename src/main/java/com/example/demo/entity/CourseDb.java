package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class CourseDb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    // Constructors, getters, and setters
    // ...

    // Constructor
    public CourseDb() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
