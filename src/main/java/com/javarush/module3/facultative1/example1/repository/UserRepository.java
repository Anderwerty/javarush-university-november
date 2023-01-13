package com.javarush.module3.facultative1.example1.repository;

import com.javarush.module3.facultative1.example1.entity.User;

import java.util.Optional;

//CRUD
public interface UserRepository {

    Optional<User> findById(int id);

    Optional<User> findByEmail(String email);

    void save(User user);
}
