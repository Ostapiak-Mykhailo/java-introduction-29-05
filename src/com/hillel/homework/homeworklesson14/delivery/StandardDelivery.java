package com.hillel.homework.homeworklesson14.delivery;

public class StandardDelivery extends Delivery {

    public StandardDelivery(int weight) {
        super(weight);
        super.calculatePrice();
    }

    @Override
    protected void printMessage() {
        System.out.println("The price for standard delivery is " + price + " UAH");
    }
}
