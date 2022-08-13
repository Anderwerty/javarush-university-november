package com.javarush.module1.lesson22;

public class Example5 {
    public static void main(String[] args) {
        try{
        method1();}
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void method1(){
        method2();
    }

    public static void method2(){
        method3();
    }

    public static  void method3(){
        System.out.println("method3");

        throw  new RuntimeException();
    }
}
