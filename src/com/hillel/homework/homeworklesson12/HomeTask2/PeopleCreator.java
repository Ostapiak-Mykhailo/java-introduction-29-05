package com.hillel.homework.homeworklesson12.HomeTask2;

public class PeopleCreator {

    public static void main(String[] args) {

        People grandMother1 = new People("Oleksandra", null, null);
        People grandFather1 = new People("Oleksandr", null, null);
        People grandMother2 = new People("Yuliia", null, null);
        People grandFather2 = new People("Andriy", null, null);

        People mother = new People("Kateryna", grandMother1, grandFather1);
        People father = new People("Vlad", grandMother2, grandFather2);

        People grandSon = new People("Igor", mother, father);
        People grandDaughter = new People("Olga", mother, father);
    }
}
