package org.example.dao;

import org.example.domain.Produto;

import java.util.List;

/**
 * Project: exemplojdbc
 * Package: org.example.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/02/2025
 * Time: 14:33
 * <p>
 */
public interface IProdutoDAO {
     public Integer cadastrar(Produto produto) throws Exception;
     public Produto consultar(String codigo)throws Exception;
     public Integer alterar(Produto produto)throws Exception;
     public Integer excluir(Produto produto)throws Exception;
     public List<Produto> listar()throws Exception;

}
