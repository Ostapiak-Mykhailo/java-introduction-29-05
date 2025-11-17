package com.hillel.homework.homeworklesson12.ExtraHomeTask2;

public class Book {

    String title;
    int pages;
    Author author;

    public Book(String title, int pages, Author author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }

    public void printInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", author=" + author +
                '}';
    }
}
