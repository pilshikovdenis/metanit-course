package com.chapter3_22;

public class Account<T> {
    private T id;
    public T getId() {
        return id;
    }
    Account(T id) {
        this.id = id;
    }
}
