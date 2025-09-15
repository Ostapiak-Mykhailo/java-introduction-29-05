package com.hillel.homework.homeworklesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3For {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Скільки машин я маю помити?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       int carsNumber = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= carsNumber; i++){
            soapCar(i);
            washCar(i);
            dryCar(i);
            System.out.println("Ну я молодець. Треба просити премію))");
        }
    }
    public static void soapCar(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Намилюю машину " + i);
    }
    public static void washCar(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Мию машину " + i);
    }
    public static void dryCar(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Висушую машину " + i);
    }
}
