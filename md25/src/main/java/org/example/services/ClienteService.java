package org.example.services;

import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;

/**
 * Project: md25
 * Package: org.example.services
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 04/02/2025
 * Time: 07:41
 * <p>
 */
public class ClienteService implements IClienteService {
   private IClienteDAO clienteDAO;

   public ClienteService(IClienteDAO clienteDAO) {
       this.clienteDAO = clienteDAO;
   }
    @Override
    public boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }


}
