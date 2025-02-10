package org.com.davy.domain;

/**
 * Project: projeto3
 * Package: org.com.davy.domain
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/02/2025
 * Time: 10:53
 * <p>
 */
public class Cliente {
    private Long id;
    private String codigo;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
