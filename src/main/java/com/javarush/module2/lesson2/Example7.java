package com.javarush.module2.lesson2;

public class Example7 {
//
    public static int findMax(int a, int b) {
        return a > b ? a : b;
    }

    public static int findMax(int a, int b, int c) {
        return findMax(findMax(a,b), c);
    }

    public static int findMax(int...items){
        return 0;
    }

    public static void main(String[] args) {
        int i = findMax(1, 2, 3);
    }


}

class AA{

    public AA() {
    }

    public AA(String message) {
        System.out.println(message);
    }
}
