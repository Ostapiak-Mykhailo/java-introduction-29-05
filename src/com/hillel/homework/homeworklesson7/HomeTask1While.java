package com.hillel.homework.homeworklesson7;

import java.util.Scanner;

public class HomeTask1While {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Відгадайте число від 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int random = getRandom();
        int userNumber = getUserNumber(scanner);
        checkNumber(random, userNumber, scanner);
    }
    public static int getRandom(){
        int random = (int)( Math.random() * 11);
        return random;
    }
    public static int getUserNumber(Scanner scanner){
        int userNumber = scanner.nextInt();
        return userNumber;
    }
    public static void checkNumber(int random, int userNumber, Scanner scanner) throws InterruptedException {
        while (random != userNumber){
            for (int timer = 3; timer > 0; timer--){
                System.out.println(timer);
                Thread.sleep(1000);
            }
                System.out.println(":( Ви не вгадали. Спробуйте знову ");
                userNumber = getUserNumber(scanner);
            }
        System.out.println(":) Ви вгадали. Відкорковуєм шампанське");
        }
    }