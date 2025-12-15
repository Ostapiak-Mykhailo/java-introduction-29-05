package com.hillel.homework.homeworklesson14.Delivery;

public class Delivery {

    private final int weight;
    private final int basicTariff = 12;
    protected int price;

    public Delivery(int weight) {
        this.weight = weight;
    }

    public void calculatePrice() {
        price = weight * basicTariff;
    }

    public void printMessage() {
        System.out.println("Your delivery cost " + price + " UAH");
    }
}
