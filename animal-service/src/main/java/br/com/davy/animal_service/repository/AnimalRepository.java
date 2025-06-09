package br.com.davy.animal_service.repository;

import br.com.davy.animal_service.entities.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao is NULL ORDER BY a.dataAdocao DESC")
    List<Animal> findDataAdocao();

    @Query("SELECT a FROM Animal a WHERE a.nomeRecebedor is NOT NULL ORDER BY a.nomeRecebedor DESC")
    List<Animal>findRecebedor();
}
