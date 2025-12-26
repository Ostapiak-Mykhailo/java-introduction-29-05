package com.hillel.homework.lesson15.HomeTask;

public class Fahrenheit implements Converter{

    @Override
    public int convert(int input) {
        return (int) ((double) input * (9.0 / 5) + 32);
    }
}
