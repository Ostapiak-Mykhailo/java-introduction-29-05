package com.hillel.homework.lesson15.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryController {

    private final LibraryView view;
    private final Library library;
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public LibraryController(LibraryView view, Library library) {
        this.view = view;
        this.library = library;
    }

    public void libraryRun() throws IOException {
        while (true) {
            view.suggestOptions();
            defineOption();
        }
    }

    public void defineOption() throws IOException {
        int input = view.getInput();
        switch (input) {
            case 1 -> createAuthor();
            case 2 -> createBook();
            case 3 -> createGenre();
            case 4 -> showAllAuthors();
            case 5 -> showAllBooks();
            case 6 -> showAllGenres();
            case 7 -> deleteAuthor();
            case 8 -> deleteBook();
            case 9 -> deleteGenre();
            default -> System.out.println("Error:( Please try again");
        }
    }

    private Author createAuthor() throws IOException {
        System.out.println("Please enter author`s name");
        String name = READER.readLine();
        System.out.println("Please enter author`s last name");
        String lastName = READER.readLine();
        Author author = new Author();
        author.setName(name);
        author.setLastName(lastName);
        library.getAuthors().add(author);
        return author;
    }

    private Genre createGenre() throws IOException {
        System.out.println("Enter the name of the genre");
        String name = READER.readLine();
        System.out.println("Please describe this genre");
        String description = READER.readLine();
        Genre genre = new Genre();
        genre.setName(name);
        genre.setDescription(description);
        library.getGenres().add(genre);
        return genre;
    }

    private void createBook() throws IOException {

        Book book = new Book();

        System.out.println("Year of publication");
        int publicationYear = LibraryView.getYearOfBook();

        System.out.println("Please enter name of the book");
        String name = READER.readLine();

        System.out.println("What is this book about (description)?");
        String description = READER.readLine();

        System.out.println("Who is the author?");
        Author author = chooseOrCreateAuthorOfBook();
        book.setAuthor(author);

        System.out.println("Enter the genre of this book");
        Genre genre = chooseOrCreateGenreOfBook();
        book.setGenre(genre);

        book.setYear(publicationYear);
        book.setName(name);
        book.setDescription(description);
        author.getBooks().add(book);
        genre.getBooks().add(book);
        library.getBooks().add(book);
    }

    public Author chooseOrCreateAuthorOfBook() throws IOException {
        Author authorChoice = null;
        while (authorChoice == null) {
            if (library.getAuthors().isEmpty()) {
                System.out.println("List of authors is empty. Please create a new one for your book");
                authorChoice = createAuthor();
            } else {
                System.out.println("choose 0 to create your author or choose one from this list:");
                for (int i = 0; i < library.getAuthors().size(); i++) {
                    System.out.println((i + 1) + " - " + library.getAuthors().get(i));
                }
                String str = READER.readLine();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getAuthors().size()) {
                    authorChoice = library.getAuthors().get(choice - 1);
                } else if (choice == 0) {
                    authorChoice = createAuthor();
                } else
                    System.out.println("Invalid choice. Please try again");
            }
        }
        return authorChoice;
    }

    public Genre chooseOrCreateGenreOfBook() throws IOException {
        Genre genreChoice = null;
        while (genreChoice == null) {
            if (library.getGenres().isEmpty()) {
                System.out.println("List of genres is empty. Please create your own genre");
                genreChoice = createGenre();
            } else {
                System.out.println("Choose 0 to create a new genre or choose one from the list provided:");
                for (int i = 0; i < library.getGenres().size(); i++) {
                    System.out.println((i + 1) + " - " + library.getGenres().get(i));
                }
                String str = READER.readLine();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getGenres().size()) {
                    genreChoice = library.getGenres().get(choice - 1);
                } else if (choice == 0) {
                    genreChoice = createGenre();
                } else
                    System.out.println("Invalid choice. Please try again");
            }
        }
        return genreChoice;
    }

    private void showAllAuthors() {
        if (library.getAuthors().isEmpty()) {
            System.out.println("The list of authors is empty");
        } else {
            System.out.println("Here is the list of all authors in my library:");
            for (int i = 0; i < library.getAuthors().size(); i++) {
                System.out.println(i + 1 + " - " + library.getAuthors().get(i).toString());
            }
        }
    }

    private void showAllBooks() {
        if (library.getBooks().isEmpty()) {
            System.out.println("There isn`t any book in my library yet");
        } else {
            System.out.println("Here is the list of all books in my library:");
            for (int i = 0; i < library.getBooks().size(); i++) {
                System.out.println(i + 1 + " - " + library.getBooks().get(i).toString());
            }
        }
    }

    private void showAllGenres() {
        if (library.getGenres().isEmpty()) {
            System.out.println("The list of genres is empty");
        } else {
            System.out.println("Here is the list of all genres in my library:");
            for (int i = 0; i < library.getGenres().size(); i++) {
                System.out.println(i + 1 + " - " + library.getGenres().get(i).toString());
            }
        }
    }

    private void deleteAuthor() throws IOException {
        System.out.println("Choose the author you want to delete from the list provided or choose 0 to go back");
        boolean isDeleted = false;
        while (!isDeleted) {
            if (library.getAuthors().isEmpty()) {
                System.out.println("The list is empty, there is no one to delete.");
                return;
            } else {
                for (int i = 0; i < library.getAuthors().size(); i++) {
                    System.out.println(i + 1 + " - " + library.getAuthors().get(i));
                }
                String str = READER.readLine();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getAuthors().size()) {
                    System.out.println("The author " + library.getAuthors().get(choice - 1) + " was deleted successfully");
                    Author author = library.getAuthors().get(choice - 1);
                    for (Book book : author.getBooks()) {
                        library.getBooks().remove(book);
                        book.getGenre().getBooks().remove(book);
                    }
                    library.getAuthors().remove(choice -1);
                    isDeleted = true;
                } else if (choice == 0) {
                    return;
                } else
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }

    private void deleteBook() throws IOException {
        System.out.println("Choose the book you want to delete from the list provided or choose 0 to go back");
        boolean isDeleted = false;
        while (!isDeleted) {
            if (library.getBooks().isEmpty()) {
                System.out.println("The list is empty, there is nothing to delete.");
                return;
            } else {
                for (int i = 0; i < library.getBooks().size(); i++) {
                    System.out.println(i + 1 + " - " + library.getBooks().get(i));
                }
                String str = READER.readLine();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getBooks().size()) {
                    System.out.println("The book " + library.getBooks().get(choice - 1) + " was deleted successfully");
                    library.getBooks().remove(choice - 1);
                    isDeleted = true;
                } else if (choice == 0) {
                    return;
                } else
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }

    private void deleteGenre() throws IOException {
        boolean isDeleted = false;
        while (!isDeleted) {
            if (library.getGenres().isEmpty()) {
                System.out.println("The list is empty, there is nothing to delete");
                return;
            } else {
                for (int i = 0; i < library.getGenres().size(); i++) {
                    System.out.println(i + 1 + " - " + library.getGenres().get(i));
                }
                String str = READER.readLine();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getGenres().size()) {
                    System.out.println("The genre " + library.getGenres().get(choice - 1) + " was deleted successfully");
                    library.getGenres().remove(choice - 1);
                    isDeleted = true;
                } else if (choice == 0) {
                    return;
                } else
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}
