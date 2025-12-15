package com.hillel.homework.homeworklesson14.coffeemachine;

public class Cappuccino extends Drink {
    private final int price = 60;

    public Cappuccino() {
        super();
    }

    @Override
    public void prepareDrink() {
        System.out.println("Your cappuccino is being prepared");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
