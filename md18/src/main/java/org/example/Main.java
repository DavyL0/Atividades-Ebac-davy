package org.example;

import java.lang.annotation.RetentionPolicy;

@Anotation(value = 79, names = {"Davyzão mil grau"},
            value2 = {RetentionPolicy.RUNTIME},
            value3 = {RetentionPolicy.RUNTIME})
public class Main {
    public static void main(String[] args) {
        String nome = null;

        try {
            System.out.println(nome);
        }catch (Exception e){
            System.out.println("não tem nome ");
        }
    }
}