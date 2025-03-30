package org.davy.domain;

import jakarta.persistence.*;

/**
 * Project: md33
 * Package: org.davy.domain
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 28/03/2025
 * Time: 18:01
 * <p>
 */

@Entity
@Table(name = "TB_MARCA")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "carro_seq", initialValue = 1,allocationSize = 1 )
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false, unique = true)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    public Marca() {

    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
