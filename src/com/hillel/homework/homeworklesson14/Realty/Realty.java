package com.hillel.homework.homeworklesson14.Realty;

public class Realty {

    private final int area;
    int tax;
    final int taxK = 3;

    public Realty(int area) {
        this.area = area;
    }

    public void calculateTax() {
        tax = area * taxK;
    }

    protected void printMessage() {
        System.out.println("This object paid taxes of " + tax + " UAH");
    }
}
