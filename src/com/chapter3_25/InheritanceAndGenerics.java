package com.chapter3_25;

public class InheritanceAndGenerics {
    public static void main(String[] args) {
//        convertation generalized classes
        DepositAccount<Integer> depositAccount = new DepositAccount<Integer>(117);
        Account<Integer> account = (Account<Integer>) depositAccount;

        DepositAccount<String> depositAccount1 = new DepositAccount<String>("seed43");
        Account<String> account1 = (Account<String>) depositAccount1;


    }
}
