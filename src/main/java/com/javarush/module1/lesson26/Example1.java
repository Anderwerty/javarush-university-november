package com.javarush.module1.lesson26;

import java.io.File;
import java.nio.file.Path;

public class Example1 {
    public static void main(String... args) {
        File file = new File("src/main/resources/gimn.txt");
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.getPath());
        System.out.println(file.canExecute());

        System.out.println("===========================");
        Path path = Path.of("src/main/resources/gimn.txt");
        System.out.println(path.getRoot());
        System.out.println(path.getNameCount());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath());

//        String.format()
        Path path1 = Path.of( "src", "main" ,"resources/gimn.txt");
        System.out.println(path1.getParent());
        System.out.println(path1.getFileName());
        System.out.println("\\");

    }
}
