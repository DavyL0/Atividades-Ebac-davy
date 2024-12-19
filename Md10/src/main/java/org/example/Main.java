package org.example;

import org.example.models.Calcula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calcula mediaAluno = new Calcula();
        Scanner sc = new Scanner(System.in);

        double nota = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Coloque a nota "+ (i+1)+ ": ");
            double notaNova = sc.nextDouble();
            nota += notaNova;
        }

        mediaAluno.setNota(nota);
        mediaAluno.validaMedia();
    }
}