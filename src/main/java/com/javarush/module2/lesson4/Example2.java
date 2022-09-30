package com.javarush.module2.lesson4;

public class Example2 {
    public static void main(String[] args) {
        Executable executableInConsole = new ExecutableInConsole();
        Executable executableStub = new ExecutableStub();
        Executable[] executables = {executableInConsole, executableStub};
        for (Executable executable : executables) {
            executable.execute("");
        }
        System.out.println(Executable.VALUE);

    }
}

interface Executable {
    int VALUE = 10;

    public abstract void execute(String script);

    public default void execute(String script, Object... arguments) {
        throw new UnsupportedOperationException();
    }
}

class ExecutableInConsole implements Executable {

    @Override
    public void execute(String script) {
        System.out.println(script);
    }

    @Override
    public void execute(String script, Object... arguments) {
        System.out.println(script);
        for (Object argument : arguments) {
            System.out.println(argument);
        }
    }
}

class ExecutableStub implements Executable {

    @Override
    public void execute(String script) {

    }
}
