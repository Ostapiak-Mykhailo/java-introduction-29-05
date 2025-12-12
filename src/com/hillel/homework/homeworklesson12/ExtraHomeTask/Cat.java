package com.hillel.homework.homeworklesson12.ExtraHomeTask;

public class Cat {

    String name;
    int age;
    int weight;
    int strength;
    int score;

    public Cat(String name, int age, int strength, int weight) {
        this.age = age;
        this.strength = strength;
        this.weight = weight;
        this.name = name;
        calculateScores();
    }

    public void fight(Cat cat) {
        if (this.score > cat.score) {
            System.out.println(this.name + " won, " + cat.name + " lost");
        } else if (this.score < cat.score) {
            System.out.println(cat.name + " won, " + this.name + " lost");
        } else {
            System.out.println("no winner identified");
        }
    }

    private void calculateScores() {
        if (this.age <= 3) {
            this.score = age * 3;
        } else if (this.age >= 4 && this.age <= 10) {
            this.score = age * 8;
        } else {
            this.score = age * 5;
        }
        this.score += weight * 3;
        this.score += strength * 12;
    }
}
