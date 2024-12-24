package org.example;

import org.example.models.Fisica;
import org.example.models.Juridica;
import org.example.models.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoaFisica = new Fisica("João", "2345678900", "Rua A");
        Pessoa pessoaJuridica = new Juridica("Empresa XYZ", "12345678000100", "Av. B");



    }
}