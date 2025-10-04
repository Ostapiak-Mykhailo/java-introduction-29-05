package com.hillel.homework.homeworklesson8;


public class ExtraHomeTask2 {
    /*Используя цикл for вывести на экран квадрат из * 10 на 10.
    Можно использовать только один символ ‘*’
    Используя цикл for вывести на экран прямоугольный треугольник из # со сторонами 10 и 10.*/

    public static void main(String[] args) {

        String[] asterisk = fillFigure(10, "* ");
        String[] hash = fillFigure(10, "# ");
        printSquare(asterisk);
        printTriangle(hash);
    }

    public static String[] fillFigure(int size, String string) {
        String[] str = new String[size];
        for (int i = 0; i < str.length; i++) {
            str[i] = string;
        }
        return str;
    }

    public static void printSquare(String[] asterisk) {
        for (int i = 0; i < asterisk.length; i++) {
            for (int j = 0; j < asterisk.length; j++) {
                System.out.print(asterisk[j]);
            }
            System.out.println();
        }
    }

    public static void printTriangle(String[] hash) {

        for (int i = 0; i < hash.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(hash[j]);
            }
            System.out.println();
        }
    }
}
