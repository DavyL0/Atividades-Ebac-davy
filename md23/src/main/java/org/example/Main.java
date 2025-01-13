package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().pessoas();

        Stream<Pessoa> homem = pessoas.stream().
                filter(pessoa -> pessoa.getSexo().
                        equals("masculino"));
        Stream<Pessoa> mulher = pessoas.stream().
                filter(pessoa -> pessoa.getSexo().
                        equals("feminino"));

        System.out.println("Lista de Homens: ");
        homem.forEach(p -> System.out.println(p.getNome()));
        System.out.println("Lista de Mulheres: ");
        mulher.forEach(m -> System.out.println(m.getNome()));
    }
}