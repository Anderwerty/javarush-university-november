package com.javarush.module3.lesson16_17.command;

public class GetMethodHandler implements Command {
    @Override
    public void execute(Object object) {
        System.out.println("handle get http method");
    }
}
