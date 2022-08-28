package com.javarush.module1.lesson26;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class Example2 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile access =
                     new RandomAccessFile(new File("src/main/resources/gimn.txt"), "rw")) {

            FileChannel fileChannel = access.getChannel();

            ByteBuffer byteBuffer = ByteBuffer.allocate(16);
            Charset charset = Charset.defaultCharset();
//            CharBuffer charBuffer = charset.decode(byteBuffer);
            while (fileChannel.read(byteBuffer) != -1) {
                byteBuffer.flip(); // write ---> read

// read
                while (byteBuffer.hasRemaining()) {

                    System.out.print((char) byteBuffer.get());
                }
                byteBuffer.clear();

            }
//

        }
    }

}
