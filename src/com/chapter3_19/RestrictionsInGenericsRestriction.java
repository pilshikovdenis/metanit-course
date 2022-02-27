package com.chapter3_19;

public class RestrictionsInGenericsRestriction {
    public static void main(String[] args) {
//        now we use restriction for our Account class
//        after will use restriction with Transaction

        Account<String> morris = new Account<String>("100", 5000);
        Account<String> garry = new Account<String>("101", 3000);
        Transaction<Account<String>> transaction = new Transaction<Account<String>>(morris, garry, 1500);

        morris.showReport();
        garry.showReport();
        transaction.execute();
        morris.showReport();
        garry.showReport();

    }
}
