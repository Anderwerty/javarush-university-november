package com.javarush.module3.lesson20;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Book {
    private String name;
    private Author author;

    public Book() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
