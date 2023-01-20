package com.javarush.module3.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class QuestionTest {
    @Test
    void test() {
        List<String> listMock = Mockito.mock(ArrayList.class);

        Mockito.doAnswer(invocation -> {
            Integer integer = invocation.getArgument(0, Integer.class);
            return integer == 1 ? "IVAN" : "STEPAN";
        }).when(listMock).get(1);

        Assertions.assertEquals("IVAN", listMock.get(1));
    }
}

class User{
    private int age;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
