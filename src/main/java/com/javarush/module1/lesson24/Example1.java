package com.javarush.module1.lesson24;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Example1 {

    private static final int BUFFER_SIZE = 10000;

    public static void main(String[] args) {
        File file = new File("src/main/resources/song.txt");
        System.out.println("Стефанія мамо мамо Стефанія".length());
        System.out.println("Вона мене колисала дала мені ритм і напевне силу волі".length());

        try (FileReader fileReader = new FileReader(file)) {
            int size;
            char[] buffer = new char[BUFFER_SIZE];

            while ((size = fileReader.read(buffer)) != -1) {
//                if (size == BUFFER_SIZE) {
//                    System.out.print(buffer);
//                } else{
//                    System.out.print(""); // ????
//                Arrays.asList(buffer).subList(0, size-1)
//                }
                System.out.print(buffer);

                buffer = new char[BUFFER_SIZE];

            }

        } catch (IOException e) {
            throw new FileNotFoundRuntimeException(e);
        }
    }
}

class FileNotFoundRuntimeException extends RuntimeException {
    public FileNotFoundRuntimeException(Throwable cause) {
        super(cause);
    }
}
