package com.hillel.homework.homeworklesson14.Insurance;

public class Truck extends Insurance {

    private final double loadCapacity;

    public Truck(int priceCar, double loadCapacity) {
        super(priceCar);
        this.loadCapacity = loadCapacity;
        calculateInsurancePrice();
    }

    @Override
    public void calculateInsurancePrice() {
        super.calculateInsurancePrice();
        double bonus = 0.1;
        if (loadCapacity <= 5) {
            super.calculateInsurancePrice();
        } else {
            insurancePrice = (int) ((priceCar * basicCoef) + (insurancePrice * bonus));
        }
    }
}
