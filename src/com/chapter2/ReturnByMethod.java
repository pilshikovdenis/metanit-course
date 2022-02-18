package com.chapter2;

public class ReturnByMethod {
    public static void main(String[] args) {
        System.out.println(findMaxValue(12, 51));
        showColor(-12);
        showColor(3);
        showColor(2);
        showColor(0);
    }

    static int findMaxValue(int a, int b) {
        if (a >= b)
            return a;
        else
            return b;
    }

    static void showColor(int numberOfColor) {
        if (numberOfColor > 2 || numberOfColor < 0)
            return;

        if (numberOfColor == 0)
            System.out.println("green");
        else if (numberOfColor == 1)
            System.out.println("purple");
        else
            System.out.println("white");
    }
}
