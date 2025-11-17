package com.hillel.classwork.lesson12.Cat;

public class Cat {
    int strength;
    int weight;
    int age;
    String name;

    public Cat (String name, int strength, int weight, int age){
        this.strength = strength;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public void fight(Cat cat){
        if (this.strength > cat.strength){
            System.out.println(this.name + " won");
        } else if (this.strength < cat.strength){
            System.out.println(cat.name + "won");
        } else {
            System.out.println("no winner identified");
        }
    }
}
