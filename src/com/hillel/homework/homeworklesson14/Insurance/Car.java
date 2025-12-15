package com.hillel.homework.homeworklesson14.Insurance;

public class Car extends Insurance {

    private final boolean anyAccinent;
    private final double bonus = 0.05;

    public Car(int priceCar, boolean anyAccinent) {
        super(priceCar);
        this.anyAccinent = anyAccinent;
        calculateInsurancePrice();
    }

    @Override
    public void calculateInsurancePrice() {
        super.calculateInsurancePrice();
        if (anyAccinent) {
            insurancePrice = (int) (priceCar * basicCoef);
        } else {
            insurancePrice = (int) ((priceCar * basicCoef) - ((priceCar * basicCoef) * bonus));
        }
    }
}
