package com.hillel.classwork.lesson4;

public class Methods {

    public static void main(String[] args) {
        printMessage();

        int number = generateRandom();
        System.out.println(number);

        int randomint = generateRandom(18, 50);
        System.out.println(randomint);

    }

    public static void printMessage() {
        System.out.println("message");

    }

    public static int generateRandom() {

        return (int) (Math.random() * 100);
    }

    public static int generateRandom(int min, int max) {

        return (int) (Math.random() * (max - min) + min);
    }

}
