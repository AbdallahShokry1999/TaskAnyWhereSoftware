package com.example.demo.controllerimp;

import com.example.demo.controller.TeacherController;
import com.example.demo.model.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherControllerImpl implements TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable int id) {
        Teacher teacher = teacherService.getTeacherById(id);
        if (teacher != null) {
            return new ResponseEntity<>(teacher, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTeacher(@PathVariable int id, @RequestBody Teacher teacher) {
        Teacher existingTeacher = teacherService.getTeacherById(id);
        if (existingTeacher != null) {
            teacher.setId(id);
            teacherService.updateTeacher(teacher);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable int id) {
        Teacher existingTeacher = teacherService.getTeacherById(id);
        if (existingTeacher != null) {
            teacherService.deleteTeacher(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
