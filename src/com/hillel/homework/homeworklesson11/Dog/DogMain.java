package com.hillel.homework.homeworklesson11.Dog;

public class DogMain {

    public static void main(String[] args) {

        Dog dog = new Dog(2, 90, "Maltipoo", "Lola");
        dog.bark();
        dog.eat();
        dog.play();
        dog.displayStatus();
    }
}
