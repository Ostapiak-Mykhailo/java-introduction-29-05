package com.hillel.homework.homeworklesson14.Delivery;

public class ExpressDelivery extends Delivery{

    private final double speedCoef = 1.8;

    public ExpressDelivery(int weight) {
        super(weight);
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        price = (int) ((double) price * speedCoef);
    }
}
