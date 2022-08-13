package com.javarush.module1.lesson22;

public class Example1 {
    public static void main(String[] args)  {
//        throw  new Exception();
        method();
    }

    private static void method() {
        try {
            throw new Exception("error!");
        } catch (Exception e){
            System.out.println("");
           throw new RuntimeException(e);

        }
    }
}
