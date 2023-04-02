package com.javarush.module3.lesson3;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @BeforeEach
    public void before1(){
        System.out.println("before each 1");
    }

    @BeforeEach
    public void before2(){
        System.out.println("before each 2");
    }

    @AfterEach
    public void after1(){
        System.out.println("after each 1");
    }

    @AfterEach
    public void after2(){
        System.out.println("after each 2");
    }

    @Test
    @Disabled
    void calculateShouldReturnResultOfAddingToPositiveNumbers() {
        int actual = calculator.calculate(10, Operator.ADD, 10);
        int expected = 20;

        assertEquals(expected, actual);
    }

    @Test
    @Timeout(value = 1)
    void calculateShouldThrowIllegalArgumentExceptionIfDivisorIsZero() {
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class,
                        () -> calculator.calculate(10, Operator.DIV, 0), "blabla");
        assertEquals(exception.getMessage(), "division by zero");
    }

    @Nested
    class DivisionTest{
        @Test
        @DisplayName("example .....................................")
        void innerTest(){}
    }

    @Test
    void testResult() {
        Result actual = calculator.method();

        Result expected = new Result(1);

        //option1
        assertEquals(expected, actual);

        //option2
        assertResult(actual, expected);

        Assertions.assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(actual.getValue(),expected.getValue()),
                () -> assertNotSame(actual, expected)
        );
    }

    private void assertResult(Result actual, Result expected) {
        assertEquals(expected.getValue(), actual.getValue());
    }

}