package com.javarush.module1.lesson26;

import java.io.File;

public class Example3 {
    public static void main(String[] args) {
        findFile(new File("src/main/resources"));
    }

    // ** File ---> Path
    private static void findFile(File file) {
        if (file.isDirectory()) {
            System.out.println(file.getName() + " is directory");
            File[] files = file.listFiles();
            for (File f : files) {
                findFile(f);
            }
        } else {
            System.out.println(file.getName() + " is not directory");
        }
    }
}
