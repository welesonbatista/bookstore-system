package com.weleson.livraria.service;

import com.weleson.livraria.model.Autor;
import com.weleson.livraria.model.Emprestimo;
import com.weleson.livraria.model.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;
    private List<Autor> autores;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public Biblioteca(List<Livro> livros, List<Autor> autores, List<Emprestimo> emprestimos) {
        this.livros = livros;
        this.autores = autores;
        this.emprestimos = emprestimos;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void armazenarLivros (Livro livros){
        this.livros.add(livros);
        System.out.println("Livro armazenado com sucesso: " + livros.getTitulo());
        System.out.println("Total de livros na biblioteca: " + this.livros.size());
        System.out.println("Livros atuais na biblioteca:");
        for (Livro l : this.livros) {
            System.out.println("- " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ")");
        }
        System.out.println();
    }

    public void armazenarAutores (Autor autores){
        this.autores.add(autores);
        System.out.println("Autor armazenado com sucesso: " + autores.getNome());
        System.out.println("Total de autores na biblioteca: " + this.autores.size());
        System.out.println("Autores atuais na biblioteca:");
        for (Autor a : this.autores) {
            System.out.println("- " + a.getNome() + " (Data de Nascimento: " + a.getDataNascimento() + ")");
        }
        System.out.println();
    }

    public void armazenarEmprestimos (){

    }

}

