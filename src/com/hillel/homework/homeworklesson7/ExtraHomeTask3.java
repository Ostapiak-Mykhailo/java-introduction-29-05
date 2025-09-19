package com.hillel.homework.homeworklesson7;

import java.util.Scanner;

public class ExtraHomeTask3 {
    //Користувач вводить ціле число. Виведи всі його дільники.
    // Наприклад, для числа 12: 1, 2, 3, 4, 6, 12.
    public static void main(String[] args) {
        printMessage();
        Scanner scanner = new Scanner(System.in);
        int userNumber = getUserNumber(scanner);
        printResult(userNumber);
        findNumberDivisors(userNumber);
    }
    public static void printMessage(){
        System.out.println("Enter the number:");
    }
    public static int getUserNumber(Scanner scanner){
        return scanner.nextInt();
    }
    public static void findNumberDivisors(int userNumber){
        int i = 1;
        for (i = userNumber; i > 0; i--){
            if (userNumber % i == 0){
            System.out.println(i);
            }
        }
    }
    public static int printResult(int userNumber){
        System.out.println("Divisors for number " + userNumber + " are:");
        return userNumber;
    }
}
