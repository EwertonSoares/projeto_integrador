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
    public List<Object> buscarDoacoes() {
        return null;
    }
    @Override
    public Object buscarDoacaoPorId() {
        return null;
    }
}
