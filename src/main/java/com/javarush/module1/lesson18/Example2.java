package com.javarush.module1.lesson18;

import java.util.HashMap;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Five", 5);

        // "balvl" vs "fdrs"

    }
}


class MyHashMap<K, V> {
    private int capacity = 10;
    public Node<K, V>[] arr = new Node[capacity];


    public void put(K key, V value) {
        int keyHashCode = key.hashCode(); // 0 - 2_000_000_000
        int index = keyHashCode % capacity;

        if (arr[index] == null) {
            arr[index] = new Node<>(key, value);
        } else {
            Node<K, V> currentNode = arr[index];
            if (currentNode.key.equals(key)) {
                currentNode.value = value;
            } else {
                Node<K, V> node = new Node<>(key, value);
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = node;

            }
        }

        //...

    }
}

class Node<K, V> {
    public K key;
    public V value;
    public Node<K, V> next = null;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
