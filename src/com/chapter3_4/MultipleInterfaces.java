package com.chapter3_4;

public class MultipleInterfaces {
    public static void main(String[] args) {
        Human human = new Human();
        human.run();
        human.speak();

        Animal animal = new Animal();
        animal.fly();
        animal.run();

    }
}
