package com.projetodonation.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doacao {

    private LocalDate dataDoacao;
    private BigDecimal valor;
    private String descricao;
    private String foto;
    private String tipo;
    private boolean presivel;

}
