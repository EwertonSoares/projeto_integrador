package com.projetodonation.controller;

import com.projetodonation.controller.request.UsuarioRequest;
import com.projetodonation.model.Usuario;
import com.projetodonation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/doacoes")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<String> logar(@Valid @RequestBody UsuarioRequest usuarioRequest) {

        if(!loginService.logar(buildUsuario(usuarioRequest))){
            return ResponseEntity.notFound().build();
        }

       return ResponseEntity.ok("Usuario logado com sucesso");

    }

    private static Usuario buildUsuario(UsuarioRequest usuarioRequest) {
        return Usuario.builder()
                .login(usuarioRequest.getLogin())
                .senha(usuarioRequest.getSenha())
                .build();
    }
}