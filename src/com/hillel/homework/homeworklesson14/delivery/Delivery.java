package com.hillel.homework.homeworklesson14.delivery;

public class Delivery {

    private final double weight;
    private final int basicTariff = 12;
    protected double price;

    public Delivery(int weight) {
        this.weight = weight;
    }

    public void calculatePrice() {
        price = weight * basicTariff;
    }

    protected void printMessage() {
        System.out.println("Your delivery cost " + price + " UAH");
    }
}
