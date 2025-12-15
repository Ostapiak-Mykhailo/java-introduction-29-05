package com.hillel.homework.homeworklesson14.Delivery;

public class StandardDelivery extends Delivery{


    public StandardDelivery(int weight) {
        super(weight);
        super.calculatePrice();
    }
}
