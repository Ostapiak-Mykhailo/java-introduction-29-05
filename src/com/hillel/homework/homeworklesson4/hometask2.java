package com.hillel.homework.homeworklesson4;

public class hometask2 {

    public static void main(String[] args) {
        calculationCats(50, 8, 3, 30);
        calculationDogs(50, 24, 3, 30);
        calculationMoneyAMonth (2,8, 24,3, 30);
    }

    public static void calculationCats(int portion, int catNumber, int eatTimesADay, int daysInMonth) {
        int foodAMonth = (int) portion * catNumber * eatTimesADay * daysInMonth;
        System.out.println("коти з'їдають " + foodAMonth + " грам корму в місяць");
    }

    public static void calculationDogs(int portion, int dogNumber, int eatTimesADay, int daysInMonth) {
        int foodAMonth = (int) portion * dogNumber * eatTimesADay * daysInMonth;
        System.out.println("собаки з'їдають " + foodAMonth + " грам корму в місяць");

    }

    public static void calculationMoneyAMonth(int costPortion, int catNumber, int dogNumber, int eatTimesADay,
                                              int daysInMonth) {
        int catCost = (int) costPortion * catNumber * eatTimesADay * daysInMonth;
        int dogCost = (int) costPortion * dogNumber * eatTimesADay * daysInMonth;
        int animalShelter = (int) catCost + dogCost;
        System.out.println("Потрібно " + animalShelter + " доларів в місяць на утримання притулку");

    }
}
