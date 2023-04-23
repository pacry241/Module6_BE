package com.example.be_exem_final_module5.service.impl;

import com.example.be_exem_final_module5.model.Teacher;
import com.example.be_exem_final_module5.repository.TeacherRepository;
import com.example.be_exem_final_module5.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ITeacherService implements TeacherService<Teacher> {
    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public Iterable<Teacher> findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> findById(int id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public void remove(int id) {
        teacherRepository.delete(teacherRepository.findById(id).orElse(null));
    }
}
