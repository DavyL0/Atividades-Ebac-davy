package org.davy.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.davy.domain.Marca;

/**
 * Project: md33
 * Package: org.davy.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 28/03/2025
 * Time: 18:00
 * <p>
 */
public class MarcaDao implements IMarcaDao{
    @Override
    public Marca cadastrarMarca(Marca marca) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("md32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(marca);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return marca;
    }
}
