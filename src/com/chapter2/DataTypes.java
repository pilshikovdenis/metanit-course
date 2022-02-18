package com.chapter2;

public class DataTypes {
    public static void main(String[] args) {
        boolean isRunning = true;
        boolean canStop = false;

        byte age = 23;
        short c = 31000;
        int d = 27000000;
        long e = 11360000000L;

        double position = 87.3456;
        float mass = 112.33f;
        char ch = 'l';

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println();


//        другие системы счисления
        int x = 0x6F;   //16
        int y = 010;    //8
        int num13 = 0b1101; //2

//        разделение разрядов
        int value = 112_324_10;
        System.out.println(value);

//        strings and chars
        String text = "First string of message\n" +
                "Second String of message\n" +
                "Third String of message\n";
        System.out.println(text);


    }
}
