package com.hillel.homework.homeworklesson14.coffeemachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DrinkController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine(scanner);
        DrinkController drinkController = new DrinkController();

        List<Drink> drinks = drinkController.getListOfDrinks(scanner);

        coffeeMachine.prepareDrinks(drinks);
        coffeeMachine.printCheck(drinks);
    }

    public List<Drink> getListOfDrinks(Scanner scanner) {
        List<Drink> drinks = new ArrayList<>();
        printListOfDrinks();
        String choise = scanner.nextLine().toUpperCase();
        while (!choise.equals("STOP")) {
            DrinkType drinkType = DrinkType.valueOf(choise);
            switch (drinkType) {
                case AMERICANO -> drinks.add(new Americano());
                case LATTE -> drinks.add(new Latte());
                case CAPPUCCINO -> drinks.add(new Cappuccino());
                case TEA -> drinks.add(new Tea());
                default -> System.out.println("Unknown drink, please try again: ");
            }
            printListOfDrinks();
            choise = scanner.nextLine().toUpperCase();
        }
        return drinks;
    }

    private void printListOfDrinks() {
        System.out.println("Please, choose one drinks from list: " + Arrays.toString(DrinkType.values()));
    }
}
