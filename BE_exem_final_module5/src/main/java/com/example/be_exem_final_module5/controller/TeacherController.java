package com.example.be_exem_final_module5.controller;

import com.example.be_exem_final_module5.model.Teacher;
import com.example.be_exem_final_module5.service.impl.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/teacher")
@CrossOrigin("*")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;

    @GetMapping("")
    public ResponseEntity<Iterable<Teacher>> findAllCustomer() {
        List<Teacher> teachers = (List<Teacher>) teacherService.findAll();
        if (teachers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(teachers, HttpStatus.OK);
    }
}
