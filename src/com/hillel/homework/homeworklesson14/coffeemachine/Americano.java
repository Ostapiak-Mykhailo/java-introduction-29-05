package com.hillel.homework.homeworklesson14.coffeemachine;

public class Americano extends Drink {
    private final int price = 40;

    public Americano() {
        super();
    }

    @Override
    public void prepareDrink() {
        System.out.println("Your americano is being prepared");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
