package com.hillel.classwork.lesson10;

public class Fill2DArray {

    public static void main(String[] args) {

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
