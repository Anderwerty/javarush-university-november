package com.javarush.module3.lesson16_17.adapter;

public class PostUserService implements UserService {
    private final СервісКористувача userService = new СервісКористувача();

    @Override
    public void service() {
        userService.обслугувати();
    }
}
