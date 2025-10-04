package com.hillel.homework.homeworklesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeTask3 {

    static final BufferedReader READ = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a string:");
        String string = (READ.readLine());
        string = string.toLowerCase();
        string = string.replaceAll("\\s+", "");
        char[] chars = string.toCharArray();
        char[] reversed = reverseString(chars);

        System.out.println(reversed);
        determineIfPalindrome(chars, reversed);
    }

    public static char[] reverseString(char[] chars) {
        char[] rev = new char[chars.length];
        int index = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            rev[index] = chars[i];
            index++;
        }
        return rev;
    }

    public static void determineIfPalindrome(char[] chars, char[] reversed) {
        if (Arrays.equals(chars, reversed)) {
            System.out.println("Your string is a palindrome :)");
        } else {
            System.out.println("Your string is NOT a palindrome :(");
        }
    }
}
