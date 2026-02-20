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

    public void prepareDrinks(List<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.prepareDrink();
        }
    }

    public void printCheck(List<Drink> drinks) {
        int total = 0;
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        System.out.println("you ordered drinks worth " + total + " UAH");
    }
}
