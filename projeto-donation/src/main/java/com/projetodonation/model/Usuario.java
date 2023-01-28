package com.projetodonation.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
public class Usuario {

    private String nome;
    private String ultimoNome;
    private String documento;
    private Endereco endereco;
    private String login;
    private String senha;
    private String tipo;

}
