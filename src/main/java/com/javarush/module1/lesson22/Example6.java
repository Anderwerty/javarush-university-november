package com.javarush.module1.lesson22;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        ResourceA resourceA = null;
//        try {
//            resourceA = new ResourceA();
//            resourceA.run(scanner.nextInt());
//        } catch (RuntimeException runtimeException) {
//            System.out.println("Runtime exception");
//        } finally {
//            try {
//                resourceA.close();
//            } catch (Exception e) {
//                System.out.println("....");
//            }
//        }


//        try {
//            ResourceA resourceA1 = new ResourceA();
//            resourceA1.run(scanner.nextInt());
//            resourceA1.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try (ResourceA resourceA2 = new ResourceA();) {
            resourceA2.run(scanner.nextInt());

        } catch (Exception e) {
            System.out.println("catch");
        }
    }
}
