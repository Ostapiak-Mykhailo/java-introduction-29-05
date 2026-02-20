package com.hillel.homework.homeworklesson14.delivery;

public class ExpressDelivery extends Delivery {

    private final double speedCoef = 1.8;

    public ExpressDelivery(int weight) {
        super(weight);
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        price = price * speedCoef;
    }

    @Override
    protected void printMessage() {
        System.out.println("The price for express delivery is " + price + " UAH");
    }
}
