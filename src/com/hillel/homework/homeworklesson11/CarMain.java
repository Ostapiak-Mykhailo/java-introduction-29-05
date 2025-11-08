package com.hillel.homework.homeworklesson11;

public class CarMain {

    public static void main(String[] args) {

        Car tetiana = new Car();
        tetiana.brand = "Renault";
        tetiana.model = "Kadjar";
        tetiana.year = 2020;
        tetiana.speed = 50;

        Car anna = new Car();
        anna.brand = "Range Rover";
        anna.model = "Evoque";
        anna.year = 2023;
        anna.speed = 0;

        Car mykhailo = new Car();
        mykhailo.brand = "Wolksvagen";
        mykhailo.model = "Golf";
        mykhailo.year = 2007;
        mykhailo.speed = 120;

        tetiana.accelerate(20);
        tetiana.brake(15);

        anna.accelerate(25);
        anna.brake(35);

        mykhailo.accelerate(40);
        mykhailo.brake(75);

        tetiana.displayInfo();
        anna.displayInfo();
        mykhailo.displayInfo();
    }
}
