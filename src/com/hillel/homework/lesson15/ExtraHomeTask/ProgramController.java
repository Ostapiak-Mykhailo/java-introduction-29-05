package com.hillel.homework.lesson15.ExtraHomeTask;

/*Написать три интерфейса Flyable, Runnable, Swimmable с методами fly(), run(), swim().
Создать класс Human, который будет имплементировать необходимые интерфейсы. Создать еще 2 класса, которые
будут имплементировать указанные интерфейсы (Duck, Ship). Написать программу, которая будет по вводу
пользователя определять какой экземпляр класса создавать и какие методы у него вызвать в зависимости от того
какие интерфейсы они имплементируют*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramController {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
        List<com.hillel.homework.lesson15.ExtraHomeTask.Object> objects = new ArrayList<>();
        createObjectsFromInput(objects);
        performActions(objects);
    }

    private static void performActions(List<com.hillel.homework.lesson15.ExtraHomeTask.Object> objects) {
        makeFlyablesFly(objects);
        makeRunnubleRun(objects);
        makeSwimmableSwim(objects);
    }

    private static com.hillel.homework.lesson15.ExtraHomeTask.Object createObjectFromInput(String itemName) {
        switch (itemName) {
            case "human":
                return new Human();
            case "ship":
                return new Ship();
            case "duck":
                return new Duck();
            default:
                throw new IllegalArgumentException("Unknown object:( Please try again");
        }
    }

    private static void createObjectsFromInput(List<com.hillel.homework.lesson15.ExtraHomeTask.Object> objects) {
        System.out.println("Input names of objects you want to create: human, ship or duck. Type `stop` when you finish");
        String input;
        while (!(input = scanner.nextLine()).equals("stop")) {
            objects.add(createObjectFromInput(input));
        }
    }

    private static void makeFlyablesFly(List<com.hillel.homework.lesson15.ExtraHomeTask.Object> objects) {
        for (com.hillel.homework.lesson15.ExtraHomeTask.Object object : objects) {
            if (object instanceof Flyable flyableItem) {
                flyableItem.fly();
            }
        }
    }

    private static void makeRunnubleRun(List<com.hillel.homework.lesson15.ExtraHomeTask.Object> objects) {
        for (com.hillel.homework.lesson15.ExtraHomeTask.Object object : objects) {
            if (object instanceof Runnable runnableItem) {
                runnableItem.run();
            }
        }
    }

    private static void makeSwimmableSwim(List<com.hillel.homework.lesson15.ExtraHomeTask.Object> objects) {
        for (Object object : objects) {
            if (object instanceof Swimmable swimmableItem) {
                swimmableItem.swim();
            }
        }
    }
}
