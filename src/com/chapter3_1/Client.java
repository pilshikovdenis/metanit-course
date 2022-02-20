package com.chapter3_1;

public class Client extends Person{
    private String bank;
    private int sum;

    public String getBank() {
        return bank;
    }
    public int getSum() {
        return sum;
    }

    Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    @Override
    void display() {
        System.out.printf("client %s have account in %s " +
                "and have money = %d\n", getName(), getBank(), getSum());
    }
}
