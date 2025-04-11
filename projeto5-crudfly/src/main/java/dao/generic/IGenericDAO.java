package dao.generic;

import domain.Persistente;

import java.io.Serializable;
import java.util.Collection;

/**
 * Project: projeto5-crudfly
 * Package: dao.generic
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/04/2025
 * Time: 09:12
 * <p>
 */
public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    /**
     * Método para cadastrar novos registro no banco de dados
     */
    public T cadastrar(T entity);

    /**
     * Método para excluir um registro do banco de dados
     */
    public void excluir(T entity);

    /**
     *Método para alterar um registro no bando de dados.
     */
    public T alterar(T entity);

    /**
     * Método para consultar um registro no banco de dados
     */
    public T consultar(E id);

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     */
    public Collection<T> buscarTodos();
}
