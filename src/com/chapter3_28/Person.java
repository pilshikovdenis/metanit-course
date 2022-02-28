package com.chapter3_28;

public record Person(String name, int age) {
    static int minAge;
    static int maxAge;
    static{
        minAge = 18;
        maxAge = 112;
    }

    public Person(String name, int age) {
        if(minAge<1 || maxAge>112) age = 18;
        this.name = name;
        this.age = age;
    }

//    using another constructor
    public Person(String name, String surname, int age) {
        this(name + " " + surname, age);
    }

    public String name() {
        return "person: " + name;
    }
    public String toString() {
        return "person: " + name + " age: " + age;
    }
}