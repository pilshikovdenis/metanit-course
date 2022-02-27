package com.chapter3_20;

public class InterfacesLikeGenericsRestcrictions {
    public static void main(String[] args) {
        Account morris = new Account("Morris", 6000);
        Account gerda = new Account("Gerda", 500);
        Transaction<Account> transaction = new Transaction<Account>(morris, gerda, 2000);

        morris.showReport();
        gerda.showReport();
        transaction.execute();

        morris.showReport();
        gerda.showReport();
        Transaction<Account> transaction1 = new Transaction<Account>(gerda, morris, 6000);
        transaction1.execute();
    }
}


//also we can use multiple restrictions
//class Person{}
//interface Accountable{}
//
//class Transaction<T extends Person & Accountable>{}