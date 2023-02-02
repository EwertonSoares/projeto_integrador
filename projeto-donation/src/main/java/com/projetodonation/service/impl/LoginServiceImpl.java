package com.projetodonation.service.impl;

import com.projetodonation.controller.response.UsuarioResponse;
import com.projetodonation.exceptions.NotFoundException;
import com.projetodonation.model.Usuario;
import com.projetodonation.repository.LoginRepository;
import com.projetodonation.repository.entities.UsuarioEntity;
import com.projetodonation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginRepository repository;
    @Override
    public UsuarioResponse logar(Usuario usuario) throws NotFoundException {
        Optional<UsuarioEntity> usuarioEncontrado = repository
                .findByloginAndSenha(usuario.getLogin(), usuario.getSenha());

        if(usuarioEncontrado.isEmpty()) {
            throw new NotFoundException("Usuario não foi encontrado");
        }

        return UsuarioResponse.builder()
                .login(usuarioEncontrado.get().getLogin())
                .build();
    }
}