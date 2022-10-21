package com.javarush.module2.facultative1;

import java.util.Arrays;
import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {
        Integer[] items1 = {1, -1, 2, -2};
        System.out.println(Arrays.toString(items1));

        SortExecution bubbleSortExecution = new BubbleSortExecution();
        bubbleSortExecution.sort(items1);

        System.out.println(Arrays.toString(items1));

        System.out.println("===========================");
        Integer[] items2 = {1, -1, 2, -2};
        System.out.println(Arrays.toString(items2));

        SortExecutionGeneric<Integer> bubbleSortExecutionGeneric = new BubbleSortExecutionGeneric<>();
        bubbleSortExecutionGeneric.sort(items2, (first, second) -> second > first);

        System.out.println(Arrays.toString(items2));

        Function<String, Integer> calculateSymbols = (input) -> input.length();

        System.out.println(calculateSymbols.apply("Hello"));

    }
}

interface SortExecution {
    void sort(Integer[] items);
}


class BubbleSortExecution implements SortExecution {

    @Override
    public void sort(Integer[] items) {

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j] < items[j + 1]) {
                    swap(items, j);
                }
            }
        }
    }

    private void swap(Integer[] items, int j) {
        int temp = items[j];
        items[j] = items[j + 1];
        items[j + 1] = temp;
    }
}

interface SortExecutionGeneric<T> {
    void sort(T[] items, ItemComparator<T> comparator);
}

interface ItemComparator<T> {
    boolean isSecondBiggerFirst(T first, T second);
}

class IntegerComparator implements ItemComparator<Integer> {

    @Override
    public boolean isSecondBiggerFirst(Integer first, Integer second) {
        return second > first;
    }
}

class BubbleSortExecutionGeneric<T> implements SortExecutionGeneric<T> {

    @Override
    public void sort(T[] items, ItemComparator<T> comparator) {

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (comparator.isSecondBiggerFirst(items[j], items[j + 1])) {
                    swap(items, j);
                }
            }
        }
    }

    private void swap(T[] items, int j) {
        T temp = items[j];
        items[j] = items[j + 1];
        items[j + 1] = temp;
    }
}