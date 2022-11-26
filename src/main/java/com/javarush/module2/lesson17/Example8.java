package com.javarush.module2.lesson17;

public class Example8 {
    public static void main(String[] args) {
        new StaticProxyExecutor(new MainExecutor()).execute();
    }
}

interface MyInterface {
    void execute();
}

class MainExecutor implements MyInterface {

    @Override
    public void execute() {
        try {
            System.out.println("Doing ...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}

class StaticProxyExecutor implements MyInterface {
    private final MyInterface myInterface;

    StaticProxyExecutor(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    @Override
    public void execute() {
        long start = System.currentTimeMillis();

        myInterface.execute();

        long end = System.currentTimeMillis();

        System.out.println("Result time: " + (end - start) + "ms");
    }
}
