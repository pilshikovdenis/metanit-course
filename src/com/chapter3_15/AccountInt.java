package com.chapter3_15;

public class AccountInt implements Accountable {
    private int id;
    private int sum;

    AccountInt(int id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public Integer getId() { return id; }
    public void setSum(int sum) { this.sum = sum; }
    public int getSum() { return sum; }

}
