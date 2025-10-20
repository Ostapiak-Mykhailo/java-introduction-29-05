package com.hillel.homework.homeworklesson10;

import java.util.Arrays;

public class ExtraHomeTask1 {
   /* Заполните 2 матрицы 3 на 5 случайными числами в диапазоне от 1 до 99
    Выведите их в консоль
    Просуммируйте их, выведите в консоль результат
    Перемножьте их, выведите в консоль результат*/
    public static void main(String[] args) {

        int[][] array1 = fillArray();
        int[][] array2 = fillArray();
        int[][] added = addArray(array1, array2);
        int[][] multiplied = multiplyArray(array1, array2);
        printMessage(array1, array2, added, multiplied);
    }

    public static int[][] fillArray() {
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 99) + 1;
            }
        }
        return arr;
    }

    public static int[][] addArray(int[][] array1, int[][] array2) {
        int[][] add = new int[array1.length][array1[0].length];
        for (int i = 0; i < add.length; i++) {
            for (int j = 0; j < add[i].length; j++) {
                add[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return add;
    }

    public static int[][] multiplyArray(int[][] array1, int[][] array2) {
        int[][] multiply = new int[array1.length][array1[0].length];
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                multiply[i][j] = array1[i][j] * array2[i][j];
            }
        }
        return multiply;
    }

    public static void printMessage(int[][] array1, int[][] array2, int[][] added, int[][] multiplied) {
        System.out.println("Here`s a matrix 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(Arrays.toString(array1[i]));
        }
        System.out.println();
        System.out.println("Here`s a matrix 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
        System.out.println();
        System.out.println("Here`s matrix 1 and 2 added: ");
        for (int i = 0; i < added.length; i++) {
            System.out.println(Arrays.toString(added[i]));
        }
        System.out.println();
        System.out.println("Here`s a matrix 1 and 2 multiplied: ");
        for (int i = 0; i < multiplied.length; i++) {
            System.out.println(Arrays.toString(multiplied[i]));
        }
    }
}
