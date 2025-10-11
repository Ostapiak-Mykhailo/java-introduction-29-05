package com.hillel.classwork.lesson9;

import java.util.Arrays;

import static com.hillel.classwork.lesson9.ArraySort.fill;

public class BinarySearch {

    public static void main(String[] args) {

        int numbers[] = {10, 5, 7, 3, 5, 9};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        int search = 9;
        System.out.println(Arrays.toString(numbers));
        search(numbers, 10);

//        int index = search(numbers, search);
        int index = binarySearch(numbers, search);

        if (index < 0) {
            System.out.println(search + " not found");
        } else {
            System.out.println(search + " found on index " + index);
        }
    }

    private static int search(int[] numbers, int search) {
        for (int i = 0; i < numbers.length; i++) {
            if (search == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] numbers, int search) {
        int index = -1;
        int low = 0;
        int hight = numbers.length - 1;


        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (numbers[mid] < search) {
                low = mid + 1;

            } else if (numbers[mid] > search) {
                hight = mid - 1;
            } else if (numbers[mid] == search) {
                index = mid;
                break;
            }
        }

        return index;
    }
}
