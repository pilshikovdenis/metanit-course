package com.chapter2;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(12, 42));
        System.out.println(sum(12, 21, 22));
        System.out.println(sum("Morris ", "Anderson"));

    }

    static int sum (int x, int y) {
        return x + y;
    }
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    static String sum(String a, String b) {
        return a + b;
    }
}
