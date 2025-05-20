package org.davy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {

    interface Bolso {
        int[] getDinSizes(); // denominações
        int getCarteira();   // valor total da carteira
    }

    private static class Carteira implements Bolso {

        @Override
        public int[] getDinSizes() {
            return new int[]{5, 2, 1};
        }

        @Override
        public int getCarteira() {
            return 100;
        }
    }

    public static class Caixa {
        private int recebido = 0; // valor acumulado na caixa
        private int quantidadeNotas = 0;

        public boolean podeReceber(int valor, int limite) {
            return (recebido + valor <= limite) && (quantidadeNotas < 18);
        }

        public void receber(int valor) {
            recebido += valor;
            quantidadeNotas++;
        }

        public int getRecebido() {
            return recebido;
        }
    }

    public int distribuirValor(final Bolso carteira) {
        int[] dinSizes = carteira.getDinSizes();
        Arrays.sort(dinSizes); // crescente
        int totalCarteira = carteira.getCarteira();

        List<Caixa> caixas = new ArrayList<>();
        int totalDistribuido = 0;

        // Distribuir do maior valor para o menor (ordem decrescente)
        for (int i = dinSizes.length - 1; i >= 0; i--) {
            int valorNota = dinSizes[i];

            while (totalDistribuido + valorNota <= totalCarteira) {
                boolean alocada = false;

                for (Caixa caixa : caixas) {
                    if (caixa.podeReceber(valorNota, totalCarteira)) {
                        caixa.receber(valorNota);
                        totalDistribuido += valorNota;
                        alocada = true;
                        break;
                    }
                }

                if (!alocada) {
                    Caixa nova = new Caixa();
                    nova.receber(valorNota);
                    caixas.add(nova);
                    totalDistribuido += valorNota;
                }
            }
        }

        return caixas.size(); // retorna quantas caixas foram necessárias
    }

    public static void main(String[] args) {
        Exercicio2 exec = new Exercicio2();
        Carteira carteira = new Carteira();

        int qtdCaixas = exec.distribuirValor(carteira);
        System.out.println("Quantidade de caixas usadas: " + qtdCaixas);
    }
}
