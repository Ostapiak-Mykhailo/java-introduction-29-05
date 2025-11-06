package com.hillel.homework.homeworklesson10;

import java.util.Arrays;

public class HomeTask2 {

    public static void main(String[] args) {

        int[][] numbers = fillArray();
        printArray(numbers);
        getIndexesOfNegativeElements(numbers);
    }

    public static int[][] fillArray() {
        int[][] arr = new int[5][5];
        System.out.println("Here`s your array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (100 - (-20) + 1)) + (-20);
            }
        }
        return arr;
    }

    public static void getIndexesOfNegativeElements(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] < 0) {
                    System.out.println("index (" + i + "; " + j + ")" + " has value " + numbers[i][j]);
                }
            }
        }
    }

    public static void printArray(int[][] numbers) {
        for (int[] ints : numbers) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
