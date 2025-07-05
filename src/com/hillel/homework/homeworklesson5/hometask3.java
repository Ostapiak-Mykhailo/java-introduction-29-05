package com.hillel.homework.homeworklesson5;

public class hometask3 {
    public static void main(String[] args) {
        // Задача із презентації "Гра на гроші"
        DetermineGamersPoint(90);

    }
    public static void DetermineGamersPoint (int gamerPoint){
        if (gamerPoint > 1000) {
            System.out.println("Видати ігроку 50000$");
        } else if (gamerPoint >= 500 && gamerPoint <= 1000){
            System.out.println("Видати ігроку 20000$");
        } else if (gamerPoint < 500 && gamerPoint >= 100){
            System.out.println("Видати ігроку 10000$");
        } else {
            System.out.println("Не видавати гроші");
        }

    }
}
