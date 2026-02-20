package com.hillel.classwork.lesson13;

import java.util.ArrayList;
import java.util.List;

import static com.hillel.classwork.lesson13.Animal.DEFAULT_COLOR;

public class PetStore {

    public static void main(String[] args) {

        Animal cat = new Cat(DEFAULT_COLOR, "siam");

        Animal dog = new Dog();
        Animal cat1 = new Cat("black and white", "British shorthair");


        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat1);
        animals.add(new Rat("multi"));

        handleAnimals(animals);
    }

    private static void handleAnimals(List<Animal> animals) {
        for (Animal animal: animals){
            animal.speak(); /* Викликаємо метод для кожної тварини у списку*/
        }

        if (animals instanceof Rat){ /* Якщо це щур */
            Rat rat = (Rat) animals; /* то приводимо із типу Animal у тип Rat */
            rat.steal(); /* і викликаємо метод для кожного щура*/
        }
    }
}
