package com.javarush.module2.lesson10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileRecursion {

    public static void main(String[] args) {
        List<File> allFiles = new ArrayList<>();

        printAllFiles(new File("src/main/resources"), allFiles,
                new Search<>("", (t, file) -> true));

        System.out.println(allFiles.size());

        List<File> allPdfs = new ArrayList<>();

        printAllFiles(new File("src/main/resources"), allPdfs,
                new Search<>(".pdf", (t, file) -> file.getName().endsWith(t)));

        System.out.println(allPdfs.size());
        System.out.println(allPdfs.get(0).getName());
    }

    public static <T> void printAllFiles(File dir, List<File> files,
                                         Search<T> search) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                printAllFiles(file, files, search);
            } else {
                if (search.isMatch(file)) {
                    files.add(file);
                }
            }
        }
    }
}

interface Condition<T> {
    boolean isMatch(T t, File file);
}

class Search<T> {
    public final T items;
    public final Condition<T> condition;

    public Search(T items, Condition<T> condition) {
        this.items = items;
        this.condition = condition;
    }

    public boolean isMatch(File file) {
        return condition.isMatch(items, file);
    }
}
