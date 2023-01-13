package com.javarush.module3.facultative1.example1.repository;

import com.javarush.module3.facultative1.example1.entity.User;

import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    @Override
    public Optional<User> findById(int id) {
        //TODO:
        throw new UnsupportedOperationException("was not implemented");
    }

    @Override
    public Optional<User> findByEmail(String email) {
        throw new UnsupportedOperationException("was not implemented");
    }

    @Override
    public void save(User user) {
        throw new UnsupportedOperationException("was not implemented");
    }
}
