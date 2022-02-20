package com.chapter3_6;

public class Journal implements Printer.Printable {
    String name;

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
