package com.chapter3_22;

public class DepositAccount<T,S> extends Account<T> {
    private S name;
    DepositAccount(T id, S name) {
        super(id);
        this.name = name;
    }
    public S getName() { return name; }
    public void showReport() {
        System.out.printf("id: %s name: %s\n", super.getId(), getName());
    }
}
