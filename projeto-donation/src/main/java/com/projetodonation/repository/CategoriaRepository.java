package com.projetodonation.repository;

import com.projetodonation.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long> {




}
