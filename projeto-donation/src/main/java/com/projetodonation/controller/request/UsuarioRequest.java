package com.projetodonation.controller.request;

import lombok.*;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioRequest {
    private String login;
    private String senha;
}
