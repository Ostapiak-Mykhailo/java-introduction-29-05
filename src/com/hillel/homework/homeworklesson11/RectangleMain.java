package com.hillel.homework.homeworklesson11;

public class RectangleMain {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.height = 12;
        rec.width = 10;
        System.out.println("The area of the rectangle is: " + rec.getArea());
        System.out.println("The perimeter of the rectangle is: " + rec.getPerimeter());
    }
}
