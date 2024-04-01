package com.example.demo.service;

// TeacherService.java
import com.example.demo.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher saveTeacher(Teacher teacher);

    List<Teacher> getAllTeachers();
    Teacher getTeacherById(int id);
    void addTeacher(Teacher teacher);
    void updateTeacher(Teacher teacher);
    void deleteTeacher(int id);

    void updateTeacher(int id, Teacher updatedTeacher);

    void deleteTeacherById(int id);
}
