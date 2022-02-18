package com.chapter2;

public class ParametersOfMethods {
    public static void main(String[] args) {
        sum(12, 51);
        showName("Morris", "Henderson");
        showNumbers(1, 2, 3, 4, 500, 21);

    }

    static void sum (int x, int y) {
        System.out.println(x + y);
    }
    static void showName(String name, String surname) {
        System.out.printf("Name: %s " , name);
        System.out.printf("Surname: %s\n", surname);
    }

    static void showNumbers(int ...nums) {
        for (int i : nums) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

}
