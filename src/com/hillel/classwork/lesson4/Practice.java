package com.hillel.classwork.lesson4;

public class Practice {

    public static void main(String args[]) {
        System.out.println(sum (3, 8));
        System.out.println(sum (4.5, 2.8));
        System.out.println(sum (10, 11, 1));

    }
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }
}


