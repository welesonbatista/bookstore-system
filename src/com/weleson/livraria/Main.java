package com.weleson.livraria;

import com.weleson.livraria.model.Autor;
import com.weleson.livraria.model.Emprestimo;
import com.weleson.livraria.model.Livro;
import com.weleson.livraria.service.Biblioteca;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Autor autorUm = new Autor(1, "J.K. Rowling", LocalDate.of(1965, 7, 31));
        Autor autorDois = new Autor(2, "George R.R. Martin", LocalDate.of(1948, 9, 20));

        Livro livroUm = new Livro(1, "Harry Potter e a Pedra Filosofal", "978-0545582889", autorUm, "Disponível", LocalDate.now(), LocalDate.now());
        Livro livroDois = new Livro(2, "A Guerra dos Tronos", "978-0553103540", autorDois, "Disponível", LocalDate.now(), LocalDate.now());
        Livro livroTres = new Livro(3, "Harry Potter e a Câmara Secreta", "978-0545582896", autorUm, "Indisponivel", LocalDate.now(), LocalDate.now());

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.armazenarAutores(autorUm);
        biblioteca.armazenarAutores(autorDois);

        biblioteca.armazenarLivros(livroUm);
        biblioteca.armazenarLivros(livroDois);
        biblioteca.armazenarLivros(livroTres);

        int opcao = 0;

        do {

            System.out.println("Bem-vindo à Biblioteca! Escolha uma opção:");
            System.out.println("1: Listar Livros");
            System.out.println("2: Listar Autores");
            System.out.println("3: SAIR");
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite a opção desejada:");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Livros disponíveis na biblioteca:");
                    for (Livro l : biblioteca.getLivros()) {
                        if (l.getStatusDisponibilidade().equals("Disponível")) {
                            System.out.println("ID do livro: "  + l.getId() + " - " + l.getTitulo() + " (ISBN: " + l.getIsbn() + ") - Autor: " + l.getAutor().getNome() + " - Status: " + l.getStatusDisponibilidade());
                        }
                    }
                    System.out.println("Deseja alugar algum livro ?");
                    System.out.println("1: SIM");
                    System.out.println("2: NAO");
                    int resposta = leitor.nextInt();
                    
                    if (resposta == 1) {

                        System.out.println("Digite o id do livro que deseja alugar:");

                        int idLivro = leitor.nextInt();
                        boolean encontrado = false;

                        for (Livro l : biblioteca.getLivros()) {
                            if (l.getId() == idLivro) {
                                if (l.getStatusDisponibilidade().equals("Disponível")) {
                                    System.out.println("Digite o nome do cliente:");
                                    leitor.nextLine();
                                    String nomeCliente = leitor.nextLine();
                                    
                                    l.setStatusDisponibilidade("Indisponivel");
                                    
                                    Emprestimo emprestimo = new Emprestimo(
                                        biblioteca.getEmprestimos().size() + 1,
                                        l,
                                        nomeCliente,
                                        LocalDate.now(),
                                        LocalDate.now().plusDays(14)
                                    );
                                    biblioteca.armazenarEmprestimos(emprestimo);
                                    
                                    System.out.println("Livro '" + l.getTitulo() + "' alugado com sucesso!");
                                } else {
                                    System.out.println("Este livro já está indisponível.");
                                }
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Livro com ID " + idLivro + " não encontrado.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Autores cadastrados na biblioteca:");
                    for (Autor a : biblioteca.getAutores()) {
                        System.out.println("- " + a.getNome() + " (Data de Nascimento: " + a.getDataNascimento() + ")");
                    }
                    break;
                case 3:
                    System.out.println("A Biblioteca agradece a sua visita! Até a próxima.");
                    leitor.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
        while(opcao != 3);
    }
}

