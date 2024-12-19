package org.example.models;

public class Calcula {

    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double media(){
        return getNota()/4;
    }

    public void validaMedia(){
        if(media() >= 7 ){
            System.out.println("Aluno aprovado");
        } else if (media() >= 5) {
            System.out.println("Aluno de recuperação");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}
