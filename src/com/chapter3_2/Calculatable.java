package com.chapter3_2;

public interface Calculatable {
    default int sum(int a, int b) {
        return sumAll(a,b);
    }
    default int sum(int a, int b, int c) {
        return sumAll(a, b, c);
    }
    private int sumAll(int ...nums) {
        int result = 0;
        for (int i : nums) {
            result += i;
        }
        return result;
    }
}
