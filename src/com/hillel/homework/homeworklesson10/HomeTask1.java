package com.hillel.homework.homeworklesson10;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter dimensions of your array:)");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = fillArray(scanner, n, m);
        int[][] transposed = transposeArray(array, n, m);
        printMessage(array, transposed);

    }

    public static int[][] fillArray(Scanner scanner, int n, int m) {
        System.out.println("Please fill your array with any numbers you want:)");
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static int[][] transposeArray(int[][] array, int n, int m) {
        int[][] trn = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                trn[j][i] = array[i][j];
            }
        }
        return trn;
    }

    public static void printArray(String message, int[][] array) {
        System.out.println(message);
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void printMessage(int[][] array, int[][] transposed) {
        printArray("Here`s your array: ", array);
        printArray("Here`s your array transposed: ", transposed);
    }
}
