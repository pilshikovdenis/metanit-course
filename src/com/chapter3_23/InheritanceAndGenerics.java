package com.chapter3_23;

public class InheritanceAndGenerics {
    public static void main(String[] args) {
//        situation, when inherited class dont have generics
        DepositAccount depositAccount = new DepositAccount();
        System.out.println(depositAccount.getId());
    }
}
