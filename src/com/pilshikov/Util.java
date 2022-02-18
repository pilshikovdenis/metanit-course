package com.pilshikov;

public class Util {
    public static void printArray(String[] data) {
        for (String elem : data) {
            System.out.println(elem);
        }
    }

    public static void printArray(int[] data) {
        for (int elem : data) {
            System.out.printf("%d ", elem);
        }
        System.out.println();
    }
}
