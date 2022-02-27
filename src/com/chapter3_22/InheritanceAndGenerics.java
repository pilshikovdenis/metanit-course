package com.chapter3_22;

public class InheritanceAndGenerics {


    public static void main(String[] args) {
        //    class, who inherited from generalized class can have generalized types
        DepositAccount<Integer, String> deposit = new DepositAccount<Integer, String>(112, "Mark");
        DepositAccount<String, Integer> deposit2 = new DepositAccount<String, Integer>("34", 12);
        DepositAccount<Integer, Integer> deposit3 = new DepositAccount<Integer, Integer>(12, 2);
        DepositAccount<String, String> deposit4 = new DepositAccount<String, String>("001", "Molly");

        deposit.showReport();
        deposit2.showReport();
        deposit3.showReport();
        deposit4.showReport();

    }
}
