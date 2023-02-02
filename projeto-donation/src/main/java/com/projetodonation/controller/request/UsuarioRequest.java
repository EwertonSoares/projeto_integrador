package com.projetodonation.controller.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {

    @NotBlank(message = "Login é um campo obrigatório")
    private String login;
    @NotBlank(message = "Senha é um campo obrigatório")
    private String senha;
}
