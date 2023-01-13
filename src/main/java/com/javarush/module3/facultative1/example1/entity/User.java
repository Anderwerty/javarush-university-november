package com.javarush.module3.facultative1.example1.entity;

import java.util.Objects;

// anemic domain model vs rich domain model
// entity
public class User {
    private final Integer id;
    private final String password;
    private final String email;

    public User(Integer id, String password, String email) {
        this.id = id;
        this.password = password;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, password, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
