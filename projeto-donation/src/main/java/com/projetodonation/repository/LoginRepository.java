package com.projetodonation.repository;

import com.projetodonation.repository.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> findByloginAndSenha(String login, String senha);
}
