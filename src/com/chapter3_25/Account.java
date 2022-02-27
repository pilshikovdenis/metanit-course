package com.chapter3_25;

public class Account<T> {
    private T id;
    public T getId() {
        return id;
    }
    Account(T id) {
        this.id = id;
    }
}
