package com.projetodonation.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@Data
public class Doacao {

    private LocalDate dataDoacao;
    private BigDecimal valor;
    private String descricao;
    private String foto;
    private String tipo;
    private boolean presivel;

}
