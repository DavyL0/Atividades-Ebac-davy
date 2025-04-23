package com.dlopes.crud.controller;

import com.dlopes.crud.model.Produto;
import com.dlopes.crud.repositories.IProductRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project: crud
 * Package: com.dlopes.crud.controller
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 22/04/2025
 * Time: 17:12
 * <p>
 */
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    IProductRepository productRepository;

    @GetMapping
    public ResponseEntity getAll() {
        List<Produto> listProducts = productRepository.findAll();
        return ResponseEntity.ok(listProducts) ;
    }
}
