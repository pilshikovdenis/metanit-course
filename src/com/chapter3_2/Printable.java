package com.chapter3_2;

public interface Printable {

//    using default methods
    default void print() {
        System.out.println("Undefined printable");
    }

//    using static methods
    static void printSomeInfo() {
        System.out.println("This is some info printed by static method");
    }
}
