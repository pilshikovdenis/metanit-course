package com.chapter3_16;

public class Account<T> implements Accountable {
    private T id;
    private int sum;

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public void setSum(int sum) { this.sum = sum; }
    public int getSum() { return sum; }

}
