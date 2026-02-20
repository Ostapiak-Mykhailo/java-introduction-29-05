package com.hillel.homework.homeworklesson14.realty;

public class IndustrialRealty extends Realty {

    public IndustrialRealty(int area) {
        super(area);
        calculateTax();
    }

    @Override
    protected void calculateTax() {
        super.calculateTax();
    }

    @Override
    protected void printMessage() {
        System.out.println("The tax for industrial facility is: " + tax + " UAH");
    }
}
