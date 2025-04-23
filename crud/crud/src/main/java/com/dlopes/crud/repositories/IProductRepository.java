package com.dlopes.crud.repositories;

import com.dlopes.crud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project: crud
 * Package: com.dlopes.crud.repositories
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 22/04/2025
 * Time: 17:08
 * <p>
 */
public interface IProductRepository extends JpaRepository<Produto, Integer> {

}
