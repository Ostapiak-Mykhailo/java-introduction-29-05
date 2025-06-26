package com.hillel.classwork.lesson3;

public class JavaMath {

    public static void main(String[] args) {

        System.out.println(Math. PI);
        System.out.println(Math. sqrt(Math. PI));
        System.out.println(Math. sqrt(9));
        System.out.println(Math. pow(2, 16));

        float a = 44.5F;
        System.out.println(Math.round(a));

        double random = Math.random();
        System.out.println("random  " + random);

        int max = 50;
        int intrandom =  (int) (random * 100);
        System.out.println("random int  " + intrandom);

        int r = (int) (-50 + random * 100);
        System.out.println("random in range " + r);


    }
}