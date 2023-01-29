package com.projetodonation.model;

import lombok.*;

@Builder
@Getter
@Setter
@Data
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
