package com.javarush.module3.lesson16_17.command;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<String, Command> methodNameToCommand = new HashMap<>();

        GetMethodHandler getMethodHandler = new GetMethodHandler();
        methodNameToCommand.put("GET", getMethodHandler);
        methodNameToCommand.put("POST", new PostMethodHandler());

        String methodName = "GET";
        methodNameToCommand.getOrDefault(methodName, getMethodHandler).execute(new Object());
    }
}
