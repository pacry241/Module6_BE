package com.example.be_exem_final_module5.repository;

import com.example.be_exem_final_module5.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository< Student, Integer> {
}
