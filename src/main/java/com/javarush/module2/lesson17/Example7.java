package com.javarush.module2.lesson17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Example7 {
    // junit 3.8

    public static void main(String[] args) throws Exception {
//        CalculatorTest calculatorTest = new CalculatorTest();
//        calculatorTest.testAddShouldReturnSumFor2PositiveNumbers();
//        calculatorTest.testAddShouldReturnSumForPositiveNumberAndZero();

        TestRunner runner = new TestRunner();
        runner.run(CalculatorTest.class, UserTest.class);
    }

}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    public CalculatorTest() {

    }

    public void beforeEachInit() {
        System.out.println("Init....");
    }

    public void testAddShouldReturnSumFor2PositiveNumbers() {
        if (calculator.add(1, 2) == 3) {
            System.out.println("Ok");
        } else {
            throw new RuntimeException();
        }
    }

    public void testAddShouldReturnSumForPositiveNumberAndZero() {
        if (calculator.add(1, 0) == 1) {
            System.out.println("Ok");
        } else {
            throw new RuntimeException();
        }
    }
}

class UserTest {
    public UserTest() {

    }

    public void test1() {
        System.out.println("One");
    }

    public void test2() {
        System.out.println("Two");
    }

    public void test5() {
        System.out.println("Five");
    }
}

class TestRunner {

    public void run(Class<?>... classes) throws Exception {
        for (Class<?> aClass : classes) {
            run(aClass);
        }
    }

    public void run(Class<?> clazz) throws Exception {
        Constructor<?> constructor = clazz.getConstructor();

        Object object = constructor.newInstance();

        Method[] methods = clazz.getMethods();

        List<Method> testMethods = new ArrayList<>();
        List<Method> beforeEachMethods = new ArrayList<>();

        for (Method method : methods) {
            if (method.getName().startsWith("test")) {
                testMethods.add(method);
            } else if (method.getName().startsWith("beforeEach")) {
                beforeEachMethods.add(method);
            }
        }

        for (Method testMethod: testMethods) {
            for (Method beforeEachMethod : beforeEachMethods) {
                beforeEachMethod.invoke(object);
            }
            testMethod.invoke(object);
        }
    }
}