package com.javarush.module3.facultative1.example1.service;

import com.javarush.module3.facultative1.example1.encoder.PasswordEncoder;
import com.javarush.module3.facultative1.example1.entity.User;
import com.javarush.module3.facultative1.example1.repository.UserRepository;
import com.javarush.module3.facultative1.example1.validate.UserValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserServiceTest {

    UserRepository userRepository = null;
    UserValidator userValidator = user -> {
        throw new IllegalArgumentException("test message");
    };
    PasswordEncoder passwordEncoder = null;
    UserService userService = new UserService(userRepository, userValidator, passwordEncoder);

    @Test
    void registerThrowsExceptionForNotValidUser() {
        User user = new User(1, "password", "email");
        final IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> userService.register(user));
        assertEquals("test message", exception.getMessage());
    }

}