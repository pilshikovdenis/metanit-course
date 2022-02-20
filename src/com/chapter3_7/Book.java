package com.chapter3_7;

public class Book implements Printable {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void print() {
        System.out.printf("%s - %s\n", name, author);
    }
}
