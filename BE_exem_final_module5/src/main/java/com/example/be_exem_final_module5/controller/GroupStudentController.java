package com.example.be_exem_final_module5.controller;

import com.example.be_exem_final_module5.model.GroupStudent;
import com.example.be_exem_final_module5.repository.GroupStudentRepository;
import com.example.be_exem_final_module5.service.impl.IGroupStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/group_student")
@CrossOrigin("*")
public class GroupStudentController {
    @Autowired
    private IGroupStudentService groupStudentService;
    @Autowired
    private GroupStudentRepository groupStudentRepository;

    @GetMapping("")
    public ResponseEntity<Iterable<GroupStudent>> findAllCustomer() {
        List<GroupStudent> groupStudents = (List<GroupStudent>) groupStudentRepository.findAll();
        if (groupStudents.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(groupStudents, HttpStatus.OK);
    }
}
