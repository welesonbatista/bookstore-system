package com.weleson.livraria.model;

import java.time.LocalDate;

public class Emprestimo {

    private Integer id;
    private Livro livro;
    private String nomeCliente;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo() {
    }

    public Emprestimo(Integer id, Livro livro, String nomeCliente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.livro = livro;
        this.nomeCliente = nomeCliente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "id=" + id +
                ", livro=" + livro +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                '}';
    }
}

