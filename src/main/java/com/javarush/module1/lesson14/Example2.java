package com.javarush.module1.lesson14;

public class Example2 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(1);

        MyInteger myInteger1 = MyInteger.valueOf(10);

        MyInteger myInteger2 = new MyInteger();
//        myInteger2.setValue();

        MyInteger.info();
    }
}

//  1. we can invoke static from non-static context
//  2. we cannot invoke non-static from static context
class MyInteger {
    private static int counter = 0;

    private int value;

    public MyInteger(int value) {
        info();
        this.value = value;
        counter++;
    }

    public MyInteger() {
    }

    public void setValue(int value) {
        //validate
        System.out.println(counter);
        this.value = value;
        MyInteger.info();
    }

    //

    public static MyInteger valueOf(int value) {
        //
        return new MyInteger(value);
    }

    public static void info() {
        System.out.println(new MyInteger().value);
        System.out.println("Special class: " + counter);
    }
}
