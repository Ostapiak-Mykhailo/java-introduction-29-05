package com.hillel.homework.lesson15.homeTask;

public class Fahrenheit implements Converter{

    @Override
    public int convert(int input) {
        return (int) ( input * (9.0 / 5) + 32);
    }
}
