package br.com.sgf.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sgf.api.entities.GenericEntity;

public interface GenericEntityRepository extends JpaRepository<GenericEntity, Long> {
}