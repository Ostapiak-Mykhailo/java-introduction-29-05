package com.hillel.homework.homeworklesson8;

import java.util.Arrays;
import java.util.Scanner;

public class ExtraHomeTask1 {
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
        int index = 0;
        do {
            for (int i = 0; i < password.length; i++) {
                guess[i] = (int) (Math.random() * 10);
            }
            index++;

        } while (!Arrays.equals(password, guess));

        System.out.println("The computer guessed your password in " + index + " tries");
    }
}