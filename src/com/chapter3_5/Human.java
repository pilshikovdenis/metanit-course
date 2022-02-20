package com.chapter3_5;

public class Human implements CanSpeak{
    @Override
    public void speak() {
        System.out.println("human says something");
    }

    @Override
    public void makeSound() {
        System.out.println("human make sound");
    }
}
