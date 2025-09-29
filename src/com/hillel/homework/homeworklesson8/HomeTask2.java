package com.hillel.homework.homeworklesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeTask2 {

    static final BufferedReader READ = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please enter 20 numbers:");
        int[] myArray = fillArray(20);
        int[] partOfArray1 = divideArray(myArray, 0, 10);
        int[] partOfArray2 = divideArray(myArray, 10, 20);
        printArrays(myArray, partOfArray1, partOfArray2);
    }
    public static int[] fillArray(int size) throws IOException {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(READ.readLine());
        }
        return array;
    }
    public static int[] divideArray(int[] myArray, int start, int end){
        return Arrays.copyOfRange(myArray, start, end);
    }
    public static void printArrays(int[] myArray, int[] partOfArray1, int[] partOfArray2){
        System.out.println("Your array is: " + Arrays.toString(myArray));
        System.out.println("Part 1 of your array: " + Arrays.toString(partOfArray1));
        System.out.println("Part 2 of your array: " + Arrays.toString(partOfArray2));
    }
}
