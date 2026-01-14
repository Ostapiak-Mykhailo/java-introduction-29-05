package com.hillel.homework.lesson15.homeTask;

import java.util.Scanner;

public class Controller {

    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter degrees Celsius. Then type `k` if you want to convert it into Kelvin or type `f`" +
                " if you want to convert into Fahrenheit");
        int degree = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        printMessage(input, degree);

    }

    private static void printMessage(String input, int degree) {
        Converter converter = getConverter(input);
        int result = converter.convert(degree);
        System.out.println("Result: " + result + (input.equals("k") ? " °K" : " °F"));
    }

    private static Converter getConverter(String input) {
        switch (input) {
            case "k":
                return new Kelvin();
            case "f":
                return new Fahrenheit();
            default:
                throw new IllegalArgumentException("Unknown degree system");
        }
    }
}
