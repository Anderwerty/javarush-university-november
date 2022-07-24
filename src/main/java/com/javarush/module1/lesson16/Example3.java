package com.javarush.module1.lesson16;

public class Example3 {
    public static void main(String[] args) {
        String str1 = "ff";
        String str2 = "ff";
        String str3 = new String("ff");

        //Object
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        System.out.println("=====================");
        // pool integer
        Integer i1 = 1000;
        Integer i2 = 1000;
        Integer i3 = new Integer(1000); // -128 127

        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));

        Double d = 10.0;
        Float f = 10.0F; // Long L, Float F
        System.out.println("==========================");

        System.out.println(Double.isInfinite(0.1 / 0.0));
    }
}
