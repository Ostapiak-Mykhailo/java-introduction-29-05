package com.hillel.homework.homeworklesson12.ExtraHomeTask;
 /*Взаимодействие с объектами
    Написать метод fight в классе Cat, который принимает в качестве параметра другого кота и определяет
    выиграл ли кот this этот бой
    Придумайте алгоритм определения победителя на основе параметров кота - weight, strength, age
    Проведите 3 кошачьих боя и выведите результат каждого боя на экран*/

public class CatFights {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tommy", 4, 15, 3);
        Cat cat2 = new Cat("Sammy", 9, 12, 4);
        Cat cat3 = new Cat("Ginger", 1, 17, 2);
        Cat cat4 = new Cat("Maisy", 14, 16, 4);
        System.out.println("Tommy has " + cat1.score + " scores");
        System.out.println("Sammy has " + cat2.score + " scores");
        cat1.fight(cat2);
        cat3.fight(cat1);
        cat2.fight(cat4);

    }
}
