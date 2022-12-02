package com.javarush.module2.facultative4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Example1 {
    // junit 3.8

    public static void main(String[] args) throws Exception {

//        TestRunner runner = new TestRunner();
//        runner.run(CalculatorTest.class, UserTest.class);

        Class<CalculatorTest> calculatorTestClass = CalculatorTest.class;

        Method method = calculatorTestClass.getDeclaredMethod("addShouldReturnSumFor2PositiveNumbers");

        System.out.println(method.isAnnotationPresent(Description.class));

        Description annotation = method.getAnnotation(Description.class);
        System.out.println(annotation.text());
        System.out.println(annotation.color());


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
        System.out.println("Before method");
    }

    @Test
    @Description(text = "Test sum of two positive numbers")  // junit 4 ----> junit 5
    public void addShouldReturnSumFor2PositiveNumbers() {
        if (calculator.add(1, 2) == 3) {
            System.out.println("Ok - test 1");
        } else {
            throw new RuntimeException();
        }
    }

    //
    @Test
    public void addShouldReturnSumForPositiveNumberAndZero() {
        if (calculator.add(1, 0) == 1) {
            System.out.println("Ok - test 2");
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
            System.out.println("Testing for class: " + aClass.getName());
            run(aClass);
            System.out.println("=".repeat(20));
        }
    }

    public void run(Class<?> clazz) throws Exception {
        Constructor<?> constructor = clazz.getConstructor();

        Object object = constructor.newInstance();

        Method[] methods = clazz.getMethods();

        List<Method> testMethods = new ArrayList<>();
        List<Method> beforeEachMethods = new ArrayList<>();

        for (Method method : methods) {
            if (isTestMethod(method)) {
                testMethods.add(method);
            } else if (isBeforeEachMethod(method)) {
                beforeEachMethods.add(method);
            }
        }

        invokeTestMethods(object, testMethods, beforeEachMethods);
    }

    private boolean isBeforeEachMethod(Method method) {
        return method.getName().startsWith("beforeEach");
    }

    private boolean isTestMethod(Method method) {
        return method.isAnnotationPresent(Test.class);
    }

    private void invokeTestMethods(Object object, List<Method> testMethods, List<Method> beforeEachMethods) throws IllegalAccessException, InvocationTargetException {
        for (Method testMethod : testMethods) {
            for (Method beforeEachMethod : beforeEachMethods) {
                beforeEachMethod.invoke(object);
            }
            System.out.println("Method: " + testMethod.getName());
            if (testMethod.isAnnotationPresent(Description.class)) {

                Description annotation = testMethod.getAnnotation(Description.class);
                System.out.println("Description: " + annotation.text());
            }
            testMethod.invoke(object);
            System.out.println("_".repeat(20));
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Description {
    String text();
    Color color() default Color.RED;
    int valueInt() default 100;
//    Class<? extends Exception> ex();
//    A a();

}

enum Color{
    RED
}

class  A{}
