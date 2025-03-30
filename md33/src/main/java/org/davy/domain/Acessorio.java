package org.davy.domain;

import jakarta.persistence.*;

import java.util.List;

import static jakarta.persistence.CascadeType.DETACH;

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
@Table(name = "TB_ACESSORIO")
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acess_seq")
    @SequenceGenerator(name = "acess_seq", sequenceName = "acess_seq", initialValue = 1,allocationSize = 1 )
    private String id;
    @Column(name = "NAME",nullable = false)
    private String name;
    @Column(name = "VALUE", nullable = false)
    private double value;

    @OneToMany(mappedBy = "CARRO")
    @JoinColumn(name = "carro_id")
    private List<Carro> carrosList;

    public List<Carro> getCarrosList() {
        return carrosList;
    }

    public void setCarrosList(List<Carro> carrosList) {
        this.carrosList = carrosList;
    }

    public Acessorio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
