package com.hillel.homework.homeworklesson14.Delivery;

public class InternationalDelivery extends Delivery{

    private final double currencyCoef = 1.5;
    private final String destinationCountry;
    private final int customs = 300;

    public InternationalDelivery(int weight, String destinationCountry){
        super(weight);
        this.destinationCountry = destinationCountry;
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        if (destinationCountry.equals("USA")){
        price = (int) ((double) price * currencyCoef) + customs;
    } else {
            price = (int) ((double) price * currencyCoef);
        }
    }
}
