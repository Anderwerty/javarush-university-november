package com.javarush.module3.lesson20;

import java.util.List;
import java.util.Objects;

public class Author {
    private String name;
    private List<Book> books;


    public Author() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this);
//    }


}
