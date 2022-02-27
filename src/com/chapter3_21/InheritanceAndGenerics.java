package com.chapter3_21;

public class InheritanceAndGenerics {


    public static void main(String[] args) {
        DepositAccount<Integer> deposit = new DepositAccount<Integer>(5000);
        DepositAccount<String> deposit2 = new DepositAccount<String>("1120");

        System.out.println(deposit.getId());
        System.out.println(deposit2.getId());


    }
}
