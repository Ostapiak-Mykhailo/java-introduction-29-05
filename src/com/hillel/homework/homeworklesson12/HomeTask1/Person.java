package com.hillel.homework.homeworklesson12.HomeTask1;

public class Person {

    private int age;
    private int weight;
    private int height;
    private final String name;
    private final String surname;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int weight, int age, int height) {
        this.weight = weight;
        this.age = age;
        this.height = height;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                " age = " + age + " years " +
                ", weight = " + weight + " kilograms " +
                ", height = " + height + " centimeters " +
                '}';
    }
}
