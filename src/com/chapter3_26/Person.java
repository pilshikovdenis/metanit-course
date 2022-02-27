package com.chapter3_26;

public class Person implements Cloneable {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name + " age: " + age);
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }


}
