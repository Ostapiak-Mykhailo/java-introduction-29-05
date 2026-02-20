package com.hillel.homework.lesson15.library;

import java.io.IOException;

public class LibraryApp {

    public static void main(String[] args) throws IOException {

        LibraryView view = new LibraryView();
        Library library = new Library();
        LibraryController controller= new LibraryController(view, library);

        System.out.println("Hello, welcome to my library:)");
        controller.libraryRun();
    }
}
