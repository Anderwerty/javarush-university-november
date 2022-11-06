package com.javarush.module2.lesson12;

public class Example1 {
    public static void main(String[] args) {
        Container container = new Container();

        Producer producer = new Producer(container);
        Consumer consumer = new Consumer(container);
// start time
        producer.start();
        consumer.start();
//end time
    }
}

class Container {
    private volatile int value = 0;  // volatile ??? *

    // 0 - 100

    public void increment() throws InterruptedException {
        synchronized (this) {
            while (value == 100) {
                wait();
            }
            System.out.println("increment:" + (++value));

            notifyAll();
        }
    }

    public synchronized void decrement() throws InterruptedException {   // mutex ---> this
        while (value==0){
            wait();
        }
        System.out.println("decrement" + (--value));
        notifyAll();
    }

    public void method() {

    }

    public static synchronized void staticMethod1() {
        // some logic
    }

    public static void staticMethod2() {
        synchronized (Container.class) {

        }
    }
}

class Producer extends Thread {
    private final Container container;

    Producer(Container container) {
        super("producer");
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {  // while ---> for 10000
            try {
                container.increment();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private final Container container;

    Consumer(Container container) {
        super("consumer");
        this.container = container;
    }

    @Override
    public void run() {
        while (true) {
            try {
                container.decrement();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
