package com.javarush.module3.facultative1.example1.encoder;

import java.util.Objects;

public class SimplePasswordEncoder implements PasswordEncoder{
    @Override
    public String encodePassword(String password) {
        System.out.println("Invoke simplePasswordEncoder");
        return password;
    }

    @Override
    public boolean isMatched(String password, String encodedPassword) {
        return Objects.equals(password, encodedPassword);
    }
}
