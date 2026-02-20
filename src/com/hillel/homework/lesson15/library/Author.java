package com.hillel.homework.lesson15.library;

import java.util.ArrayList;
import java.util.List;

public class Author {

    private String lastName;
    private String name;
    private List<Book> books;

    public Author() {
        this.books = new ArrayList<>();
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String bookName = "";
        for (Book book : books) {
            bookName += book.getName() + "; ";
        }
        return "Author{" +
                ", name - '" + name + '\'' +
                "lastName - '" + lastName + '\'' +
                ", books: " + books.size() +": " + bookName +
                '}';
    }
}
