package com.javarush.module1.lesson4;

public class Example2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a + b);

        boolean isGreen = false;
        boolean isCheckOk = false;

        // if isGreen true and isCheckOk true

        boolean result = isGreen && isCheckOk; //&
        // AND  (&, &&)
        // A     B      RESULT
        //true   true   true
        //false  true   false
        //true   false  false
        //false  false  false

        System.out.println(result);

        System.out.println("===========================");

        boolean isFriday = true; // 15%
        boolean isStudent = true;// 15%

        // if isFriday true OR isStudent true result is true
        // OR   (|, ||)
        // A     B      RESULT
        //true   true   true
        //false  true   true
        //true   false  true
        //false  false  false

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("========================================");
        // XOR   (^)
        // A     B      RESULT
        //true   true   false
        //false  true   true
        //true   false  true
        //false  false  false
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("=========================");
        System.out.println(-a);
        System.out.println(!true);
        System.out.println(!false);
    }
}
