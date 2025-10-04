package com.hillel.homework.homeworklesson8;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraHomeTask1Variant3 {
    /*Реалізувати механізм підбору чотирицифрового коду.
      Вивести в консоль кількість ітерацій.
      Наприклад, ми маємо pin = 9407, за скільки ітерацій програма підбере код.*/

    public static void main(String[] args) {

        System.out.println("Enter a four-digit password:");
        Scanner scanner = new Scanner(System.in);
        int[] password = getPassword(scanner, 4);
        guessPassword(password);
    }

    public static int[] getPassword(Scanner scanner, int size) {
        int[] pass = new int[size];
        for (int i = 0; i < pass.length; i++) {
            pass[i] = scanner.nextInt();
        }
        return pass;
    }

    public static void guessPassword(int[] password) {
        int[] guess = new int[4];
        int index0 = 0;
        for (int i = 0; i < 10; i++) {
            index0++;
            if (password[0] == i) {
                guess[0] = i;
                break;
            }
        }
        int index1 = 0;
        for (int i = 0; i < 10; i++) {
            index1++;
            if (password[1] == i) {
                guess[1] = i;
                break;
            }
        }
        int index2 = 0;
        for (int i = 0; i < 10; i++) {
            index2++;
            if (password[2] == i) {
                guess[2] = i;
                break;
            }
        }
        int index3 = 0;
        for (int i = 0; i < 10; i++) {
            index3++;
            if (password[3] == i) {
                guess[3] = i;
                break;
            }
        }
        int index = index0 + index1 + index2 + index3;
        if (Arrays.equals(password, guess)) {
            System.out.println("The computer guessed your password in " + index + " tries");
            return;
        }
    }
}
