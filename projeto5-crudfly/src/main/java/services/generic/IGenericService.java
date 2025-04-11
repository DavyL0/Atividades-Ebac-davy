package services.generic;

import domain.Persistente;

import java.io.Serializable;
import java.util.Collection;

/**
 * Project: projeto5-crudfly
 * Package: services.generic
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 14:05
 * <p>
 */
public interface IGenericService <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity);

    /**
     * Método para excluir um registro do banco de dados
     *
     * @param entity a ser cadastrado
     */
    public void excluir(T entity) ;

    /**
     *Método para alterar um registro no bando de dados.
     *
     * @param entity a ser atualizado
     * @return retorna o objeto salvo
     */
    public T alterar(T entity) ;

    /**
     * Método para consultar um registro no banco de dados
     *
     * @param valor chave única do dado a ser consultado
     * @return
     *
     */
    public T consultar(E valor) ;

    /**
     * Método que irá retornar todos os registros do banco de dados de uma determinado dado ou tabela
     *
     * @return Registros encontrados
     *
     */
    public Collection<T> buscarTodos() ;
}
