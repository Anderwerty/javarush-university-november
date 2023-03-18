package com.javarush.module3.lesson20;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;

public class Example2 {
    public static void main(String[] args) {
        CollectionUtils.unmodifiableCollection(null);

        Collections.unmodifiableCollection(null);
    }
}
