package com.projetodonation.model;

import lombok.*;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;
    
}
