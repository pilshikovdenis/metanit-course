package com.chapter3_3;

public class WaterPipe implements Stateable{
    @Override
    public void printState(int n) {
        if (n == OPEN) {
            System.out.println("Water is open");
        }
        else if (n == CLOSED) {
            System.out.println("Water is closed");
        }
        else {
            System.out.println("State is invalid");
        }
    }
}
