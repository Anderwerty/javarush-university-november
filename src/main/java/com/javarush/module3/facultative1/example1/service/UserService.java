package com.javarush.module3.facultative1.example1.service;

import com.javarush.module3.facultative1.example1.encoder.PasswordEncoder;
import com.javarush.module3.facultative1.example1.entity.User;
import com.javarush.module3.facultative1.example1.repository.UserRepository;
import com.javarush.module3.facultative1.example1.validate.UserValidator;

public class UserService {
    private final UserRepository userRepository;
    private final UserValidator userValidator;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, UserValidator userValidator, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(User user) {
        userValidator.validate(user);
        String encodedPassword = passwordEncoder.encodePassword(user.getPassword());
        User userWithEncodedPassword = new User(user.getId(), encodedPassword, user.getEmail());

        userRepository.save(userWithEncodedPassword);
    }

    public boolean login(String email, String password) {
        return userRepository.findByEmail(email)
                .filter(user -> passwordEncoder.isMatched(password, user.getPassword()))
                .isPresent();
    }
}
