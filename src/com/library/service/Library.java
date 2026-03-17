package com.library.service;

import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Loan;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Author> authors;
    private List<Loan> loans;

    public Library() {
        this.books = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public Library(List<Book> books, List<Author> authors, List<Loan> loans) {
        this.books = books;
        this.authors = authors;
        this.loans = loans;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public void storeBook(Book book) {
        this.books.add(book);
        System.out.println("Book stored successfully: " + book.getTitle());
        System.out.println("Total books in the library: " + this.books.size());
        System.out.println("Current books in the library:");
        for (Book b : this.books) {
            System.out.println("- " + b.getTitle() + " (ISBN: " + b.getIsbn() + ")");
        }
        System.out.println();
    }

    public void storeAuthor(Author author) {
        this.authors.add(author);
        System.out.println("Author stored successfully: " + author.getName());
        System.out.println("Total authors in the library: " + this.authors.size());
        System.out.println("Current authors in the library:");
        for (Author a : this.authors) {
            System.out.println("- " + a.getName() + " (Birth Date: " + a.getBirthDate() + ")");
        }
        System.out.println();
    }

    public void storeLoan(Loan loan) {
        this.loans.add(loan);
        System.out.println("Loan stored successfully: " + loan.getBook().getTitle() + " to " + loan.getCustomerName());
        System.out.println("Total loans in the library: " + this.loans.size());
        System.out.println("Current loans in the library:");
        for (Loan l : this.loans) {
            System.out.println("- Book: " + l.getBook().getTitle() + " | Customer: " + l.getCustomerName() + " | Loan Date: " + l.getLoanDate() + " | Return Date: " + l.getReturnDate());
        }
        System.out.println();
    }
}

