package com.javarush.module1.lesson4;

public class Example12 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;

//        System.out.println(a == b);

        String str1 = "String";
        String str2 = "String";
        String str3  = new String("String");
        String str4 = "sTRING";

        System.out.println(str1 == str2);
//        System.out.println(str1 != str2);

        System.out.println(str1 == str3);
        System.out.println("===========================");
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str4));

        System.out.println(str1.toLowerCase().equals(str4.toLowerCase()));
    }
}
