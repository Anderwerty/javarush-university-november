package com.javarush.module2.lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//SOLID
public class Example5 {
    public static void main(String[] args) {
        CannonPrinter cannonPrinter = new CannonPrinter();
        EpsonScanner epsonScanner = new EpsonScanner();
        EpsonMFD epsonMFD = new EpsonMFD();

        List<Printable> printers = new ArrayList<>();
        printers.add(cannonPrinter);
        printers.add(epsonMFD);
        for (Printable printable : printers) {
            printable.print("Hello!!!");
        }

        System.out.println("=============");

        List<Scannable> scanners = new ArrayList<>();
        scanners.add(epsonScanner);
        scanners.add(epsonMFD);

        for (Scannable scannable: scanners){
            scannable.scan("1");
        }
    }
}

class CannonPrinter implements Printable {

    @Override
    public void print(String source) {
        System.out.println(source);
    }
}

class EpsonScanner implements Scannable {

    @Override
    public void scan(String source) {

    }
}

class EpsonMFD implements Printable, Scannable {

    @Override
    public void scan(String source) {
        System.out.println("scan: " + source);
    }

    @Override
    public void print(String source) {
        System.out.println("print: " + source);
    }
}

// fy-fy
//interface GoldenInterface {
//    void scan(String source);
//
//    void print(String source);
//
//    void sendMessage(String source);
//}

interface Scannable {
    void scan(String source);
}

interface Printable {
    void print(String source);
}

interface MessageSender {
    void sendMessage(String source);

}
