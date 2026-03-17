package com.library.model;

import java.time.LocalDate;

public class Loan {

    private Integer id;
    private Book book;
    private String customerName;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Loan() {
    }

    public Loan(Integer id, Book book, String customerName, LocalDate loanDate, LocalDate returnDate) {
        this.id = id;
        this.book = book;
        this.customerName = customerName;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", book=" + book +
                ", customerName='" + customerName + '\'' +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                '}';
    }
}

