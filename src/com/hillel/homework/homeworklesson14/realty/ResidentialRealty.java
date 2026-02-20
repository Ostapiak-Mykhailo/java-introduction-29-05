package com.hillel.homework.homeworklesson14.realty;

public class ResidentialRealty extends Realty {

    public double subsidy = 0.15;

    public ResidentialRealty(int area) {
        super(area);
        calculateTax();
    }

    @Override
    protected void calculateTax() {
        super.calculateTax();
        tax = (tax - (tax * subsidy));
    }

    @Override
    protected void printMessage() {
        System.out.println("The tax for residental facility is: " + tax + " UAH");
    }
}
