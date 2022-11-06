package com.javarush.module2.lesson12;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Thread.yield();
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread.interrupted() " + Thread.interrupted());
            }
        });

//        thread.setDaemon(true);
        thread.start();
        thread.join();

        Thread.sleep(10000);

//        System.out.println(thread.isInterrupted());
//        System.out.println(thread.isInterrupted());
        System.out.println("End of main thread");
    }
}
