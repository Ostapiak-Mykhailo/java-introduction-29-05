package com.hillel.homework.homeworklesson11.Dog;

/*🐕 4. Клас Dog
Поля: name, breed, age, energy
Конструктор: ініціалізує всі поля.
        Методи:
bark() — виводить “Woof! Woof!”
play() — зменшує енергію на 10
eat() — збільшує енергію на 20
displayStatus() — показує поточний рівень енергії
💡 Додатково: зроби так, щоб енергія не могла бути нижче 0 або вище 100.*/

public class Dog {

    int age;
    int energy;
    String breed;
    String name;

    public Dog(int age, int energy, String breed, String name) {
        this.age = age;
        this.energy = energy;
        this.breed = breed;
        this.name = name;
    }

    public void bark() {
        System.out.println("Woof! Woof!");
    }

    public int play() {
        energy -= 10;
        if (energy < 0) {
            energy =  0;
        }
        return energy;
    }

    public int eat() {
        energy += 20;
        if (energy > 100) {
            energy = 100;
        }
        return energy;
    }

    public void displayStatus(){
        System.out.println("Current energy is: " + energy);
    }
}