package com.chapter2;

public class BooleanLogic {


    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 17;

        System.out.println( a == b);
        System.out.println( a != b);
        System.out.println(a < c);
        System.out.println(c > b);
//        <= >=

        System.out.println(a == 5 && b == 5);
        System.out.println(a == 4 || b == 5);
        System.out.println(a == 5 ^ b == 4);
    }
}
