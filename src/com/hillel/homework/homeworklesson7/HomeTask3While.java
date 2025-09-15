package com.hillel.homework.homeworklesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3While {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Цікаво скільки машин я помию сьогодні?????");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int carNumber = Integer.parseInt(bufferedReader.readLine());
        int i = 1;
        while (i <= carNumber){
            soapCar(i);
            washCar(i);
            dryCar(i);
            i++;
            System.out.println("Ну я молодець. Ну де ж моя премія??))");
        }
    }
    public static void soapCar(int i) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Намилюю машину " + i);
    }
    public static void washCar(int i ) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Мию машину " + i);
    }
    public static void dryCar(int i ) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Висушую машину " + i);
    }
}
