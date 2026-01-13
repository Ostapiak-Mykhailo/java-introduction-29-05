package com.hillel.homework.homeworklesson13;

import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Your array: " + Arrays.toString(array));

        int[] arrayShiftedRight = shiftArrayRight(array);
        System.out.println("Your array shifted to the right: " + Arrays.toString(arrayShiftedRight));

        int[] arrayShiftedLeft = shiftArrayLeft(array);
        System.out.println("Your array shifted to the left: " + Arrays.toString(arrayShiftedLeft));
    }

    private static int[] shiftArrayLeft(int[] array) {
        int[] shifted = new int[array.length];
        int a = 2;
        for (int i = 0; i < shifted.length; i++) {
            shifted[i] = array[(i + a) % array.length];
        }
        return shifted;
    }

    private static int[] shiftArrayRight(int[] array) {
        int[] shifted = new int[array.length];
        int a = 2;
        for (int i = 0; i < shifted.length; i++) {
            shifted[i] = array[(i - a + array.length) % array.length];
        }
        return shifted;
    }
}
