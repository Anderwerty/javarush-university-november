package com.javarush.module1.facultativ2;

import java.io.File;
import java.util.Scanner;

// 1 encoder
// 1.1 encoding
// 1.2 decoding
// console --> file
// 1.1 with file input file.txt ---> file_encode.txt
// 1.2 with fil input file.txt ----> file_decode.txt
public class AnagramRunner {
    public final AnagramMaker anagramMaker;

    public AnagramRunner(AnagramMaker anagramMaker) {
        this.anagramMaker = anagramMaker;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        printMessage("please input path to file");
        String filepath = scanner.nextLine();
        boolean isWorking = true;

        while (isWorking) {
            printMessage("Input your choose 1- ... 2- ... 3- ... 4- ...");
            int choose = scanner.nextInt();
            if (choose == 1) {
                printMessage("mode: console file");
                String mode = scanner.nextLine();
                if ("console".equals(mode)) {
                    printMessage(" ");
                    String text = scanner.nextLine();
                    printMessage("delta ?");
                    int delta = scanner.nextInt();
                    String result = anagramMaker.encode(text, delta);
                    printMessage(result);
                } else {
                    String path = scanner.nextLine();
                    File file = new File(path);

                    // 0) read from file all into local variable, encode and write result into file
                    // 1) read from file part into buffer, chars from buffer encode write them into new file
                    // file ---> read part ----> encode ---> write into file
                }

            } else if (choose == 2) {
                printMessage(" ");
                String text = scanner.nextLine();
                String result = anagramMaker.decode(text, 100);
                printMessage(text);
            } else if (choose == 3) {
                //...
            } else if (choose == 4) {
                isWorking = false;
            } else {
                printMessage("");
            }
        }
    }

    @SuppressWarnings("squid:S106")
    private void printMessage(String message){
        System.out.println(message);
    }

}
