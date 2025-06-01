package com.example.student_info_service.repository;

import com.example.student_info_service.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}