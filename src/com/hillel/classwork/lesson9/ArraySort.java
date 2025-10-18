package com.hillel.classwork.lesson9;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = new int[100000];

        fill(numbers);
        long start = System.currentTimeMillis();
        int n = numbers.length;
        bubbleSort(n, numbers);
        Arrays.sort(numbers);
        long end = System.currentTimeMillis();
        System.out.println("time " + (end - start));
    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    private static void bubbleSort(int n, int[] numbers) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}