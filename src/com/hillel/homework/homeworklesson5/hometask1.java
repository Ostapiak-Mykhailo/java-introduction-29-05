package com.hillel.homework.homeworklesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hometask1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Math mark: ");
        int mathMark = Integer.parseInt(reader.readLine());
        System.out.println("Physics mark: ");
        int physicsMark = Integer.parseInt(reader.readLine());
        System.out.println("Chemistry mark: ");
        int chemistryMark = Integer.parseInt(reader.readLine());
        System.out.println("English mark: ");
        int englishMark = Integer.parseInt(reader.readLine());
        System.out.println("Java mark: ");
        int javaMark = Integer.parseInt(reader.readLine());

        double averageMark = (double) (mathMark + physicsMark + chemistryMark + englishMark + javaMark) / 5;
        System.out.println("Your average mark is " + averageMark);

        calculationScholarship (averageMark);
    }

    public static void calculationScholarship(double averageMark) {
        if (averageMark >= 10) {
            System.out.println("You will receive an increased scholarship");
        } else if (averageMark >= 8 && averageMark < 10) {
            System.out.println("You will receive a regular scholarship");
        } else {
            System.out.println("You will not receive a scholarship");
        }
    }
}
