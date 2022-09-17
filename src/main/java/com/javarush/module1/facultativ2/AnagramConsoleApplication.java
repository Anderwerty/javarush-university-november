package com.javarush.module1.facultativ2;

public class AnagramConsoleApplication {
    public static void main(String[] args) {
        char[] symbols = "abcd".toCharArray();
        // Ї І Ъ Ё
        AnagramMaker anagramMaker = new AnagramMaker(symbols);
        new AnagramRunner(anagramMaker).run();
    }
}
