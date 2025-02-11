package org.example.domain;

/**
 * Project: exemplojdbc
 * Package: org.example.domain
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/02/2025
 * Time: 14:26
 * <p>
 */
public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
