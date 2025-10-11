package com.hillel.homework.homeworklesson9;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeNumber {
    //    Given an integer x, return true if x is a palindrome, and false otherwise.
    public static void main(String[] args) {

        System.out.println("Please enter any number you want:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char[] chars = getArray(number);
        char[] reversed = getArrayReversed(chars);
        determinePalindrome(chars, reversed);
    }

    public static char[] getArray(int number) {
        String str = String.valueOf(number);
        char[] ch = str.toCharArray();
        return ch;
    }

    public static char[] getArrayReversed(char[] chars) {
        char[] rev = new char[chars.length];
        int index = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            rev[index] = chars[i];
            index++;
        }
        return rev;
    }

    public static void determinePalindrome(char[] chars, char[] reversed) {
        if (Arrays.equals(chars, reversed)) {
            System.out.println("Your number is a palindrome:)");
        } else {
            System.out.println("Your number is not a palindrome:(");
        }
    }
}
