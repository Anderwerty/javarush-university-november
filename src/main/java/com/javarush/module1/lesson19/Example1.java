package com.javarush.module1.lesson19;

public class Example1 {
    public static void main(String[] args) {

    }
}

interface MyList<E> {
    int size();

    void add(E element);

    E getByIndex(int index);
}

class MyLinkedList<E> implements MyList<E> {

    private int size;
    private Node<E> head = new Node<>(); // value = null, next = tail, previous = null
    private Node<E> tail = new Node<>();// value = null, next = null, previous = head

    public MyLinkedList() {
        head.next = tail;
        tail.previous = head;
    }

    @Override
    public int size() {
        return size;
    }

    // O(n)  ---> O(1)
    @Override
    public void add(E element) {
        size++;
        Node<E> preTail = tail.previous;

        Node<E> node = new Node<>(element);
        node.previous = preTail;
        node.next = tail;

        preTail.next = node;
        tail.previous = node;
    }

    // add ArrayList

    @Override
    public E getByIndex(int index) {
        return null;
    }

    private static class Node<T> {
        public T value;
        public Node<T> next;
        public Node<T> previous;

        public Node() {
        }

        public Node(T value) {
            this.value = value;
        }
    }
}
