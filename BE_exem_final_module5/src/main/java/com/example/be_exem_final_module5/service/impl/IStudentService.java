package com.example.be_exem_final_module5.service.impl;

import com.example.be_exem_final_module5.dto.StudentDTO;
import com.example.be_exem_final_module5.model.Student;
import com.example.be_exem_final_module5.repository.StudentRepository;
import com.example.be_exem_final_module5.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IStudentService implements StudentService<Student> {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void remove(int id) {
        studentRepository.delete(this.findById(id).orElse(new Student()));
    }

    public List<StudentDTO> transAll() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOS = new ArrayList<>();
        StudentDTO studentDTO;
        for (Student student : students) {
            studentDTO = new StudentDTO();
            BeanUtils.copyProperties(student, studentDTO);
            studentDTOS.add(studentDTO);
        }
        return studentDTOS;
    }
}
