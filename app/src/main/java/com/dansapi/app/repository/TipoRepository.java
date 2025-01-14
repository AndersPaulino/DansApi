package com.dansapi.app.repository;

import com.dansapi.app.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoRepository extends JpaRepository<Long, Tipo> {
}
