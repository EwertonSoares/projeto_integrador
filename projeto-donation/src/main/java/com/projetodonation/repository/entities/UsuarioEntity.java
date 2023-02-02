package com.projetodonation.repository.entities;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "ultimo_nome")
    private String ultimoNome;
    @Column(name = "documento")
    private String documento;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "foto")
    private String foto;
    @Column(name = "login")
    private String login;
    @Column(name = "senha")
    private String senha;
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
    @Column(name = "atividade")
    private String atividade;
}
