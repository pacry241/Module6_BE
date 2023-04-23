package com.example.be_exem_final_module5.service;

import java.util.Optional;

public interface GroupService<T>{
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
