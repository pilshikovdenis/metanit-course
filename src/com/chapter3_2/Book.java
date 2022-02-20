package com.chapter3_2;

public class Book implements Printable {
    String name;
    String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("Book: %s Author: %s\n", name, author);
    }
}