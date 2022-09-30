package com.javarush.module2.lesson4.example7;

import java.util.List;

public interface UserRepository {
    User findById(Integer id);

    List<User> findAll();

    void save(String email, String password);
}
