package com.chapter3_14;

public class Generics {
    public static void main(String[] args) {

//        using generalized classes
        Account<String> account = new Account<String>("sid112", 500000);
        System.out.println(account.getId());

        Account<Integer> account1 = new Account<Integer>(33, 100000);
        Integer account1Id = account1.getId();
        System.out.println(account1Id);


        }
}
