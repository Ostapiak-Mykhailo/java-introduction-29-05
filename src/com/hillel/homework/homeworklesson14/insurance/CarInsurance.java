package com.hillel.homework.homeworklesson14.insurance;

public class CarInsurance extends Insurance {

    private final boolean anyAccinent;
    private final double bonus = 0.05;

    public CarInsurance(int priceCar, boolean anyAccinent) {
        super(priceCar);
        this.anyAccinent = anyAccinent;
        calculateAndSetInsurancePrice();
    }

    @Override
    public void calculateAndSetInsurancePrice() {
        super.calculateAndSetInsurancePrice();
        if (anyAccinent) {
            insurancePrice = (int) (priceCar * basicCoef);
        } else {
            insurancePrice = (int) ((priceCar * basicCoef) - ((priceCar * basicCoef) * bonus));
        }
    }
}
