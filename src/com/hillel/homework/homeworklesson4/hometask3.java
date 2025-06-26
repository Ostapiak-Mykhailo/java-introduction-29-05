package com.hillel.homework.homeworklesson4;

public class hometask3 {
    public static void main(String[] args) {
        calculateFuelConsumption(4.2, 50, 100);

    }
    public static void calculateFuelConsumption (double fuel, double distance, int calculatedDistance) {
        double FuelConsumption = (double) fuel / distance * calculatedDistance;
        System.out.println("Машина витрачає " + FuelConsumption+ " літрів пального на 100 км.");
    }
}
