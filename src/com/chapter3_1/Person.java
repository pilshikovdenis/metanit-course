package com.chapter3_1;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.printf("i am person. my name is %s\n", getName());
    }
}
