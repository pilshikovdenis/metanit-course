package com.chapter2;

public class Loops {


    public static void main(String[] args) {
        //    for
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        for (int i = 20; i <= 0; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println();

//        do
        int a = 0;
        do {
            System.out.printf("%d ", a);
            a++;
        }
        while (a < 10);
        System.out.println();


        int b = 9;
        do {
            System.out.printf("%d ", b);
            b--;
        }
        while (b >= 0);
        System.out.println();

//        while
        int x = 0;
        while (x < 10) {
            System.out.printf("%d ", x);
            x++;
        }
        System.out.println();

        int v = 0;
        while (true) {
            if (v == 10) break;
            System.out.print("ok ");
            v++;
        }
        System.out.println();




    }
}
