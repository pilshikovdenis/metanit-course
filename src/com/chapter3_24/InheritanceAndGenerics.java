package com.chapter3_24;

public class InheritanceAndGenerics {
//    sitiation when super class dont have generics
public static void main(String[] args) {
    DepositAccount<Integer> depositAccount = new DepositAccount<Integer>("Morris", 1);
    DepositAccount<String> depositAccount1 = new DepositAccount<String>("Victor", "sd1");

    System.out.println(depositAccount.getName() + " " + depositAccount.getId());
    System.out.println(depositAccount1.getName() + " " + depositAccount1.getId());
}
}
