package com.dansapi.app.repository;

import com.dansapi.app.entity.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long> {
    @Query("SELECT e FROM Tipo e WHERE e.nome= :nome")
    public Tipo findByNomeTipo(@Param("nome") String nome);
    @Query("SELECT e FROM Tipo e WHERE e.ativo = :ativo")
    public List<Tipo> findByAtivo(@Param("ativo")boolean ativo);
    @Query("SELECT e FROM Tipo e WHERE DATE(e.registro) = :registro")
    List<Tipo> findByDiaRegistro(@Param("registro") LocalDate registro);
    @Query("SELECT e FROM Tipo e WHERE DATE(e.atualizar) = :atualizar")
    List<Tipo> findByDiaAtualizar(@Param("atualizar") LocalDate atualizar);

}
