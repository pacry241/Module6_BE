package com.example.be_exem_final_module5.service;

import java.util.Optional;

public interface StudentService<T> {
    Iterable<T> findAll();

    Optional<T> findById(int id);

    T save(T t);

    void remove(int id);
}
