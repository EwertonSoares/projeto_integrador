package com.projetodonation.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projeto-donation")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoacaoController {

    @RequestMapping("/doacoes")
    public String buscarDoacoes() {
        return "Todas as Doações";
    }

    @RequestMapping("doacao/id")
    public String buscarDoacaoPorId() {
        return "Doação única.";
    }
<<<<<<< Updated upstream
    //teste
=======

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


>>>>>>> Stashed changes

}
