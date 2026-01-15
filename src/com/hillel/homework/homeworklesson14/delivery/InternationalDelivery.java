package com.hillel.homework.homeworklesson14.delivery;

public class InternationalDelivery extends Delivery {

    private final double currencyCoef = 1.5;
    private final String destinationCountry;
    private final int customs = 300;
    private final boolean needsCustoms;

    public InternationalDelivery(int weight, String destinationCountry) {
        super(weight);
        this.destinationCountry = destinationCountry;
        this.needsCustoms = destinationCountry.equals("USA");
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        if (needsCustoms) {
            price = (price * currencyCoef) + customs;
        } else {
            price = price * currencyCoef;
        }
    }

    @Override
    protected void printMessage() {
        if (needsCustoms){
            System.out.println("The price for delivery to the USA is " + price + " UAH");
        } else {
            System.out.println("The price for international delivery is " + price + " UAH");
        }
    }
}
