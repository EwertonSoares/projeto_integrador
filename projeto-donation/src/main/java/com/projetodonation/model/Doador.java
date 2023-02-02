package com.projetodonation.model;

import lombok.*;

import java.util.List;
@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doador implements UsuarioInterface {
    private String foto;

    @Override
    public List<Doacao> buscarDoacoes() {
        return null;
    }
    @Override
    public Doacao buscarDoacaoPorId() {
        return null;
    }
}
