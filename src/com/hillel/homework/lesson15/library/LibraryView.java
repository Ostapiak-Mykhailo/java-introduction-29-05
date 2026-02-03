package com.hillel.homework.lesson15.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryView {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public LibraryView() {

    }

    public void suggestOptions() {
        String message = "Choose item you want to work with: AUTHOR, GENRE or BOOK";
        System.out.println(message);
    }

    public ObjectType selectOptionType() throws IOException {
        while (true) {
            String str = READER.readLine();
            str = str.toUpperCase();
            try {
                return ObjectType.valueOf(str);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. There is no such option");
            }
        }
    }

    public Action selectAction() throws IOException {
        while (true) {
            String str = READER.readLine();
            str = str.toUpperCase();
            try {
                return Action.valueOf(str);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. There is no such option");
            }
        }
    }

    public void suggestAuthorOption() {
        String suggestion = """
                Enter CREATE to add a new author to the list of Authors
                Enter SHOW to see the list of all authors
                Enter DELETE if you want to delete author from the list
                """;
        System.out.println(suggestion);
    }

    public void suggestGenreOption() {
        String suggestion = """
                Enter CREATE to add a new genre to the library
                Enter SHOW to see the list of all genres
                Enter DELETE if you want to delete genre from the list
                """;
        System.out.println(suggestion);
    }

    public void suggestBookOption() {
        String suggestion = """
                Enter CREATE to add a new book to the library
                Enter SHOW to see the list of all books
                Enter DELETE if you want to delete book from the library
                """;
        System.out.println(suggestion);
    }

    public int getYearOfBook() throws IOException {
        System.out.println("Year of publication");
        while (true) {
            String str = READER.readLine();
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Please enter the year this book was published");
            }
        }
    }

    public String getNameOfBook() throws IOException {
        System.out.println("Please enter name of the book");
        return READER.readLine();
    }

    public String getDescriptionOfBook() throws IOException {
        System.out.println("What is this book about (description)?");
        return READER.readLine();
    }

    public String getAuthorName() throws IOException {
        System.out.println("Please enter author`s name");
        return READER.readLine();
    }

    public String getAuthorLastName() throws IOException {
        System.out.println("Please enter author`s last name");
        return READER.readLine();
    }

    public String getNameOfGenre() throws IOException {
        System.out.println("Enter the name of the genre");
        return READER.readLine();
    }

    public String getDescriptionOfGenre() throws IOException {
        System.out.println("Please describe this genre");
        return READER.readLine();
    }

    public String getInput() throws IOException {
        return READER.readLine();
    }
}
