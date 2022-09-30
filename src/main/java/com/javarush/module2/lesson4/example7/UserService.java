package com.javarush.module2.lesson4.example7;
// facade https://refactoring.guru/design-patterns/facade
public class UserService {
    private final UserRepository userRepository;
    private final UserValidator userValidator;

    public UserService(UserRepository userRepository,
                       UserValidator userValidator) {
        this.userRepository = userRepository;
        this.userValidator = userValidator;
    }

    public void register(String email, String password) {
        userValidator.validate(email, password);

        userRepository.save(email, password);
    }

}
