package com.javarush.module3.facultative1.example1.validate;

import com.javarush.module3.facultative1.example1.entity.User;

public interface UserValidator {
    void validate(User user) throws IllegalArgumentException;
}
