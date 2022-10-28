package com.javarush.module2.lesson10;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        System.out.println(factorialWithLoop(5));
    }

    public static long factorial(int n) {
        return n == 0 ? 1 : n * factorial(n - 1);
//        if (n == 0) {
//            return 1;
//        } else {
//            return n * factorial(n - 1);
//        }
    }

    public static long factorialWithLoop(int n) {
        long result = 1;

        for (int i = n; i > 0; i--) {
            result *= i;
        }

        return result;
    }

}

// 0! = 1
// 5! = 1*2*3*4*5 = 5*4*3*2*1
// 4! = 4*3*2*1
// 5! = 5*4!
// 6! = 6*5!
// ....
// n! = n *(n-1)!, where n>0

// factorial(n) = n * factorial(n-1)

//return n == 0 ? 1 : n * factorial(n - 1);
// factorial(4) = 4* factorial(3) =
// 4*3*factorial(2) = 4*3*2*factorial(1)= 4*3*2*1*factorial(0)=4*3*2*1*1

///========================
//return (n == 0|| n==1) ? 1 : n * factorial(n - 1);
// factorial(4) = 4* factorial(3) =
// 4*3*factorial(2) = 4*3*2*factorial(1)= 4*3*2*1=4*3*2*1
