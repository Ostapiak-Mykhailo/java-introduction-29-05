package com.hillel.homework.homeworklesson11.Rectangle;

/*Завдання:
Напиши клас, який описує прямокутник з полями width і height.
Методи:
getArea(),
getPerimeter().*/

public class Rectangle {

    int width;
    int height;

    public int getArea() {
        return width * height;

    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

}
