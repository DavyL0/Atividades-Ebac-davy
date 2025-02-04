package org.example.domain;

/**
 * Project: md25
 * Package: org.example
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 18/01/2025
 * Time: 08:31
 * <p>
 */
public class Cliente {
    private Long cpf;
    private String nome;
    private String cidade;
    private String estado;
    private String endereco;
    private Long telefone;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
