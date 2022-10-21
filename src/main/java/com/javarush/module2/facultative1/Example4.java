package com.javarush.module2.facultative1;

import java.util.Optional;

public class Example4 {
    public static void main(String[] args) {
        User user = new User();
        Address address1 = new Address();
        City city1 = new City();
        city1.name = "Kiyv";
        address1.city = city1;
        user.address = address1;
        // init fields
//        String name = user.address.city.name;
//        System.out.println(name);

        String name1 = null;
        if (user != null) {
            Address address = user.address;
            if (address != null) {
                City city = address.city;
                if (city != null) {
                     name1 = city.name;
                }
            }
        }
        System.out.println(name1);

        //** ??? hint habr
        String cityName = ObjectWrapper.ofNullable(user)
                .map(u -> u.address)
                .map(a -> a.city)
                .map(c -> c.name)
                .get();
        System.out.println(cityName);

        String cityNameWithOptional = Optional.ofNullable(user)
                .map(u -> u.address)
                .map(a -> a.city)
                .filter(c->c.code >100)
                .map(c -> c.name)
                .orElseThrow(RuntimeException::new);


    }
}

class User {
    public Address address;
}

class Address {
    public City city;
}

class City {
    public String name;
    public int code;
}
