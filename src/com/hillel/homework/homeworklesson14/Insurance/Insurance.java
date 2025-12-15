package com.hillel.homework.homeworklesson14.Insurance;

public class Insurance {

    protected final int priceCar;
    protected final double basicCoef = 0.02;
    protected int insurancePrice;

    public Insurance(int priceCar) {
        this.priceCar = priceCar;
    }

    public void calculateInsurancePrice() {
        insurancePrice = (int) (priceCar * basicCoef);
    }

    protected void printMessage() {
        System.out.println("Your car insurance will cost " + insurancePrice + " UAH");
    }
}
