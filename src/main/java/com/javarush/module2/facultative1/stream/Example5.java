package com.javarush.module2.facultative1.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        User user1 = new User(new Address(new City("Lviv", 100)));
        User user2 = new User(new Address(new City("Irpen", 101)));

        List<User> users = Arrays.asList(user1, user2, null);

        String bucha = users.stream()
                .map(user -> user.address)
                .filter(Objects::nonNull)
                .map(address -> address.city)
                .filter(city -> city.code > 99)
                .map(city -> city.name)
                .findAny()
                .orElse("Bucha");

        System.out.println(bucha);


        List<String> collect = users.stream()
                .filter(user -> user != null)
                .map(user -> user.address)
                .filter(Objects::nonNull)
                .map(address -> address.city)
                .filter(city -> city.code > 99)
                .map(city -> city.name)
                .collect(Collectors.toList());
        System.out.println(collect);


        List<String> cities = Arrays.asList("Kiev", "Lviv", "Odessa");
        StringBuilder stringBuilder = cities.stream().collect(new MyCollector());
        System.out.println(stringBuilder);


    }
}

class MyCollector implements Collector<String, StringBuilder, StringBuilder> {

    @Override
    public Supplier<StringBuilder> supplier() {
        return StringBuilder::new;
    }

    @Override
    public BiConsumer<StringBuilder, String> accumulator() {
        return(container, item) -> container.append(", ").append(item);
    }

    @Override
    public BinaryOperator<StringBuilder> combiner() {
        return StringBuilder::append;
    }

    @Override
    public Function<StringBuilder, StringBuilder> finisher() {
        return (x) -> x.delete(0,1);
    }

    @Override
    public Set<Characteristics> characteristics() {
        return new HashSet<>(Arrays.asList(Characteristics.CONCURRENT, Characteristics.UNORDERED));
    }
}

class User {
    public Address address;

    public User(Address address) {
        this.address = address;
    }
}

class Address {
    public City city;

    public Address(City city) {
        this.city = city;
    }
}

class City {
    public String name;
    public int code;

    public City(String name, int code) {
        this.name = name;
        this.code = code;
    }
}

