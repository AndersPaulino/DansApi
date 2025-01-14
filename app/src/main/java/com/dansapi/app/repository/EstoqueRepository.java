package com.dansapi.app.repository;

import com.dansapi.app.entity.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Long, Estoque> {
}
