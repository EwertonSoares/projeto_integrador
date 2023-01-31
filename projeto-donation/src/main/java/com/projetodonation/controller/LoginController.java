package com.projetodonation.controller;

import com.projetodonation.controller.request.UsuarioRequest;
import com.projetodonation.controller.response.UsuarioResponse;
import com.projetodonation.exceptions.NotFoundException;
import com.projetodonation.model.Usuario;
import com.projetodonation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/projeto-donation")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<UsuarioResponse> logar(@Validated @RequestBody UsuarioRequest usuarioRequest) throws NotFoundException {

        UsuarioResponse usuario = loginService.logar(buildUsuario(usuarioRequest));
        usuario.setMensagem("Usuário logado com sucesso");

        return ResponseEntity.ok().body(usuario);

    }

    private static Usuario buildUsuario(UsuarioRequest usuarioRequest) {
        return Usuario.builder()
                .login(usuarioRequest.getLogin())
                .senha(usuarioRequest.getSenha())
                .build();
    }
}
