package org.example.dao;

import org.example.domain.Cliente;

/**
 * Project: md25
 * Package: org.example.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 04/02/2025
 * Time: 07:49
 * <p>
 */
public class ClienteDAO implements IClienteDAO {

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
