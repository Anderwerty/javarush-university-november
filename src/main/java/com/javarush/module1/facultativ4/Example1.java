package com.javarush.module1.facultativ4;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Example1 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile access =
                     new RandomAccessFile(new File("src/main/resources/gimn.txt"), "rw")) {

            FileChannel fileChannel = access.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(16);
//            CharBuffer charBuffer = byteBuffer.asCharBuffer();
            while (fileChannel.read(byteBuffer) != -1) {
                byteBuffer.flip();
                System.out.print(new String(byteBuffer.array()));

                byteBuffer.clear();

            }
//

        }
    }

}
