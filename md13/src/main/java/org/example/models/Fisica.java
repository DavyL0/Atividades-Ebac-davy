package org.example.models;

public class Fisica extends Pessoa {
    private String cpf;


    public Fisica(String name, String cpf, String ender) {
        super(name, Long.valueOf(cpf), ender);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
