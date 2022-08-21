package com.javarush.module1.lesson24;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }

        Iterator<Integer> iterator = objects.iterator();

        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

    }
}
