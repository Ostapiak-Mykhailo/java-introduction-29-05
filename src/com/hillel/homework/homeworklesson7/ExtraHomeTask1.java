package com.hillel.homework.homeworklesson7;

import java.util.Scanner;

public class ExtraHomeTask1 {
    // Обчислити суму чисел від 1 до n, де n задає користувач.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = getUserNumber(scanner);
        int sum = calculateSum(userNumber);
        calculateSum(userNumber);
        printSum(userNumber, sum);
    }
    public static int getUserNumber(Scanner scanner){
        return scanner.nextInt();
    }

    public static int calculateSum(int userNumber) {
        int sum = 0;
        for (int i = 1; i <= userNumber; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printSum(int userNumber, int sum) {
        System.out.println("Сума чисел від 1 до " + userNumber + " дорівнює " + sum);
    }
}