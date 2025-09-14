package com.hillel.classwork.lesson7;

public class DoWhile {

    public static void main(String[] args) throws InterruptedException {

        int i = 0;
        int bomb = 10;
        do {
            System.out.println("I = " + i);
            i++;
        }
        while (i <= 10);

        do {
            System.out.println("До вибуху бомби залишилось " + bomb + " сек");
            Thread.sleep(1000);
            bomb--;

            if(bomb == 5){
                break;
            }
        } while (bomb >= 1);
        if(bomb == 0) {
            System.out.println("BOOOOOOM");
        } else {
            System.out.println("Бімба знешкоджена");
        }
        }
    }
