package com.chapter3_10;

public class Enums {
    public static void main(String[] args) {
        Task task = new Task("call to Sam", "Morris", Priority.LOW);
        Task task2 = new Task("buy macbook m1", "Denis", Priority.MIDDLE);

        task.showDescription();
        System.out.println();

        task2.showDescription();
    }
}



