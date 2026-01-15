package com.hillel.homework.homeworklesson14.insurance;

public class ElectricCarInsurance extends Insurance {

    private final double bonus = 0.08;
    private final double fine = 0.05;
    private final int batteryPower;


    public ElectricCarInsurance(int priceCar, int batteryPower) {
        super(priceCar);
        this.batteryPower = batteryPower;
        calculateAndSetInsurancePrice();
    }

    @Override
    public void calculateAndSetInsurancePrice() {
        super.calculateAndSetInsurancePrice();
        insurancePrice = (int) ((priceCar * basicCoef) - ((priceCar * basicCoef) * bonus));
        if (batteryPower < 60) {
            insurancePrice = (int) (insurancePrice + (insurancePrice * fine));
        }
    }
}
