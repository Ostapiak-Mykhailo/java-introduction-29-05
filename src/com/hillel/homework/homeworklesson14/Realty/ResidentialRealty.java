package com.hillel.homework.homeworklesson14.Realty;

public class ResidentialRealty extends Realty {

    public double subsidy = 0.15;

    public ResidentialRealty(int area) {
        super(area);
        calculateTax();
    }

    @Override
    public void calculateTax() {
        super.calculateTax();
        tax = (int) (tax - (tax * subsidy));
    }
}
