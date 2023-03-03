package com.javarush.module3.lesson16_17.command;

public class PostMethodHandler implements Command{
    @Override
    public void execute(Object object) {
        System.out.println("Handle method post");
    }
}
