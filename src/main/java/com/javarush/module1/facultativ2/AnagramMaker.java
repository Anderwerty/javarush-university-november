package com.javarush.module1.facultativ2;

//SOLID S -
public class AnagramMaker {
// array, list, set, map, your choose ??
//    public static void main(String[] args) {
//        String input = "abdc";
//
//        String encodedValue = encode(input);
//        String decode = decode(encodedValue);//"abdc"
//    }

    //
    private final char[] symbols; // list, set, map, ...
//    1. a A &

    public AnagramMaker(char[] symbols) {
        this.symbols = symbols;
    }

    //1000
    //10000000000
    //
    public String decode(String text, int delta) {
        return changeSymbols(text, -delta);
    }

    public String encode(String text, int delta) {
        return changeSymbols(text, delta);
    }


    private String changeSymbols(String text, int delta){
        // implementation
        return null;
    }
}
