package org.example.models;

public class Conta {
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public  double media(){
        return getNota()/4;
    }
}
