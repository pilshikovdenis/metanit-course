package com.chapter2;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
//        обработка простого исключения
//        try {
//            int[] numbers = new int[3];
//            numbers[4] = 5;
//            System.out.println(numbers[4]);
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            System.out.println("Finally block. This code will be run always");
//        }
//        System.out.println("Программа завершена");



//        обработка сразу нескольких исключений
//        int[] numbers2 = new int[3];
//        try {
//            numbers2[6] = 45;
//            numbers2[6] = Integer.parseInt("wds");
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Выход за пределы границ массива");
//        }
//        catch (NumberFormatException ex) {
//            System.out.println("Ошибка преобразования строки в число");
//        }



//        вызов сосбтвенного исключения
        String name;
        int age = 0;
        final int MAX_AGE = 110;
        final int MIN_AGE = 18;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        name = scanner.nextLine();
        System.out.printf("Min. age is %d, Max.age is %d, Confirm your age", MIN_AGE, MAX_AGE);

        try {
            age = scanner.nextInt();
            if (age > MAX_AGE || age < MIN_AGE)
                throw new Exception("The age must match the conditions");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Program was ended with error");
        }

        System.out.println("Programm closed");







    }
}
