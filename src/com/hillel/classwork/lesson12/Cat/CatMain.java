package com.hillel.classwork.lesson12.Cat;

public class CatMain {

    public static void main(String[] args) {
        Cat cat = new Cat("Tommy", 4, 4, 5);
        Cat cat1 = new Cat("Sammy", 3, 4, 8);
        Cat cat2 = new Cat("Maisy", 3, 5, 3);

        cat.fight(cat1);
        cat1.fight(cat2);
        cat.fight(cat2);
    }
}
