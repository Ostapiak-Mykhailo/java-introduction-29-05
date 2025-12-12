package com.hillel.homework.homeworklesson12.ExtraHomeTask2;
/*Задача про книги та авторів
Створити клас Author з полями: name (String), birthYear (int).
Створити клас Book з полями: title (String), pages (int), author (об’єкт Author).
Написати метод у Book printInfo(), який виводить інформацію про книгу та її автора.
Створити 3 авторів і по 2 книги для кожного, вивести всю інформацію на екран.*/

public class Library {

    public static void main(String[] args) {

        Author author1 = new Author("Dan", "Brown", 1964);
        Author author2 = new Author("Thomas", "Harris", 1940);

        Book book1 = new Book("Inferno", 355, author1);
        Book book2 = new Book("Angels & Demons", 420, author1);
        Book book3 = new Book("The Silence of the Lambs", 415, author2);
        Book book4 = new Book("Rad Dragon", 380, author2);
        book1.printInfo();
        book3.printInfo();

    }
}
