package com.hillel.homework.homeworklesson6;

import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        String operation = scanner.next();
        int number2 = scanner.nextInt();
        System.out.println("operation: " + operation);
        doOperation(number1, operation, number2);
    }

    public static void doOperation(int number1, String operation, int number2) {
        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("unknown operation");
        }
    }
}