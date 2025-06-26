package com.hillel.homework.homeworklesson4;

public class hometask1 {
    public static void main(String[] args) {
        printAirInfo("Jet,", "F-22 Raptor,");
        printAirInfo("Airliner,", "Aerobus 737,", 120);
        printAirInfo("Airliner,", "Boeing 777,", 180, 28);

    }

    public static void printAirInfo(String type, String model) {
        System.out.println("Тип літака: " + type + " Модель: " + model);
    }

    public static void printAirInfo(String type, String model, int economyClassSeats) {
        System.out.println("Тип літака: " + type + " Модель: " + model + " К-сть місць економ класу: "
                + economyClassSeats);
    }

    public static void printAirInfo(String type, String model, int economyClassSeats, int firstClassSeats) {
        System.out.println("Тип літака: " + type + " Модель: " + model + " К-сть місць економ класу: "
                + economyClassSeats + ", К-сть місць першого класу: " + firstClassSeats);

    }
}

