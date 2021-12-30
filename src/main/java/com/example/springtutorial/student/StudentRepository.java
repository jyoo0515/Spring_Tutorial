package com.example.springtutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Check if email exists
    Optional<Student> findStudentByEmail(String email);
}
