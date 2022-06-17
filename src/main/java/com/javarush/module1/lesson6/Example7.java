package com.javarush.module1.lesson6;

public class Example7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { //i=2
            //==========================
            for (int j = 1; j <= 10; j++) { //j=1
                System.out.println(i + "*" + j + "=" + (i*j)); //2+"*"+1+"="+2
            }
            //=============================
            System.out.println();
        }


    }
}
