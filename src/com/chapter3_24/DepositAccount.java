package com.chapter3_24;

public class DepositAccount<T> extends Account{
    private T id;
    DepositAccount(String name, T id) {
        super(name);
        this.id = id;

    }
    public T getId() { return id; }
}


