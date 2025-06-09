package br.com.davy.animal_service.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String tipoAnimal;

    @Column(nullable = false)
    private String nomeProvisorio;

    @Column(nullable = false)
    private Integer idadeEstimada;

    @Column(nullable = false)
    private String raca;

    @Column(nullable = false)
    private Date dataEntrada;

    @Column
    private Date dataAdocao;

    @Column(nullable = false)
    private String condicaoChegada;

    @Column(nullable = false)
    private String nomeRecebedor;

    @Column
    private Date dataObito;

    @Column(nullable = false)
    private String porte;
}
