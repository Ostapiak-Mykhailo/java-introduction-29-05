package com.hillel.classwork.lesson7;

public class WhileDec {

    public static void main(String[] args) {

        for (int i = 100; i >= 0; i--) {
            if (i % 4 == 0 || i % 5 == 0) {
                System.out.println("I = " + i);
            }
        }
    }
}
