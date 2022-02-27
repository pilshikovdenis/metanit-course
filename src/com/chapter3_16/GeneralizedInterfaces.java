package com.chapter3_16;

import com.chapter3_15.AccountInt;
import com.chapter3_15.AccountString;

public class GeneralizedInterfaces {
    public static void main(String[] args) {
//        using generalized interfaces
//        second method - create a class which should use same generalized parameter
        Account<String> account = new Account<String>("sid3", 5000);
        System.out.println(account.getId());

        Account<Integer> account2 = new Account<Integer>(12, 30000);
        System.out.println(account2.getId());

    }
}
