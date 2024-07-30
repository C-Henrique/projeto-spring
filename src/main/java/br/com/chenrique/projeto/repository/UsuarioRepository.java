package br.com.chenrique.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.chenrique.projeto.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
