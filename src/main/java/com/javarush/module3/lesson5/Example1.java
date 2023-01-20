package com.javarush.module3.lesson5;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.time.LocalDateTime;

public class Example1 {
    public static void main(String[] args) {
        System.out.println(new Service1().method("Hello"));
    }
}

class Service1 {
    //LOG, LOGGER
    private static final Logger LOGGER = Logger.getLogger(Service1.class);

    public String method(String message) {
        try {

        } catch (Exception e) {
            LOGGER.error(e);
        }
        LocalDateTime now = LocalDateTime.now();
        User user = new User();
        user.login = "login";
        user.password = "password";
        LOGGER.log(Level.DEBUG, "date time now: " + now);
        LOGGER.log(Level.INFO, "date time now: " + now);
        LOGGER.log(Level.FATAL, "date time now: " + now);
        LOGGER.debug("date time now: " + now);
        LOGGER.debug(user);

//        System.out.println("date time now: " + now);
        return message.toUpperCase() + now;
    }

}


class User {
    public String login;
    public String password;


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + "*****" + '\'' +
                '}';
    }
}
