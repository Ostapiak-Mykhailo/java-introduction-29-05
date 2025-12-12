package com.hillel.homework.homeworklesson12.HomeTask1;

import java.util.Arrays;

public class PersonController {
    static String[] names = {"Andriy", "Oleksandr", "Dmytro", "Mykola", "Vasyl", "Ivan", "Petro", "Pavlo", "Ihor", "Yuriy",
            "Hanna", "Olena", "Kateryna", "Natalia", "Oleksandra", "Mariia", "Viktoriia", "Anastasiia", "Yuliia",
            "Tetiana"};
    static String[] surnames = {"Shevchenko", "Kovalenko", "Bondarenko", "Tkachenko", "Kravchenko", "Melnyk", "Lysenko",
            "Boyko", "Savchenko", "Pavlenko", "Ponomarenko", "Sydorenko", "Marchuk", "Kuzmenko", "Khalimon",
            "Hnatiuk", "Shvets", "Kozak", "Tkachuk", "Moroz"};

    public static void main(String[] args) {
        Person[] people = generatePeople();
        System.out.println(Arrays.toString(people));

    }

    public static Person[] generatePeople() {
        Person[] people = new Person[100];
        for (int i = 0; i < people.length; i++) {
            String name = getRandomString(names);
            String surname = getRandomString(surnames);
            int age = getAge();
            int weight = getWeight();
            int height = getHeight();
            people[i] = new Person(name, surname, weight, age, height);

        }
        return people;
    }

    public static String getRandomString(String[] strings){
        return strings[(int) (Math.random() * strings.length)];
    }

    public static int getAge(){
        return (int) (Math.random() * (80 - 20) + 20);
    }

    public static int getWeight(){
        return (int) (Math.random() * (120 - 50) + 50);
    }

    public static int getHeight(){
        return (int) (Math.random() * (205 - 155) + 155);
    }
}
