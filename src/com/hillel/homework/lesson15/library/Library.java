package com.hillel.homework.lesson15.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
private List<Book> books;
private List<Author> authors;
private List<Genre> genres;

    public Library() {
        this.genres = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", authors=" + authors +
                ", genres=" + genres +
                '}';
    }
}
