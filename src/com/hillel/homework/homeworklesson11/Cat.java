package com.hillel.homework.homeworklesson11;

public class Cat {
    int age;
    int weight;
    String name;
    String breed;

    public Cat() {

    }

    public Cat(int age, String name) {

    }

    public Cat(int age, int weight, String name, String breed) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public boolean equals(Object object) {
        if (object instanceof Cat) {
            Cat cat = (Cat) object;
            return this.age == cat.age && this.weight == cat.weight;
        }
        return false;
    }
}
