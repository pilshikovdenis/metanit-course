package com.chapter3_15;

public class GeneralizedInterfaces {
    public static void main(String[] args) {
//        using generalized interfaces
//        first method - create a class for each data type

        AccountString account = new AccountString("sid500", 10000);
        System.out.println(account.getId());

        AccountInt account2 = new AccountInt(112, 20000);
        System.out.println(account2.getId());
    }
}
