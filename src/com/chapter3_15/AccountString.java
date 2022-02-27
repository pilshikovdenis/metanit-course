package com.chapter3_15;

public class AccountString implements Accountable {
    private String id;
    private int sum;

    AccountString(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

}
