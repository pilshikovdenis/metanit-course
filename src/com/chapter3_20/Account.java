package com.chapter3_20;

public class Account implements Accountable {
    private String id;
    private int sum;

    Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id;}
    public void setSum(int sum) { this.sum = sum; }
    public int getSum() { return sum; }

    public void showReport() {
        System.out.printf("Id: %s Balance: %d\n",id, sum );
    }

}
