package com.javarush.module1.lesson7;

import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {
        int[] arr = new int[5]; // [0,0,0,0,0]

        arr[0] = 1; // [1 ,0, 0, 0, 0]

        arr[4] = 100;// [1 ,0, 0, 0, 100]

        arr[0] = arr[0] + arr[4];//? 1 + 100 [101, 0, 0, 0, 100]

        arr[1] = arr[1] + 1;//[101, 1, 0, 0, 100]

        System.out.println(Arrays.toString(arr));
        arr[0]++;
        System.out.println(Arrays.toString(arr));

        //[102, 1, 0, 0, 100]

        arr[2] = arr[2]++; // 0 -> 1 -> 0//

        // read: 0
        // write into arr[2] = 1;
        // write into arr[2] = 0;

//        arr[2] =arr[2];
        System.out.println(Arrays.toString(arr));

        arr[2] = ++arr[2];

        // write int arr[2] = 1;
        // read from arr[2] : 1
        // write into arr[2] = 1;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
