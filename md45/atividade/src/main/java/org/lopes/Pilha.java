package org.lopes;

import java.util.Stack;

public class Pilha {

    Stack<String> pilha = new Stack<>();

    public void inserir(String nome) {
        pilha.push(nome);
    }

    public String delete(){
        return pilha.pop();
    }

    public String top(){
        return pilha.peek();
    }
}
