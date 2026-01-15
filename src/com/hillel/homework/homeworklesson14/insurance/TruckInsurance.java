package com.hillel.homework.homeworklesson14.insurance;

public class TruckInsurance extends Insurance {

    private final double loadCapacity;
    private final double fine = 0.1;

    public TruckInsurance(int priceCar, double loadCapacity) {
        super(priceCar);
        this.loadCapacity = loadCapacity;
        calculateAndSetInsurancePrice();
    }

    @Override
    public void calculateAndSetInsurancePrice() {
        super.calculateAndSetInsurancePrice();
        if (loadCapacity <= 5) {
            super.calculateAndSetInsurancePrice();
        } else {
            insurancePrice = (int) ((priceCar * basicCoef) + (insurancePrice * fine));
        }
    }
}
