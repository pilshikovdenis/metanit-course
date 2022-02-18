package com.chapter2;

public class Arrays {
    public static void main(String[] args) {
//        1
        int[] numbers;
        numbers = new int[4];

//        2
        int[] numbers2 = new int[4];

//        3
        int[] numbers3 = new int[] {1, 22, 21, 8};

//        4
        int[] numbers4 = {1, 100, 22, 31};

        numbers4[0] = 200;
        System.out.println(numbers4[0]);

        System.out.println("numbers4 length is " + numbers4.length);

//        foreach
        for (int i : numbers4) {
            System.out.println(i);
        }

//        multi arrays
        int[][] matrix = { {0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }



    }
}
