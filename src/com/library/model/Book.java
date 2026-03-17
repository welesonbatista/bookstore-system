package com.library.model;

import java.time.LocalDate;

public class Book {

    private Integer id;
    private String title;
    private String isbn;
    private Author author;
    private String availabilityStatus;
    private LocalDate registrationDate;
    private LocalDate updateDate;

    public Book() {
    }

    public Book(Integer id, String title, String isbn, Author author, String availabilityStatus,
                LocalDate registrationDate, LocalDate updateDate) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
        this.registrationDate = registrationDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                ", registrationDate=" + registrationDate +
                ", updateDate=" + updateDate +
                '}';
    }
}

