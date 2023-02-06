package com.projetodonation.repository;

import com.projetodonation.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {
     Categoria findAllByTipoContainingIgnoreCase(@Param("tipo") String tipo);
}
