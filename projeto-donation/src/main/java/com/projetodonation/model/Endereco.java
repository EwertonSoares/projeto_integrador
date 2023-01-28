package com.projetodonation.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Data
public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;
    
}
