package br.com.davy.animal_service.controller;

import br.com.davy.animal_service.entities.Animal;
import br.com.davy.animal_service.repository.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository animalRepository;

    public AnimalController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/todos")
    private List<Animal> findAll(){
        return animalRepository.findAll();
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return animalRepository.findDataAdocao();
    }

    @GetMapping("/recebedor")
    private List<Animal> findRecebedor(){ return animalRepository.findRecebedor();}
    
    @PostMapping("/adicionar")
    private Animal create(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }

    @PutMapping("/editar")
    private Animal update(@RequestBody Animal animal){
        return animalRepository.save(animal);
    }

    @DeleteMapping("/deletar")
    private void delete(@RequestBody Animal animal){
        animalRepository.delete(animal);
    }
}
