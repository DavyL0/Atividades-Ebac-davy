package org.example.models;

public class Juridica extends Pessoa{
    private String  cnpj;

    public Juridica(String name, String cnpj, String ender) {
        super(name, cnpj, ender);
        this.cnpj = String.valueOf(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = String.valueOf(cnpj);
    }



}
