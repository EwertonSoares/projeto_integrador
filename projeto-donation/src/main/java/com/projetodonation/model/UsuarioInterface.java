package com.projetodonation.model;

import java.util.List;

public interface UsuarioInterface {
    List<Doacao> buscarDoacoes();
    Doacao buscarDoacaoPorId();

}
