package com.javarush.module3.lesson20;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Book");

        Author author = new Author();
        author.setName("Author");
        author.setBooks(Arrays.asList(book));
        book.setAuthor(author);


        System.out.println(book);
        System.out.println(author);
    }
}
