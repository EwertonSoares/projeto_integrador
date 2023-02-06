package com.projetodonation.controller;


import com.projetodonation.model.Doacao;
import com.projetodonation.repository.DoacaoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doacoes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoacaoController {

    @Autowired
    private DoacaoRepository doacaoRepository;

    @GetMapping
    public ResponseEntity<List<Doacao>> getAll () {
        return ResponseEntity.ok(doacaoRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doacao> buscarDoacaoPorId(@PathVariable Long id) {
        return doacaoRepository.findById(id)
                .map(reposta -> ResponseEntity.ok(reposta))
                .orElse (ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @GetMapping("/categoria/{categoria}")
    public ResponseEntity<List<Doacao>>getByCategoria(@PathVariable String categoria){
        return ResponseEntity.ok(doacaoRepository.findDoacaoByCategoriaTipoContainingIgnoreCase(categoria));
    }

    @PostMapping
    public ResponseEntity<Doacao> postDoacao(@Valid @RequestBody Doacao doacao) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(doacaoRepository.save(doacao));
    }

    @PutMapping
    public ResponseEntity <Doacao> putDoacao (@Valid @RequestBody Doacao doacao) {
        return doacaoRepository.findById(doacao.getId())
                .map(resposta -> ResponseEntity.status(HttpStatus.OK)
                        .body(doacaoRepository.save(doacao)))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND). build());
    }

    @ResponseStatus (HttpStatus.NO_CONTENT)
    @DeleteMapping ("/{id}")
    public void deleteDoacao (@PathVariable Long id) {
        Optional <Doacao> doacao = doacaoRepository.findById(id);

        if (doacao.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        doacaoRepository.deleteById(id);
    }



}


