package org.example.domain;

import jakarta.persistence.*;

/**
 * Project: md32
 * Package: org.example.domain
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 20/03/2025
 * Time: 15:53
 * <p>
 */
@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="produto_seq")
    @SequenceGenerator(name="produto_seq", sequenceName="produto_curso", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "NOME", length = 50, nullable = false, unique = true)
    private String nome;

    @Column(name = "PRECO", length = 10, nullable = false, unique = true)
    private double preco;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
