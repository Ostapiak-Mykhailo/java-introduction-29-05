package com.hillel.homework.homeworklesson14.Insurance;

public class ElectricCar extends Insurance {

    private final double bonus = 0.08;
    private final double fine = 0.05;
    private final int batteryPower;


    public ElectricCar(int priceCar, int batteryPower) {
        super(priceCar);
        this.batteryPower = batteryPower;
        calculateInsurancePrice();
    }

    @Override
    public void calculateInsurancePrice() {
        super.calculateInsurancePrice();
        insurancePrice = (int) ((priceCar * basicCoef) - ((priceCar * basicCoef) * bonus));
        if (batteryPower < 60) {
            insurancePrice = (int) (insurancePrice + (insurancePrice * fine));
        }
    }
}
