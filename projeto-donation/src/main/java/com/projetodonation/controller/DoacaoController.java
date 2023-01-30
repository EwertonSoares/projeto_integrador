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
    //teste

}
