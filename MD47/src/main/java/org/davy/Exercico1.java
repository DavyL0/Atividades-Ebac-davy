package org.davy;

import java.util.ArrayList;
import java.util.List;

public class Exercico1 {

    public static List<List<Integer>> combinacoes(int[] tab, int k) {
        List<List<Integer>> resultado = new ArrayList<>();
        combinar(tab, k, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    private static void combinar(int[] tab, int k, int inicio, List<Integer> atual, List<List<Integer>> resultado) {
        if (atual.size() == k) {
            resultado.add(new ArrayList<>(atual)); // Faz cópia da combinação atual
            return;
        }

        for (int i = inicio; i < tab.length; i++) {
            atual.add(tab[i]);
            combinar(tab, k, i + 1, atual, resultado); // Avança para o próximo elemento
            atual.remove(atual.size() - 1); // Backtracking
        }
    }

    public static void main(String[] args) {
        int[] entrada = {1, 2, 3};
        int k = 3;

        List<List<Integer>> combinacoes = combinacoes(entrada, k);

        for (List<Integer> c : combinacoes) {
            System.out.println(c);
        }
    }
}
