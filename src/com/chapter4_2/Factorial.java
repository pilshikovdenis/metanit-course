package com.chapter4_2;

public class Factorial {
    public static int getFactorial(int number) throws FactorialException{

        if(number<1) throw new FactorialException("Number is less then 1", number);
        int result = 1;
        for(int i = 1; i<=number; i++) {
            result *= i;
        }
        return result;
    }
}
