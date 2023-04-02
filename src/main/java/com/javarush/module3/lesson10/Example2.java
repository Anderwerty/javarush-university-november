package com.javarush.module3.lesson10;

public class Example2 {
    public static void main(String[] args) {
        User user = new User()
                .setName("Andrii")
                .setMiddlename("A")
                .setLastname("S")
                .setPassword("password");
    }
}

class User {
    private String name;
    private String lastname;
    private String middlename;
    private String password;

    public User() {
    }

    public User(String name, String lastname, String middlename, String password) {
        this.name = name;
        this.lastname = lastname;
        this.middlename = middlename;
        this.password = password;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public User setMiddlename(String middlename) {
        this.middlename = middlename;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
