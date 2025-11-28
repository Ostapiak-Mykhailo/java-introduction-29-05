package com.hillel.homework.homeworklesson13;

public class Indexes {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0, 9};
        System.out.println("Elements with the following indexes add up to 10: ");
        findIndexes(array);
    }

    private static void findIndexes(int[] array) {
        int a = 10;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == a){
                    System.out.println( i + "; " + j);
                }
            }
        }
    }
}
