package com.projetodonation.repository;



import com.projetodonation.model.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao, Long> {

    public List<Doacao> findDoacaoByCategoriaTipoContainingIgnoreCase(@Param("categoria")String categoria);

}
