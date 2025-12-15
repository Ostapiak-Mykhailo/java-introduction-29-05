package com.hillel.homework.homeworklesson14.coffeemachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine {
    private Scanner scanner;

    public CoffeeMachine(Scanner scanner) {
        this.scanner = scanner;
    }

    public void prepareDrinks(List<Drink> drinks){
        for (Drink drink: drinks){
            drink.prepareDrink();
        }
    }

    public List<Drink> getListOfDrinks() {
        List<Drink> drinks = new ArrayList<>();
        listOfDrinks();
        String choise = scanner.nextLine().toUpperCase();
        while (!choise.equals("STOP")) {
            DrinkType drink = DrinkType.valueOf(choise);
            switch (drink) {
                case AMERICANO:
                    Drink americano = new Americano();
                    drinks.add(americano);
                    break;
                case LATTE:
                    Drink latte = new Latte();
                    drinks.add(latte);
                    break;
                case CAPPUCCINO:
                    Drink cappuccino = new Cappuccino();
                    drinks.add(cappuccino);
                    break;
                case TEA:
                    Drink tea = new Tea();
                    drinks.add(tea);
                    break;
                default:
                    System.out.println("Unknown drink, please try again: ");
            }
            listOfDrinks();
            choise = scanner.nextLine().toUpperCase();
        }
        return drinks;
    }

    public void printCheck(List<Drink> drinks) {
        int total = 0;
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        System.out.println("you ordered drinks worth " + total + " UAH");
    }

    private void listOfDrinks(){
        System.out.println("Please, choose one drinks from list: " + Arrays.toString(DrinkType.values()));
    }
}
