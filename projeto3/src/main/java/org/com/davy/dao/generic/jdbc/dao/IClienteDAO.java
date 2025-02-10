package org.com.davy.dao.generic.jdbc.dao;

import org.com.davy.domain.Cliente;

import java.util.List;

/**
 * Project: projeto3
 * Package: org.com.davy.dao.generic.jdbc.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/02/2025
 * Time: 13:12
 * <p>
 */public interface IClienteDAO   {

     public Integer cadastrar(Cliente cliente) throws Exception;
     public Integer atualizar(Cliente cliente) throws Exception;
     public Cliente buscar(String codigo) throws Exception;
     public List<Cliente> listar() throws Exception;
     public Integer excluir(Cliente cliente) throws Exception;
}
