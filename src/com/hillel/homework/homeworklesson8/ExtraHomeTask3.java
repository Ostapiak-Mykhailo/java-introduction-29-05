package com.hillel.homework.homeworklesson8;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraHomeTask3 {
    /*Створити масив
     1) Знайти суму всіх елементів у масиві.
     2)Обчислити середнє арифметичне чисел у масиві.
     3)Порахувати, скільки в масиві парних та непарних чисел.
     4)Створити метод, який розвертає масив без використання додаткових бібліотек.
     5) Знайти найбільший і найменший елемент масиву.*/

    public static void main(String[] args) {

        System.out.println("Please enter 10 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = getArray(scanner, 10);
        getAverage(numbers);
        determineEven(numbers);
        getMaxAndMin(numbers);
        reverseArray(numbers);

    }

    public static int[] getArray(Scanner scanner, int size) {
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }
        return num;
    }

    public static void getAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        int average = sum / numbers.length;
        System.out.println("The sum of your array elements is: " + sum);
        System.out.println("The average value of your array is: " + average);
    }

    public static void determineEven(int[] numbers) {
        int numberEven = 0;
        int numberOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numberEven++;
            } else
                numberOdd++;
        }
        int[] even = new int[numberEven];
        int[] odd = new int[numberOdd];
        int indexEven = 0;
        int indexOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[indexEven] = numbers[i];
                indexEven++;
            } else {
                odd[indexOdd] = numbers[i];
                indexOdd++;
            }
        }
        if (indexEven >= 1) {
            System.out.println("Your array contains " + indexEven + " even numbers: " + Arrays.toString(even));
        } else
            System.out.println("Your array does not contain any even numbers");
        if (indexOdd >= 1) {
            System.out.println("Your array contains " + indexOdd + " odd numbers: " + Arrays.toString(odd));
        } else
            System.out.println("Your array does not contain any odd numbers");
    }

    public static void reverseArray(int[] numbers) {
        int[] rev = new int[numbers.length];
        int index = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            rev[index] = numbers[i];
            index++;
        }
        System.out.println("Your array is reversed: " + Arrays.toString(rev));
    }

    public static void getMaxAndMin(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The largest element of your array is: " + max);
        System.out.println("The smallest element of your array is: " + min);
    }
}
