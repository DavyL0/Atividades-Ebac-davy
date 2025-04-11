package services.generic;

import dao.generic.IGenericDAO;
import domain.Persistente;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Project: projeto5-crudfly
 * Package: services.generic
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/04/2025
 * Time: 14:04
 * <p>
 */
public class GenericService<T extends Persistente, E extends Serializable> implements IGenericService<T, E> {
    protected IGenericDAO<T, E> dao;

    public GenericService(IGenericDAO<T, E> dao) {this.dao = dao;}

    @Override
    public T cadastrar(T entity) {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() {
        return this.dao.buscarTodos();
    }
}
