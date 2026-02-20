package com.hillel.homework.lesson15.library;

public class Book {

    private int year;
    private String name;
    private String description;
    private Author author;
    private Genre genre;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year: " + year +
                ", name - '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", author - " + author.getName() +" " + author.getLastName() +
                ", genre - " + genre.getName() +
                '}';
    }
}
