package com.hillel.homework.lesson15.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class LibraryView {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public LibraryView() {

    }

    public void suggestOptions() {
        String message = """
                Choose one from the options provided:
                1 - add a new author
                2 - add a new book
                3 - add a new genre
                4 - show list of all authors
                5 - show list of all books
                6 - show list of all genres
                7 - delete author...
                8 - delete book...
                9 - delete genre...
                """;
        System.out.println(message);
    }

    public int getInput() throws IOException {
        while (true) {
            String str = READER.readLine();
            try {
                int input = Integer.parseInt(str);
                if (input > 0 && input <= 9) {
                    return input;
                } else {
                    System.out.println("Sorry, there is no such option");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number");
            }
        }
    }

    public static int getYearOfBook() throws IOException {
        while (true){
            String str = READER.readLine();
            try {
                return Integer.parseInt(str);
        } catch (NumberFormatException e) {
                System.out.println("Please enter the year this book was published");}
        }
    }
}
