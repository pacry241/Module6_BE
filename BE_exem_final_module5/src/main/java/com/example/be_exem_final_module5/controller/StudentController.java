package com.example.be_exem_final_module5.controller;

import com.example.be_exem_final_module5.model.Student;
import com.example.be_exem_final_module5.service.impl.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/student")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("")
    public ResponseEntity<Iterable<Student>> findAllCustomer() {
        List<Student> studentList = (List<Student>) studentService.findAll();
        if (studentList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findCustomerById(@PathVariable int id) {
        Optional<Student> customerOptional = studentService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Student> saveCustomer(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.save(student), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateCustomer(@PathVariable int id, @RequestBody Student student) {
        Optional<Student> customerOptional = studentService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        student.setId(customerOptional.get().getId());
        return new ResponseEntity<>(studentService.save(student), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteCustomer(@PathVariable int id) {
        Optional<Student> customerOptional = studentService.findById(id);
        if (!customerOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        studentService.remove(id);
        return new ResponseEntity<>(customerOptional.get(), HttpStatus.NO_CONTENT);
    }
}
