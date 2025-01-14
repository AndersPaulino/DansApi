package com.dansapi.app.repository;

import com.dansapi.app.entity.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Long, Movimentacao> {
}
