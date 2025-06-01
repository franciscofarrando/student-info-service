package com.example.student_info_service.services;

import com.example.student_info_service.model.Student;
import com.example.student_info_service.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudiante no encontrado"));
    }
    @Bean
    CommandLineRunner run(StudentRepository studentRepository){
        return args -> {
            studentRepository.save(new Student(null, "Pedro", 28));
          studentRepository.save(new Student(null, "Gimena", 22));
        };
    }
}
