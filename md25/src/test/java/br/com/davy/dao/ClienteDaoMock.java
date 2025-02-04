package br.com.davy.dao;

import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;

/**
 * Project: md25
 * Package: br.com.davy.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 04/02/2025
 * Time: 07:54
 * <p>
 */
public class ClienteDaoMock implements IClienteDAO {
    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }
}
