package com.chapter2;

import java.math.BigDecimal;

public class ArifmethicalOperations {
    public static void main(String[] args) {
        System.out.println(5 + 5);
        System.out.println(10 - 2);
        System.out.println(23 * 2);

        System.out.println(33 / 2);
        System.out.println(33 / 2.0);

        System.out.println(33 % 2);
        System.out.println(Math.pow(12, 2));

//        ++a, --a
//        a++, a--

        int a = 5;
        System.out.println(--a);

        a = 5;
        System.out.println(a--);
// type for financial operations - BigDecimal
//        float, double - will be errors

        BigDecimal deposit = new BigDecimal("1300000.000032");
        BigDecimal fee = new BigDecimal("1.17");
        BigDecimal result = deposit.subtract(fee);
        System.out.println("Result equal " + result.toPlainString());


    }
}
