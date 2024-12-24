package org.davy.dao;

import org.davy.domain.Cliente;

import java.util.*;

public class ClienteSetDAO implements IClienteDAO{
    private Set<Cliente> set;

    public  ClienteSetDAO(){
        this.set = new HashSet<>();
    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = null;
        for (Cliente cliente : this.set) {
            if(cliente.getCpf().equals(cpf)){
                clienteCadastrado = cliente;
                break;
            }
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        if(this.set.contains(cliente)){
            for (Cliente clienteCadastrado : this.set){
                clienteCadastrado.setNome(clienteCadastrado.getNome());
                clienteCadastrado.setCidade(clienteCadastrado.getCidade());
                clienteCadastrado.setEnd(clienteCadastrado.getEnd());
                clienteCadastrado.setEstado(clienteCadastrado.getEstado());
                clienteCadastrado.setNumero(clienteCadastrado.getNumero());
                clienteCadastrado.setTel(clienteCadastrado.getTel());
                break;
            }

        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente clienteCadastrado : this.set){
            if(clienteCadastrado.getCpf().equals(cpf)){
                return clienteCadastrado;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteSetDAO that = (ClienteSetDAO) o;
        return Objects.equals(set, that.set);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(set);
    }
}
