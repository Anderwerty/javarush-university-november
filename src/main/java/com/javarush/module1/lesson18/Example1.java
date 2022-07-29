package com.javarush.module1.lesson18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Example1 {
    public static void main(String[] args) {
        List<A> items = new ArrayList<>();
//        items.add(new A(1)); //0
//        items.add(new A(2)); //1
//        items.add(new A(3)); //2
//        items.add(new A(777)); //3
//
//        System.out.println(items.get(1));//2
//        System.out.println(items.get(3)); //777

        Set<Pair<String, Integer>> keyToValues = new HashSet<>();
        keyToValues.add(new Pair<>("One", 1)); // O(1)
        keyToValues.add(new Pair<>("Two", 2));
        keyToValues.add(new Pair<>("Five", 5));
        keyToValues.add(new Pair<>("Five", 50));

        System.out.println("Size: " + keyToValues.size());

        // 1_000_000_00 O(n)
        for (Pair<String, Integer> pair : keyToValues) {
            if (pair.getKey().equals("Five")) {
                System.out.println("Find: " + pair.getValue());
                break;
            }
        }

        A[] arr = new A[4];


    }
}

class A {

    private int value;

    public A(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "A{" +
                "value=" + value +
                '}';
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}