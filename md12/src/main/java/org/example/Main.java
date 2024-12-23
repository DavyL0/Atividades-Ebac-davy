package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome dos usuarios com genero");
        String nomeG = sc.nextLine();
        String[] namesG = nomeG.split(",");

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (String name : namesG) {
            if(name.endsWith("- M")) {
                homens.add(name.replace("- M", ""));
            }else if (name.endsWith("- F")){
                mulheres.add(name.replace("- F", ""));
            }
        }
        System.out.println("Lista de homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }
        System.out.println("Lista de mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }
    }
}