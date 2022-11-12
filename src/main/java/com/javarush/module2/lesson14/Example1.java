package com.javarush.module2.lesson14;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Example1 {
    public static void main(String[] args) {
        Executor singleTaskExecutor = new SingleTaskExecutor();
        Runnable command = () -> {
            System.out.println("Done!");
        };

        singleTaskExecutor.execute(command);

 //       Arrays, Collections, Objects, Executors, Files, Paths

    }
}

class SingleTaskExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}

class SerialExecutor implements Executor {
    final Queue<Runnable> tasks = new ArrayDeque<>();
    final Executor executor;
    Runnable active;

    SerialExecutor(Executor executor) {
        this.executor = executor;
    }

    public synchronized void execute(Runnable command) {
        tasks.add(() -> {
            try {
                command.run();
            } finally {
                scheduleNext();
            }
        });
        if (active == null) {
            scheduleNext();
        }
    }

    protected synchronized void scheduleNext() {
        if ((active = tasks.poll()) != null) {
            executor.execute(active);
        }
    }


}
