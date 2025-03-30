package org.davy.domain;

import jakarta.persistence.*;

import java.util.List;

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
@Table(name = "TB_CARRO")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "carro_seq", initialValue = 1,allocationSize = 1 )
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false, unique = true)
    private String nome;

    @Column(name = "PRECO", length = 10, nullable = false, unique = true)
    private double preco;

   @OneToMany(mappedBy = "MARCA")
   @JoinColumn(name = "marca_id")
    private List<Marca> marcaList;

    @ManyToOne
    @JoinColumn(name = "acessorio_id")
    private Acessorio acessorio;

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public Carro(List<Marca> marcaList) {
        this.marcaList = marcaList;
    }

    public Carro() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Marca> getMarcaList() {
        return marcaList;
    }

    public void setMarcaList(List<Marca> marcaList) {
        this.marcaList = marcaList;
    }
}
