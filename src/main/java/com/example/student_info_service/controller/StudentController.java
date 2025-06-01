package com.example.student_info_service.controller;

import com.example.student_info_service.model.Student;
import com.example.student_info_service.repository.StudentRepository;
import com.example.student_info_service.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

}
