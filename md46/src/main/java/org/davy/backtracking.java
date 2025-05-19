package org.davy;

/**
 * Project: md46
 * Package: org.davy
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 19/05/2025
 * Time: 09:33
 * <p>
 */
public class backtracking {


    private static boolean temAtaque(int x, int y, int[][] tab) {
        //checando linhas e colunas
        for (int i = 0; i < tab.length; i++) {
            if(tab[x][i] == 1){
                return true;
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if(tab[i][y] == 1){
                return true;
            }
        }

        //checando diagonais
        for (int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++){
                int indEsq = i + j;
                int indDy = i - j;

                if(indEsq == (x + y)){
                    if(tab[i][j]== 1){
                        return true;
                    }
                }

                if(indDy == (x - y)){
                    if(tab[i][j]== 1){
                        return true;
                    }
                }

            }
        }
        return false;
    }

    private static void imprimir(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean resolveNRainhas(int[][] tab, int i) {
        if(i == 0){
           return true;
        }

        for (int j = 0; j < tab.length; j++) {
            for (int k = 0; k < tab.length; k++) {
                if(temAtaque(j, i, tab)){
                    continue;
                }
                //colocando rainha no tabuleiro
                tab[j][k] = 1;

                if(resolveNRainhas(tab, i-1)){
                    return true;
                }
                // solução não foi encontrada tirando a mudança
                tab[j][k] = 0;

            }
        }
        return false;
    }


}
