package com.weleson.livraria.model;

import java.time.LocalDate;

public class Livro {

    private Integer id;
    private String titulo;
    private String isbn;
    private Autor autor;
    private String statusDisponibilidade;
    private LocalDate dataCadastroLivro;
    private LocalDate dataAtualizacaoLivro;

    public Livro() {
    }

    public Livro(Integer id, String titulo, String isbn, Autor autor, String statusDisponibilidade,
                 LocalDate dataCadastroLivro, LocalDate dataAtualizacaoLivro) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.statusDisponibilidade = statusDisponibilidade;
        this.dataCadastroLivro = dataCadastroLivro;
        this.dataAtualizacaoLivro = dataAtualizacaoLivro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getStatusDisponibilidade() {
        return statusDisponibilidade;
    }

    public void setStatusDisponibilidade(String statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }

    public LocalDate getDataCadastroLivro() {
        return dataCadastroLivro;
    }

    public void setDataCadastroLivro(LocalDate dataCadastroLivro) {
        this.dataCadastroLivro = dataCadastroLivro;
    }

    public LocalDate getDataAtualizacaoLivro() {
        return dataAtualizacaoLivro;
    }

    public void setDataAtualizacaoLivro(LocalDate dataAtualizacaoLivro) {
        this.dataAtualizacaoLivro = dataAtualizacaoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor=" + autor +
                ", statusDisponibilidade='" + statusDisponibilidade + '\'' +
                ", dataCadastroLivro=" + dataCadastroLivro +
                ", dataAtualizacaoLivro=" + dataAtualizacaoLivro +
                '}';
    }
}

