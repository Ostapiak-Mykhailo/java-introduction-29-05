package com.hillel.homework.lesson15.extraHomeTask;

/*Написать три интерфейса Flyable, Runnable, Swimmable с методами fly(), run(), swim().
Создать класс Human, который будет имплементировать необходимые интерфейсы. Создать еще 2 класса, которые
будут имплементировать указанные интерфейсы (Duck, Ship). Написать программу, которая будет по вводу
пользователя определять какой экземпляр класса создавать и какие методы у него вызвать в зависимости от того
какие интерфейсы они имплементируют*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProgramController {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input;
        List<Object> objects = new ArrayList<>();
        createObjectsFromInput(objects);
        makeObjectsPerform(objects);
    }

    private static Object createObjectFromInput(String itemName) {
        return switch (itemName) {
            case "human" -> new Human();
            case "ship" -> new Ship();
            case "duck" -> new Duck();
            default -> throw new IllegalArgumentException("Unknown object:( Please try again");
        };
    }

    private static void createObjectsFromInput(List<Object> objects) throws IOException {
        System.out.println("Input names of objects you want to create: human, ship or duck. Type `stop` when you finish");
        String input;
        while (!(input = READER.readLine()).equals("stop")) {
            objects.add(createObjectFromInput(input));
        }
    }

    private static void makeObjectsPerform(List<Object> objects) {
        for (Object obj : objects) {
            if (obj instanceof Flyable) {
                ((Flyable) obj).fly();
            }
            if (obj instanceof Runnable) {
                ((Runnable) obj).run();
            }
            if (obj instanceof Swimmable) {
                ((Swimmable) obj).swim();
            }
        }
    }
}
