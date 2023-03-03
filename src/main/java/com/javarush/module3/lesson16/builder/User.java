package com.javarush.module3.lesson16.builder;

public class User {
    private final String name;
    private final String surname;
    private final String email;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String surname;
        private String email;
        private String address;

        private Builder() {

        }

        public User build() {
            return new User(this);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }
    }
}

class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .withAddress("Address")
                .withEmail("email")
                .build();

        System.out.println(user);
    }
}
