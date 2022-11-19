package com.javarush.module2.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        User user = new User("Alex", "Ivanov", "Irpen", "Heroi Nebesnoii Sotnii");

        List<User.Address> addresses = user.getAddress();
        System.out.println(User.Address.CITY);

        User user1 = new User("", "", "", "");
        User.Address address1 = user1.new Address("", "");

        System.out.println(User.Address.myCity);
        User.Address.staticMethodAddress();
    }
}

class User {
    // inner
    class Address {

        public static final String CITY = "Borispol";
        public static String myCity = "Borispol";

        public static void staticMethodAddress(){
            System.out.println("static method address class");
        }

        static {
            System.out.println("static block Address");
        }

        private final String city;
        private final String street;

        public Address(String city, String street) {
            System.out.println("Address class");
            this.city = city;
            this.street = street;
            System.out.println(name);
            System.out.println(User.this.surname);
//            System.out.println(NAME);
//            System.out.println(CITY);
        }
    }

    //    private static final String NAME = "Alex";
    static {
        System.out.println("static block User");
    }

//    public static void staticUserMethod() {
//        Address address = new Address("", "");
//
//    }

    private final String name;
    private final String surname;
    private final List<Address> addresses;

    public User(String name, String surname, String city, String street) {
        System.out.println("User class");
        this.name = name;
        this.surname = surname;
//        this.address = new Address(city, street);
        this.addresses = new ArrayList<>();
        this.addresses.add(new Address(city, street));
//        System.out.println(NAME);
//        System.out.println(Address.CITY);
    }

    public void addAddress(String city, String street) {
        addresses.add(new Address(city, street));
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public List<Address> getAddress() {
        return addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + addresses.get(0).city + " " + addresses.get(0).street +
                '}';
    }
}
