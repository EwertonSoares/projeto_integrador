package com.projetodonation.service;

import com.projetodonation.controller.response.UsuarioResponse;
import com.projetodonation.exceptions.NotFoundException;
import com.projetodonation.model.Usuario;

public interface LoginService {
    UsuarioResponse logar(Usuario usuario) throws NotFoundException;
}
