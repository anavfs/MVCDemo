package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/livros")
public class DadosController {
    private static final List<Livro> livros = new ArrayList<Livro>();

    public DadosController() {
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899, 29.90));
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 39.90));
        livros.add(new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 24.90));
    }

    @GetMapping
    public List<Livro> getLivros() {
        return livros;
    }
}