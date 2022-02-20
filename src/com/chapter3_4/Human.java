package com.chapter3_4;

public class Human implements Runable, Speakable {
    public void run() {
        System.out.println("Human running");
    }

    public void speak() {
        System.out.println("Human say something");
    }

}
