package com.javarush.module1.lesson22;

public class Example4 {
}

//* return null - throws exception
//** node ---> array
class Stack<E> {

    private int size;
    private Node<E> lastNode = new Node<>();

    E push(E object) {
        size++;
        final Node<E> node = new Node<>();
        node.value = object;
        node.previous = lastNode;
        lastNode = node;

        return object;
    }

    E pop() {
        if (lastNode.previous == null) {
            return null;
        }

        size--;
        final Node<E> node = lastNode.previous;
        final E value = lastNode.value;
        lastNode = node;

        return value;
    }

    //*? null ----> throw new RuntimeException
    E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return lastNode.value;
        }

        // return last.value;
    }

    boolean isEmpty() {
        return size == 0;
    }

    static class Node<E> {
        public E value;
        public Node<E> previous;

    }

}
