package com.javarush.module3.lesson3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

public class Example1 {
    public static void main(String[] args) {
        int result = new Calculator().calculate(10, Operator.ADD, -12);
        System.out.println(result);

    }
}

class Calculator {
    // +, -, /, *
    private static final Map<Operator, BiFunction<Integer, Integer, Integer>> OPERATOR_TO_OPERATION =
            new HashMap<>();

    static {
        OPERATOR_TO_OPERATION.put(Operator.ADD, (a, b) -> a + b);
        OPERATOR_TO_OPERATION.put(Operator.DIV, (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("division by zero");
            }

            return a / b;
        });
    }

    public int calculate(int arg1, Operator operator, int arg2) {
        return OPERATOR_TO_OPERATION.get(operator).apply(arg1, arg2);
    }

    public Result method(){
        return new Result(1);
    }
}

class Result{
    private int value;

    public Result(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Result{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return value == result.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

enum Operator {
    ADD, DIV
}
