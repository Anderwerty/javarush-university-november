package com.javarush.module1.lesson19;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(queue);
        System.out.println("================");
        System.out.println("Add");
        boolean add = queue.add(6);
        System.out.println("Add result: " + add);
        System.out.println(queue);

        System.out.println("================");
        System.out.println("Offer");
        boolean offer = queue.offer(7);
        System.out.println("Offer result: " + offer);
        System.out.println(queue);

        System.out.println("================");
        System.out.println("remove");
        Integer remove = queue.remove();
        System.out.println("remove result: " + remove);
        System.out.println(queue);

        System.out.println("================");
        System.out.println("poll");
        Integer poll = queue.poll();
        System.out.println("poll result: " + poll);
        System.out.println(queue);

        System.out.println("================");
        System.out.println("element");
        Integer element = queue.element();
        System.out.println("element result: " + element);
        System.out.println(queue);

        System.out.println("================");
        System.out.println("peek");
        Integer peek = queue.peek();
        System.out.println("peek result: " + peek);
        System.out.println(queue);


    }
}
