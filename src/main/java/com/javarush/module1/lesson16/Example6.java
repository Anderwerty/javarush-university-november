package com.javarush.module1.lesson16;

import java.util.ArrayList;

public class Example6 {
    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        int size1 = integers.size();
        System.out.println(size1);

        integers.add(1);// index 0
        integers.add(2); // index 1
        integers.add(3); // index 2
        integers.add(4);
        integers.add(2);
        System.out.println("items: " + integers);

        int size = integers.size();
        System.out.println(size);

        Integer integer = integers.get(2);
        System.out.println(integer);

//        integers.get(100); IndexOutOfBoundsException
//        integers.get(-100); ArrayIndexOutOfBoundsException
        System.out.println("===================");
        System.out.println("Remove");
        Integer remove = integers.remove(3);

        System.out.println("delete: " + remove);
        System.out.println("size: " + integers.size());
        System.out.println("items: " + integers);

        System.out.println("===================");
        boolean isRemoved = integers.remove(new Integer(20));
        System.out.println("Is removed: " + isRemoved);
        System.out.println("size: " + integers.size());
        System.out.println("items: " + integers);

//        System.out.println("====================");
//        System.out.println("Clear");
//        integers.clear();
//        System.out.println(integers.size());

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }

        Integer[] integers1 = integers.toArray(new Integer[0]);

//        var integer1 = new Integer(1);
    }
}
