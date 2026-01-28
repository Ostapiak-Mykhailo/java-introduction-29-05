package com.hillel.homework.lesson15.library;

import java.util.ArrayList;
import java.util.List;

public class Genre {

    private  String name;
    private  String description;
    private List<Book> books;

    public Genre(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String bookName = "";
        for (Book book : books) {
            bookName += book.getName() + "; ";
        }
        return "Genre{" +
                "name - '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", books: " + books.size() + ": " + bookName +
                '}';
    }
}
