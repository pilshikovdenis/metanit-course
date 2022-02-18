package com.chapter2;

public class Methods {
    public static void main(String[] args) {
        sayHello();
        sayMessage("Morris");
        sum(12, 38);

    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayMessage(String message) {
        System.out.println(message);
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }
}
