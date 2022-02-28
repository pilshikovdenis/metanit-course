package com.chapter4_2;

public class CreateThrowsClasses {
    public static void main(String[] args) {
        try{
            int r = Factorial.getFactorial(7);
            System.out.println(r);

            int a = Factorial.getFactorial(-4);
            System.out.println(a);
        }
        catch (FactorialException ex) {
            System.out.println(ex.getMessage() + "(" + ex.getNumber() + ")");
        }

    }
}
