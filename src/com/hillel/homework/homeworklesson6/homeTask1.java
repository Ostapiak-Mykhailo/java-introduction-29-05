package com.hillel.homework.homeworklesson6;

public class homeTask1 {
    public static void main(String[] args) {

        double random = Math.random();
        int r1 = (int)(Math.random() * 100);
        int r2 = (int)(Math.random() * 100);
        int r3 = (int)(Math.random() * 100);
        System.out.println("Рандомні числа: " +  r1 +" "+ r2 +" "+ r3);


        if (r1 < r2 && r1 < r3){
            System.out.println("Мінімальне число: " + r1);
        } else if (r2 < r1 && r2 < r3){
            System.out.println("Мінімальне число: " + r2);
        }else {
            System.out.println("Мінімальне число: " + r3);
        }
    }
}