package com.dlopes.crud.model;

import jakarta.persistence.*;

/**
 * Project: crud
 * Package: com.dlopes.crud.model
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 22/04/2025
 * Time: 16:37
 * <p>
 */

@Entity(name = "product")
@Table(name = "product")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private Long price;

    public Produto() {
    }

    public Produto(Integer id, String name, Long price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
