package org.davy.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.davy.domain.Acessorio;

/**
 * Project: md33
 * Package: org.davy.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 28/03/2025
 * Time: 17:59
 * <p>
 */
public class AcessorioDao implements IAcessorioDao {
    @Override
    public Acessorio cadastrarAcessorio(Acessorio acessorio) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("md32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(acessorio);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return acessorio;
    }


}
