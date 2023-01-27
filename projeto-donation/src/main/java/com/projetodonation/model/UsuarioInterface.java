package com.projetodonation.model;

import java.util.List;

public interface UsuarioInterface {
    List<Object> buscarDoacoes();
    Object buscarDoacaoPorId();

}
