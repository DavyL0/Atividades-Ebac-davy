package org.lopes;

import java.util.Map;

public class HashMap {
    Map<String, String> map = new <String, String>();

    public void inserir(String chave, String valor) {
        map.put(chave, valor);
    }

    public String buscar(String chave) {
        return map.get(chave);
    }

    public void remover(String chave) {
        map.remove(chave);
    }
    public boolean estaVazia() {
        return map.isEmpty();
    }
}
