package com.chapter3_5;

public class InheritanceInInterfaces {
    public static void main(String[] args) {
//        using inheritance in interfaces
        Human human = new Human();
        human.makeSound();
        human.speak();

        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();

    }
}
