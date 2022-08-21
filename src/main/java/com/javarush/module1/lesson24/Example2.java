package com.javarush.module1.lesson24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example2 {
    private static final int BUFFER_SIZE = 10000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        File file = new File("src/main/resources/song.txt");

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            char[] buffer = new char[BUFFER_SIZE];

            while ((bufferedReader.read(buffer)) != -1) {
                System.out.print(buffer);
            }

        } catch (IOException e) {
            throw new FileNotFoundRuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

}
