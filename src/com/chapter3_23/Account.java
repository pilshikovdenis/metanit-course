package com.chapter3_23;

public class Account<T> {
    private T id;
    public T getId() {
        return id;
    }
    Account(T id) {
        this.id = id;
    }
}
