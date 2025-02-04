package org.example.services;

import org.example.domain.Cliente;

/**
 * Project: md25
 * Package: org.example.services
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 04/02/2025
 * Time: 07:34
 * <p>
 */
public interface IClienteService {
    boolean salvar(Cliente cliente);

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);


    void alterar(Cliente cliente);
}
