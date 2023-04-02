package com.javarush.module3.facultative1.example1.service;

import com.javarush.module3.facultative1.example1.encoder.PasswordEncoder;
import com.javarush.module3.facultative1.example1.encoder.SimplePasswordEncoder;
import com.javarush.module3.facultative1.example1.entity.User;
import com.javarush.module3.facultative1.example1.repository.UserRepository;
import com.javarush.module3.facultative1.example1.validate.UserValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class UserServiceWithMockitoTest {

    @Mock
    UserRepository userRepository;

    @Mock
    UserValidator userValidator;

    @Mock
    PasswordEncoder passwordEncoder;

    @Spy
    SimplePasswordEncoder simplePasswordEncoder = new SimplePasswordEncoder();

    @InjectMocks
    UserService userService;


    @Test
    void registerThrowsExceptionForNotValidUser() {
        User user = new User(1, "password", "email");

        Mockito.doThrow(new IllegalArgumentException("test message")).when(userValidator).validate(user);
//        UserService userService = new UserService(userRepository, userValidator, passwordEncoder);

        final IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> userService.register(user));
        assertEquals("test message", exception.getMessage());

        Mockito.verify(userValidator).validate(user);
        Mockito.verifyNoInteractions(passwordEncoder, userRepository);
    }

    @Test
    void registerShouldSaveUser() {
        final String password = "password";
        final String email = "email";
        User user = new User(1, password, email);

//        Mockito.doNothing().when(userValidator).validate(user);
        final String encodedPassword = "encoded password";
        Mockito.doReturn(encodedPassword).when(passwordEncoder).encodePassword(password);

        User userWithEncodedPassword = new User(1, encodedPassword, email);

        Mockito.doNothing().when(userRepository).save(userWithEncodedPassword);

        userService.register(user);

        Mockito.verify(userValidator).validate(user);
        Mockito.verify(passwordEncoder).encodePassword(password);
        Mockito.verify(userRepository).save(userWithEncodedPassword);
    }


    @Test
    void testWithSpy() {
        // task use the same for mock
        String password = "Password";
        System.out.println("Mock result: ");
        System.out.println(passwordEncoder.encodePassword(password));
        System.out.println("=".repeat(20));

        System.out.println("Spy result: ");
//        Mockito.when(simplePasswordEncoder.encodePassword(password)).thenReturn("Blabla");  // invoke real method and replace result
       Mockito.doReturn("Blabla").when(simplePasswordEncoder).encodePassword(password); // real method was not invoked
        System.out.println(simplePasswordEncoder.encodePassword(password));
    }
}
