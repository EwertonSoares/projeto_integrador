package com.projetodonation.repository.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_doacao")
public class DoacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "data_doacao")
    @Convert(converter = Jsr310JpaConverters.LocalDateTimeConverter.class)
    private LocalDateTime dataDoacao;
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "foto")
    private String foto;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private UsuarioEntity usuario;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaEntity categoria;

}
