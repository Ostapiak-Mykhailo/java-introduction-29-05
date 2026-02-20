package com.hillel.homework.homeworklesson14.coffeemachine;

public class Latte extends Drink {
    private final int price = 45;

    public Latte() {
        super();
    }

    @Override
    public void prepareDrink() {
        System.out.println("Your latte is being prepared");
    }

}
