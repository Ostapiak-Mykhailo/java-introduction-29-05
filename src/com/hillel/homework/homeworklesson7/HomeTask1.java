package com.hillel.homework.homeworklesson7;

import java.util.Scanner;

public class HomeTask1 {

    public static void main(String[] args) throws InterruptedException {
        int random = (int)( Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Відгадайте чило");
        int i = scanner.nextInt();
        while (i != random){
            int t = 3;
           do {
               System.out.println(t);
               Thread.sleep(1000);
               t--;
               if(t <= 1){
                   continue;
               }
           } while (t >=1);
            System.out.println("Ви не вгадали. Спробуйте знову");
             i = scanner.nextInt();
        }
        int t = 3;
        do {
            System.out.println(t);
            Thread.sleep(1000);
            t--;
            if(t <= 1){
                continue;
            }
        } while (t >= 1);
        System.out.println("Вітаємо ви вгадали");
    }
}

