package com.chapter3_18;

public class GenericsRestriction {
    public static void main(String[] args) {
//        restrict our generics in Transation class


        Account morris = new Account("112", 5000);
        Account igor = new Account("113", 1000);
        Transaction transaction = new Transaction(morris, igor, 1000);

        morris.showReport();
        igor.showReport();
        transaction.execute();
        morris.showReport();
        igor.showReport();

        Transaction transaction1 = new Transaction(igor, morris, 6000);
        transaction1.execute();

    }
}
