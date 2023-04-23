package com.example.be_exem_final_module5.repository;

import com.example.be_exem_final_module5.model.GroupStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupStudentRepository extends JpaRepository<GroupStudent, Integer> {
}
