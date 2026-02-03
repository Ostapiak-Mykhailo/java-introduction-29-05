package com.hillel.homework.lesson15.library;

import java.io.IOException;

public class LibraryController {

    private final LibraryView view;
    private final Library library;

    public LibraryController(LibraryView view, Library library) {
        this.view = view;
        this.library = library;
    }

    public void libraryRun() throws IOException {
        while (true) {
            view.suggestOptions();
            selectObject();
        }
    }

    public void selectObject() throws IOException {
        ObjectType input = view.selectOptionType();
        switch (input) {
            case AUTHOR -> doAuthorAction();
            case BOOK -> doBookAction();
            case GENRE -> doGenreAction();
            default -> System.out.println("Error:( Please try again");
        }
    }

    public void doAuthorAction() throws IOException {
        view.suggestAuthorOption();
        Action action = view.selectAction();
        switch (action) {
            case CREATE -> createAuthor();
            case SHOW -> showAllAuthors();
            case DELETE -> deleteAuthor();
        }
    }

    public void doGenreAction() throws IOException {
        view.suggestGenreOption();
        Action action = view.selectAction();
        switch (action){
            case CREATE -> createGenre();
            case SHOW -> showAllGenres();
            case DELETE -> deleteGenre();
        }
    }

    public void doBookAction() throws IOException {
        view.suggestBookOption();
        Action action = view.selectAction();
        switch (action){
            case CREATE -> createBook();
            case SHOW -> showAllBooks();
            case DELETE -> deleteBook();
        }
    }

    private Author createAuthor() throws IOException {
        String name = view.getAuthorName();
        String lastName = view.getAuthorLastName();
        Author author = new Author();
        author.setName(name);
        author.setLastName(lastName);
        library.getAuthors().add(author);
        return author;
    }

    private Genre createGenre() throws IOException {
        String name = view.getNameOfGenre();
        String description = view.getDescriptionOfGenre();
        Genre genre = new Genre();
        genre.setName(name);
        genre.setDescription(description);
        library.getGenres().add(genre);
        return genre;
    }

    private void createBook() throws IOException {
        Book book = new Book();

        int publicationYear = view.getYearOfBook();
        String name = view.getNameOfBook();
        String description = view.getDescriptionOfBook();

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
                String str = view.getInput();
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
                String str = view.getInput();
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
                String str = view.getInput();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getAuthors().size()) {
                    System.out.println("The author " + library.getAuthors().get(choice - 1) + " was deleted successfully");
                    Author author = library.getAuthors().get(choice - 1);
                    for (Book book : author.getBooks()) {
                        library.getBooks().remove(book);
                        book.getGenre().getBooks().remove(book);
                    }
                    library.getAuthors().remove(choice - 1);
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
                String str = view.getInput();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getBooks().size()) {
                    System.out.println("The book " + library.getBooks().get(choice - 1) + " was deleted successfully");
                    Book book = library.getBooks().get(choice - 1);
                    Author author = book.getAuthor();
                    Genre genre = book.getGenre();
                    author.getBooks().remove(book);
                    genre.getBooks().remove(book);
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
                String str = view.getInput();
                int choice = Integer.parseInt(str);
                if (choice > 0 && choice <= library.getGenres().size()) {
                    System.out.println("The genre " + library.getGenres().get(choice - 1) + " was deleted successfully");
                    Genre genre = library.getGenres().get(choice - 1);
                    for (Book book : genre.getBooks()) {
                        library.getBooks().remove(book);
                    }
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
