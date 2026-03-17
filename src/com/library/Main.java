package com.library;

import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Loan;
import com.library.service.Library;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author(1, "J.K. Rowling", LocalDate.of(1965, 7, 31));
        Author authorTwo = new Author(2, "George R.R. Martin", LocalDate.of(1948, 9, 20));

        Book bookOne = new Book(1, "Harry Potter and the Philosopher's Stone", "978-0545582889", authorOne, "Available", LocalDate.now(), LocalDate.now());
        Book bookTwo = new Book(2, "A Game of Thrones", "978-0553103540", authorTwo, "Available", LocalDate.now(), LocalDate.now());
        Book bookThree = new Book(3, "Harry Potter and the Chamber of Secrets", "978-0545582896", authorOne, "Unavailable", LocalDate.now(), LocalDate.now());

        Library library = new Library();
        library.storeAuthor(authorOne);
        library.storeAuthor(authorTwo);

        library.storeBook(bookOne);
        library.storeBook(bookTwo);
        library.storeBook(bookThree);

        int option = 0;

        do {

            System.out.println("Welcome to the Library! Choose an option:");
            System.out.println("1: List Books");
            System.out.println("2: List Authors");
            System.out.println("3: EXIT");
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter the desired option:");
            option = reader.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Available books in the library:");
                    for (Book b : library.getBooks()) {
                        if (b.getAvailabilityStatus().equals("Available")) {
                            System.out.println("Book ID: " + b.getId() + " - " + b.getTitle() + " (ISBN: " + b.getIsbn() + ") - Author: " + b.getAuthor().getName() + " - Status: " + b.getAvailabilityStatus());
                        }
                    }
                    System.out.println("Would you like to rent a book?");
                    System.out.println("1: YES");
                    System.out.println("2: NO");
                    int answer = reader.nextInt();

                    if (answer == 1) {

                        System.out.println("Enter the ID of the book you want to rent:");

                        int bookId = reader.nextInt();
                        boolean found = false;

                        for (Book b : library.getBooks()) {
                            if (b.getId() == bookId) {
                                if (b.getAvailabilityStatus().equals("Available")) {
                                    System.out.println("Enter the customer's name:");
                                    reader.nextLine();
                                    String customerName = reader.nextLine();

                                    b.setAvailabilityStatus("Unavailable");

                                    Loan loan = new Loan(
                                        library.getLoans().size() + 1,
                                        b,
                                        customerName,
                                        LocalDate.now(),
                                        LocalDate.now().plusDays(14)
                                    );
                                    library.storeLoan(loan);

                                    System.out.println("Book '" + b.getTitle() + "' rented successfully!");
                                } else {
                                    System.out.println("This book is already unavailable.");
                                }
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Book with ID " + bookId + " not found.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Authors registered in the library:");
                    for (Author a : library.getAuthors()) {
                        System.out.println("- " + a.getName() + " (Birth Date: " + a.getBirthDate() + ")");
                    }
                    break;
                case 3:
                    System.out.println("The Library thanks you for your visit! See you next time.");
                    reader.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
        while (option != 3);
    }
}

