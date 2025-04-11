package dao.generic;

import domain.Persistente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Project: projeto5-crudfly
 * Package: dao.generic
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 10/04/2025
 * Time: 09:11
 * <p>
 */
public class GenericDAO <T extends Persistente, E extends Serializable> implements IGenericDAO<T, E> {

    protected Class<T> persistentClass;

    @PersistenceContext
    protected EntityManager em;

    public GenericDAO(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    @Override
    public T cadastrar(T entity) {
       em.persist(entity);
       return entity;
    }

    @Override
    public void excluir(T entity) {
        if(em.contains(entity)) {
            em.remove(entity);
        }else {
            T managedEntity = em.find(this.persistentClass, entity.getId());
            if(managedEntity != null) {
                em.remove(managedEntity);
            }
        }

    }

    @Override
    public T alterar(T entity) {
        em.merge(entity);
        return entity;
    }

    @Override
    public T consultar(E id) {
        T entity = em.find(this.persistentClass, id);
        return entity;
    }

    @Override
    public Collection<T> buscarTodos() {
        List<T> list = em.createQuery(getSelectSql(), this.persistentClass).getResultList();
        return list;
    }

    private String getSelectSql(){
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT obj FROM ");
        sb.append(persistentClass.getSimpleName());
        sb.append(" obj");
        return sb.toString();
    }
}
