package com.hillel.homework.homeworklesson14.coffeemachine;

import java.util.List;
import java.util.Scanner;

public class DrinkController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine(scanner);

        List<Drink> drinks = coffeeMachine.getListOfDrinks();

        coffeeMachine.prepareDrinks(drinks);
        coffeeMachine.printCheck(drinks);
    }
}
