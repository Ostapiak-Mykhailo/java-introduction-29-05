package com.hillel.homework.homeworklesson14.Realty;

public class CommercialRealty extends Realty {

    private final double incomeTax = 0.35;
    private int income;

    public CommercialRealty(int area, int income) {
        super(area);
        this.income = income;
        calculateTax();
    }

    @Override
    public void calculateTax() {
        super.calculateTax();
        if (income < 100) {
            super.calculateTax();
        } else if (income > 100) {
            tax = tax + (int) (income * incomeTax);
        }
    }
}
