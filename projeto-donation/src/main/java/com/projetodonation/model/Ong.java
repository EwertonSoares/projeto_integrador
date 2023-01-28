package com.projetodonation.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Builder
@Getter
@Setter
@Data
public class Ong implements UsuarioInterface {
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
