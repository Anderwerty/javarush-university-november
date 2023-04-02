package com.javarush.module3.facultative1.example1.encoder;

public interface PasswordEncoder {

    String encodePassword(String password);

    boolean isMatched(String password, String encodedPassword);
}
