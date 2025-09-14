package com.hillel.classwork.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileSum {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int sum = 0;
        String input = READER.readLine();
        while (!input.equals("sum")){
            sum += Integer.parseInt(input);
            input = READER.readLine();
        }
        System.out.println("Sum: " + sum);
    }
}
