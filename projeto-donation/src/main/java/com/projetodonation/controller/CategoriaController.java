package com.projetodonation.controller;


import com.projetodonation.model.Categoria;
import com.projetodonation.repository.CategoriaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

                                //metodo para listar todas as categorias
    @GetMapping
    public ResponseEntity<List<Categoria>> getAll(){
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

                                //metodo para adicionar categorias
    @PostMapping
    public ResponseEntity<Categoria> post(@Valid @RequestBody Categoria categoria){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(categoriaRepository.save(categoria));
    }

    @GetMapping("/{tipo}")
    public ResponseEntity<Categoria> getAllByTipo(@PathVariable String tipo){
        return ResponseEntity.ok(categoriaRepository.findAllByTipoContainingIgnoreCase(tipo));
    }
    @PutMapping
    public  ResponseEntity<Categoria>put(@Valid @RequestBody Categoria categoria){
        return categoriaRepository.findById(categoria.getId())
                .map(resposta -> ResponseEntity.status(HttpStatus.OK)
                        .body(categoriaRepository.save(categoria)))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        if(categoria.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        categoriaRepository.deleteById(id);
    }

}
