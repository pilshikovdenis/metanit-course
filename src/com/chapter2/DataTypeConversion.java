package com.chapter2;

public class DataTypeConversion {
    public static void main(String[] args) {
        int a = 100;
        byte b = (byte) a;

        System.out.println(b);

        byte c = 15;
        int d = c;

//        автоматические преобразования
//        byte -> short -> int -> long
//        int -> double
//        short -> float -> double
//        char -> int

//        авто преобразования с потерей точности
        int az = 2147483647;
        float ay = az;
        System.out.println(ay);

//        явные преобразования
        long aa = 4;
        int bb = (int)a;
        System.out.println(bb);

//        потеря при преобразовании
        int a2 = 300;
        byte b2 = (byte) a2;
        System.out.println(b2);

//        усечение рациональных чисел до целых
        double a3 = 56.9898;
        int b3 = (int) a3;
        int c3 = (int) Math.round(a3);
        System.out.println(b3);
        System.out.println(c3);



    }
}
