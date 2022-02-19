package com.chapter3;

public class AccessModifiers {
    public static void main(String[] args) {
        Person user = new Person("Morris", "Vinston", 33);
        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getAge());
    }
}

class Person {
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
    }
    public void setName(String name) {
        if (name.length() == 0 || name.length() < 30) {
            this.name = name;
        }
        else
            this.name = "Undefined name";

    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        if (surname.length() == 0 || surname.length() < 30) {
            this.surname = surname;
        }
        else
            this.surname = "Undefined name";
    }
    public String getSurname() {
        return surname;
    }

    public void setAge(int age){
        if (age < 1 || age > 100) return;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}