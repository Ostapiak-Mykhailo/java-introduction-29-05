package com.hillel.homework.homeworklesson9;

import java.util.Arrays;

public class HomeTask2 {

    public static void main(String[] args) {

        int[] numbers = {4, 0, 6, 0, 78, 0, 6, -13, 4, 0, -10};
        System.out.println("Your array is: " + Arrays.toString(numbers));
        replaceZeroes(numbers);
        System.out.println("Your array whith zeroes replaced is: " + Arrays.toString(numbers));
    }

    public static void replaceZeroes(int[] numbers) {
        int temp = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j] == 0) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
}