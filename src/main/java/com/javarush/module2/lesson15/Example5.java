package com.javarush.module2.lesson15;

import static com.javarush.module2.lesson15.Client.Address;
import static com.javarush.module2.lesson15.Client.Address.staticMethodAddress;

public class Example5 {

    public static void main(String[] args) {
        Address address = new Address("London");
    }
}

class Client {
    static class Address {
        private final String city;

        public Address(String city) {
            this.city = city;
            staticMethodClient();
        }

        public static void staticMethodAddress(){

        }
    }


    private final String name;
    private final Address addresses;

    public static void staticMethodClient(){

    }

    public Client(String name, String city1) {
        this.name = name;
        this.addresses = null;
        System.out.println();
        staticMethodAddress();
    }
}


