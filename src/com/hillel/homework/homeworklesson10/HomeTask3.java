package com.hillel.homework.homeworklesson10;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = scanner.nextInt();
        System.out.print("factorial " + n + " = ");
        System.out.println(calculateFactorial(n));
    }

    public static long calculateFactorial(long n) {
        if (n < 0) {
            System.out.println("Please enter a positive number");
            return n;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
