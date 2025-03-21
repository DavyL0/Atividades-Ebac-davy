package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.domain.Produto;

/**
 * Project: md32
 * Package: org.example.dao
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 20/03/2025
 * Time: 15:53
 * <p>
 */
public class ProdutoDao implements IProdutoDao {
    @Override
    public Produto cadastrarProduto(Produto produto) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("md32");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
        return produto;
    }
}
