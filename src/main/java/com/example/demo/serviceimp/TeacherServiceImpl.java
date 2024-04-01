package com.example.demo.serviceimp;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher getTeacherById(int id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public void addTeacher(Teacher teacher) {

    }

    @Override
    public void updateTeacher(Teacher teacher) {

    }

    @Override
    public void deleteTeacher(int id) {

    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void updateTeacher(int id, Teacher updatedTeacher) {
        Teacher existingTeacher = teacherRepository.findById(id).orElse(null);
        if (existingTeacher != null) {
            // Update existing teacher with data from updatedTeacher
            existingTeacher.setName(updatedTeacher.getName());
            // Add more fields to update as needed
            teacherRepository.save(existingTeacher);
        }
    }

    @Override
    public void deleteTeacherById(int id) {
        teacherRepository.deleteById(id);
    }
}
