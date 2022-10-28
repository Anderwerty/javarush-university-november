package com.javarush.module2.lesson10;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));

    }

    // n = 3
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
        //                fibonacci(3)              2
        //              /             \
        //          fibonacci(2)   + fibonacci(1)    1+1
        //            / /                  \\
        //           1                     1


        //                fibonacci(4)             [3]
        //              /             \
        //          fibonacci(3)   + fibonacci(2)   [2] + [1]
        //            /     \               \
        //  fibonacci(2) + fibonacci(1) [2]      1[1]
        //     /             \
        //    1               1


    }
}

// n1, n2, n3 = n1+n2
