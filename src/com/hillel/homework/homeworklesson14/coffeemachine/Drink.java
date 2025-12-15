package com.hillel.homework.homeworklesson14.coffeemachine;

public class Drink {

    protected int price;

    public Drink() {
    }

    public void prepareDrink() {
        System.out.println("Your drink is being prepared");
    }

    public int getPrice() {
        return price;
    }
}
