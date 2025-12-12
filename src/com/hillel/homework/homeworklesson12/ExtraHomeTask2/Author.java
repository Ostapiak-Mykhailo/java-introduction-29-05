package com.hillel.homework.homeworklesson12.ExtraHomeTask2;

public class Author {

    String name;
    String surname;
    int birthYear;

    public Author(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
