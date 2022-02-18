package com.chapter2;

public class RecursiveFunctions {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    static int factorial(int x){
        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}
