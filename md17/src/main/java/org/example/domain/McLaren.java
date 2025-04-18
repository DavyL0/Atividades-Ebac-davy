package org.example.domain;

import org.example.services.IPersistente;

public class McLaren implements IPersistente {
    private String nome;
    private Double preco;

    public McLaren(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
