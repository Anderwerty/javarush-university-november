package com.javarush.module1.lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) throws IOException {
        try (InputStream stream = System.in;
             Scanner console = new Scanner(stream)) {
            String line = console.nextLine(); // next()
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream stream = System.in;
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader buff1 = new BufferedReader(reader);
        BufferedReader buff2 = new BufferedReader(buff1);
        String line = buff2.readLine();

    }
}
