package org.example.dao;

import org.example.domain.Cliente;

/**
 * Project: md25
 * Package: org.example.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 04/02/2025
 * Time: 07:46
 * <p>
 */
public interface IClienteDAO {
    Boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente);
}
