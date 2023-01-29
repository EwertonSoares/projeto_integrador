package com.projetodonation.service.impl;

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
    public boolean logar(Usuario usuario) {
        Optional<UsuarioEntity> usuarioEncontrado = repository
                .findByloginAndSenha(usuario.getLogin(), usuario.getSenha());

        return usuarioEncontrado.isPresent();
    }
}