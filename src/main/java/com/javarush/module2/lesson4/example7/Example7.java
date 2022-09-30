package com.javarush.module2.lesson4.example7;

import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        UserValidator userValidator = new UserValidatorImpl();
        UserService userService = new UserService(userRepository, userValidator);

        userService.register("examplegmail.com", "123456");
    }
}

class UserValidatorImpl implements UserValidator {

    @Override
    public void validate(String email, String password) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException();
        }
    }
}

class UserRepositoryImpl implements UserRepository{
    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void save(String email, String password) {

    }
}

class UserValidatorEmpty implements  UserValidator{

    @Override
    public void validate(String email, String password) {

    }
}
