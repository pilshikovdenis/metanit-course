package com.chapter2;

import java.util.Scanner;

public class ConsoleInputOutput {
    public static void main(String[] args) {
        System.out.println("This is some message");

        String name = "Morris";
        int age = 32;
        double mass = 67.3;
        System.out.printf("Name:%s Age:%d Mass:%f\n", name, age, mass);


//      input
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int number = scanner.nextInt();
//
//        System.out.println("Your number is " + number);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data in the fields: Title, Price, Speed");
        String title = scanner.nextLine();
        System.out.println("ok");
        double price = scanner.nextDouble();
        System.out.println("ok");
        int speed = scanner.nextInt();

        System.out.println("Title is " + title);
        System.out.println("Price is " + price);
        System.out.println("Speed is " + speed);



    }
}
