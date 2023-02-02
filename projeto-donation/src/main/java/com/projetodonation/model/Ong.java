package com.projetodonation.model;

import lombok.*;

import java.util.List;
@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ong implements UsuarioInterface {
    private String atividade;

    @Override
    public List<Doacao> buscarDoacoes() {
        return null;
    }

    @Override
    public Doacao buscarDoacaoPorId() {
        return null;
    }
}
