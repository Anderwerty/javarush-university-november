package com.javarush.module3.facultative1.example1;

import com.javarush.module3.facultative1.example1.encoder.PasswordEncoder;
import com.javarush.module3.facultative1.example1.repository.UserRepository;
import com.javarush.module3.facultative1.example1.repository.UserRepositoryImpl;
import com.javarush.module3.facultative1.example1.service.UserService;
import com.javarush.module3.facultative1.example1.validate.UserValidator;

public class Application {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();
        UserValidator userValidator = null;
        PasswordEncoder passwordEncoder = null;
        UserService userService = new UserService(userRepository, userValidator, passwordEncoder);
    }
}
