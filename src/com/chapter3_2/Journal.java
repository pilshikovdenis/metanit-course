package com.chapter3_2;

public class Journal implements Printable {
    String name;

    public String getName() {
        return name;
    }
    Journal(String name) {
        this.name = name;
    }
}