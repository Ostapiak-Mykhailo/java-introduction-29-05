package com.hillel.homework.homeworklesson14.realty;

public class CommercialRealty extends Realty {

    private final double incomeTax = 0.35;
    private double income;

    public CommercialRealty(int area, int income) {
        super(area);
        this.income = income;
        calculateTax();
    }

    @Override
    protected void calculateTax() {
        super.calculateTax();
        if (income < 100) {
            super.calculateTax();
        } else if (income > 100) {
            tax = tax + (int) (income * incomeTax);
        }
    }

    @Override
    protected void printMessage() {
        System.out.println("The tax for commercial facility is: " + tax + " UAH");
    }
}
