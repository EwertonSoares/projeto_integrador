package com.projetodonation.model;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nome;
    private String ultimoNome;
    private String documento;
    private Endereco endereco;
    private String login;
    private String senha;
    private String tipo;

}
