package com.hillel.homework.homeworklesson9;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lottery = getLotteryNumbers(7);
        int[] player = getPlayerNumbers(scanner, 7);
        sortArrays(lottery, player);
        compareArrays(lottery, player);
    }

    public static int[] getLotteryNumbers(int size) {
        int[] random = new int[size];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 10);
        }
        return random;
    }

    public static int[] getPlayerNumbers(Scanner scanner, int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void sortArrays(int[] lottery, int[] player) {
        Arrays.sort(lottery);
        Arrays.sort(player);
    }

    public static void compareArrays(int[] lottery, int[] player) {
        int index;
        int number = 0;
        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == player[i]) {
                index = i;
                number++;
                System.out.println("matched " + index + " element");
            }
        }
        System.out.println("The lottery numbers are:\n" + Arrays.toString(lottery));
        System.out.println("Your numbers are:\n" + Arrays.toString(player));
        System.out.println(number + " Arrays elements matched");
    }
}
