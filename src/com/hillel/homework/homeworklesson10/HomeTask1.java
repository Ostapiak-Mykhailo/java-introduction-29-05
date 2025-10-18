package com.hillel.homework.homeworklesson10;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter dimensions of your array:)");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = getArrayDimensions(scanner);
        fillArray(scanner, array);
        printMessage(array);
        int[][] transposed = transposeArray(array);

    }

    public static int[][] getArrayDimensions(Scanner scanner) {

        int[][] arr = new int[n][m];
        return arr;
    }

    public static void fillArray(Scanner scanner, int[][] array) {
        System.out.println("Please fill your array with any numbers you want:)");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void transposeArray(int[][] array) {
        System.out.println("Here`s your array transposed: ");
        int[][] trn = new int[][];

    }

    public static void printMessage(int[][] array) {
        System.out.println("Here`s your array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
