package org.example;

import java.util.List;

public class Pessoa {
    private  String id;
    private String nome;
    private String sexo;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public List pessoas(){
        Pessoa pessoa1 = new Pessoa("1", "Davy", "masculino", 20);
        Pessoa pessoa2 = new Pessoa("2", "Ana", "feminino", 25);
        Pessoa pessoa3 = new Pessoa("3", "Lucas", "masculino", 30);
        return List.of(pessoa1, pessoa2, pessoa3);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
