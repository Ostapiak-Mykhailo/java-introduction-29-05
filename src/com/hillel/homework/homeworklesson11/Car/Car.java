package com.hillel.homework.homeworklesson11.Car;

/*Завдання:
Створи клас Car, який має поля:
brand (марка),
model,
year,
speed.

Додай методи:
accelerate(int value) — збільшує швидкість,
brake(int value) — зменшує швидкість (але не нижче 0),
displayInfo() — виводить усю інформацію про авто.*/

public class Car {

    int year;
    int speed;
    String brand;
    String model;

    public void accelerate(int value){
        speed += value;
    }

    public void brake(int value){
        speed -= value;
        if (speed - value < 0){
            speed = 0;
        }
    }

    public void  displayInfo(){
        System.out.println("Car info:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Production year: " + year);
        System.out.println("Current speed: " + speed + "km/h");
        System.out.println();
    }
}
