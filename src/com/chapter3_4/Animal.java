package com.chapter3_4;

public class Animal implements Flyable, Runable{
    public void fly() {
        System.out.println("Animal fly");
    }

    public void run() {
        System.out.println("Animal run");
    }
}

