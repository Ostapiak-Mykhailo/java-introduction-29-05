package com.hillel.homework.homeworklesson14.coffeemachine;

public class Tea extends Drink {
    private final int price = 20;

    public Tea() {
        super();
    }

    @Override
    public void prepareDrink() {
        System.out.println("Your tea is being prepared");
    }

}
