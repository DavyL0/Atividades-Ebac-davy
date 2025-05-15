package org.lopes;

import java.util.Queue;

public class Fila {
    Queue<String> fila = new <String>;

    public void inserir(String nome) {
        fila.add(nome);
    }

    public String remover() {
        return fila.remove();
    }

    public String primeiro() {
        return fila.peek();
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public String ultimo() {
        return fila.element();
    }

}
