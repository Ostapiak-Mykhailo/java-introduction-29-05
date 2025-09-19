package com.hillel.homework.homeworklesson7;

import java.util.Scanner;

public class ExtraHomeTask2 {
    /* Напишіть програму, яка:
    Загадує випадкове ціле число в діапазоні від 1 до 100.
    Користувач повинен вгадати це число, вводячи свої варіанти.
    Після кожної спроби програма підказує: "Більше", якщо загадане число більше за введене, або "Менше", якщо менше.
    Цикл триває, доки користувач не вгадає число.
     */
    public static void main(String[] args) {
        printMessage();
        Scanner scanner = new Scanner(System.in);
        int random = getRandom();
        int userNumber = getUserNumber(scanner);
        checkNumber(userNumber, random, scanner);
        printCongratulations();

    }
    public static void printMessage(){
        System.out.println("The computer has chosen a number from 1 to 100. Try to guess it");
    }

    public static int getRandom() {
        int random = (int) (Math.random() * 101);
        return random;
    }

    public static int getUserNumber(Scanner scanner) {
        return scanner.nextInt();
    }

    public static void checkNumber(int userNumber, int random, Scanner scanner) {
        while (userNumber != random) {
            if (userNumber > random) {
                System.out.println("Your number is bigger than random is");
                userNumber = getUserNumber(scanner);

            } else if (userNumber < random) {
                System.out.println("Your number is lower than random is");
                userNumber = getUserNumber(scanner);
            }
        }
    }
    public static void printCongratulations(){
        System.out.println("You guessed the number. My congratulations!!!!");
    }
}
