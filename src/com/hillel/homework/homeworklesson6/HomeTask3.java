package com.hillel.homework.homeworklesson6;

import java.util.Scanner;

public class HomeTask3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Скільки яблук зібрали діти: ");
        int apples = scanner.nextInt();
        int bigJar = apples / 5;
        int middleJar = (apples % 5) / 3;
        int littleJar = ((apples % 5) % 3);
        System.out.println("Великих банок " + bigJar);
        System.out.println("Середніх банок " + middleJar);
        System.out.println("Маленьких банок " + littleJar);
    }
}

