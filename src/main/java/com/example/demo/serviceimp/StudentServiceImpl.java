package com.example.demo.serviceimp;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStudent(int id) {

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void updateStudent(int id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            // Update existing student with data from updatedStudent
            existingStudent.setName(updatedStudent.getName());
            studentRepository.save(existingStudent);
        }
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
