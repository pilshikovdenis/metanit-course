package com.chapter3_5;

public class Dog implements CanBark{
    @Override
    public void bark() {
        System.out.println("dog barking");
    }

    @Override
    public void makeSound() {
        System.out.println("dog make some not understandable sounds");
    }
}
