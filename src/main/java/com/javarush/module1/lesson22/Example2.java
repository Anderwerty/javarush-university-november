package com.javarush.module1.lesson22;

public class Example2 {
    public static void main(String[] args) {

        System.out.println(div(10, 0));
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    }


    public static int div(int division, int divisor) {
        if (divisor == 0) {
            throw new DivisionByZeroException("bla bla");
        }
        return division / divisor;
    }
}

class DivisionByZeroException extends RuntimeException {
    DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException() {
    }
}
