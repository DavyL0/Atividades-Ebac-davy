package org.example;

import org.example.models.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta mediaNota = new Conta();

        double nota = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota "+ (i + 1)+ ": ");
            double notaNova = sc.nextDouble();

            nota += notaNova;
        }

        mediaNota.setNota(nota);
        System.out.println("A média das notas são "+ mediaNota.media());
    }
}