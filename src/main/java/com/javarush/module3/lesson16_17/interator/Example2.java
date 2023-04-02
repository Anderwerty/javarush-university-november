package com.javarush.module3.lesson16_17.interator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Example2 {
    public static void main(String[] args) {
        for (Integer integer : new MyIterable<>(1, 2, 3)) {
            System.out.println(integer);
        }
    }
}

class MyIterable<E> implements Iterable<E> {
    private final E value1;
    private final E value2;
    private final E value3;

    MyIterable(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int stepCounter = 0;

            @Override
            public boolean hasNext() {
                return stepCounter < 3;
            }

            @Override
            public E next() {
                if (stepCounter == 0) {
                    stepCounter++;
                    return value1;
                }

                if (stepCounter == 1) {
                    stepCounter++;
                    return value2;
                }

                if (stepCounter == 2) {
                    stepCounter++;
                    return value3;
                }

                throw new NoSuchElementException("<your message put here>");
            }
        };
    }
}
