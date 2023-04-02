package com.javarush.module3.facultative1.example1.service;

import com.javarush.module3.facultative1.example1.encoder.SimplePasswordEncoder;
import com.javarush.module3.facultative1.example1.repository.UserRepositoryImpl;
import com.javarush.module3.facultative1.example1.validate.UserValidatorWithoutValidation;
import org.junit.jupiter.api.Test;

class UserServiceIT {

    private UserService userService = new UserService(new UserRepositoryImpl(), new UserValidatorWithoutValidation(), new SimplePasswordEncoder());

    @Test
    void registerShouldSaveUser(){

    }

}