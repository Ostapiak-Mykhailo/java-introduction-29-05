package com.hillel.classwork.lesson3;

public class Range {
    public static void main(String[] args) {
// a - рандом від 30 до 50
        double random = Math.random();
        int a = (int) (random * (50-30) +30);
        System.out.println(a);
        // b - рандом від -4 до 9
        int b = (int) (random * (9 - (-4)) + (-4));
        System.out.println(b);
        // c - рандом від -256 до 854
        int c = (int) (random * (854 - (-256)) + (-256));
        System.out.println(c);
    }
}
