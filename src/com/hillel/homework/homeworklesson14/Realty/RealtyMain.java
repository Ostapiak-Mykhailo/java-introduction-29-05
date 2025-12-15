package com.hillel.homework.homeworklesson14.Realty;

public class RealtyMain {

    public static void main(String[] args) {

        Realty flat = new ResidentialRealty(55);
        Realty store = new CommercialRealty(115, 28000);
        Realty production = new IndustrialRealty(600);
        flat.printMessage();
        store.printMessage();
        production.printMessage();

    }
}
