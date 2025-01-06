package org.example;

import org.example.domain.Bugatti;
import org.example.domain.Ferrari;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Bugatti bugatti1 = new Bugatti("verao", 1111111.11);
        Ferrari ferrari1 = new Ferrari("LaFerrari", 10000000.00);

        // Lista que aceita objetos de qualquer classe
        List<Object> listaGenerica = new ArrayList<>();

        // Adicionando diferentes objetos à lista
        listaGenerica.add(bugatti1);
        listaGenerica.add(ferrari1);

        // Iterando sobre os objetos da lista
        for (Object obj : listaGenerica) {
            System.out.println(obj);
        }
    }
}
