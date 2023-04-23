package com.example.be_exem_final_module5.service.impl;

import com.example.be_exem_final_module5.model.GroupStudent;
import com.example.be_exem_final_module5.repository.GroupStudentRepository;
import com.example.be_exem_final_module5.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IGroupStudentService implements GroupService<GroupStudent> {
    @Autowired
    private GroupStudentRepository groupStudentRepository;
    @Override
    public Iterable<GroupStudent> findAll() {
        return groupStudentRepository.findAll();
    }

    @Override
    public Optional<GroupStudent> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public GroupStudent save(GroupStudent groupStudent) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
