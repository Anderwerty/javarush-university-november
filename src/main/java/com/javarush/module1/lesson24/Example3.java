package com.javarush.module1.lesson24;

import java.io.Closeable;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        try (InnerClosable innerClosable= new InnerClosable();
             OuterClosable outerClosable = new OuterClosable(innerClosable);) {
            outerClosable.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

interface Executable extends Closeable {
    void execute();
}

class InnerClosable implements Closeable, Executable {

    @Override
    public void close() throws IOException {
        System.out.println("close inner class");
    }

    @Override
    public void execute() {
        System.out.println("Inner class execute");
    }
}

class OuterClosable implements Closeable, Executable {

    private final Executable executable;

    OuterClosable(Executable executable) {
        this.executable = executable;
    }

    @Override
    public void close() throws IOException {
        System.out.println("close outer class");
        executable.close();
    }

    @Override
    public void execute() {
        System.out.println("Outer class execute");
        executable.execute();
    }
}
