package com.dansapi.app.repository;

import com.dansapi.app.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    @Query("SELECT e FROM Produto e WHERE e.nomeProduto = :nomeProduto")
    public Produto findByNomeProduto(@Param("nome") String nomeProduto);

    @Query("SELECT e FROM Produto e WHERE e.ativo = :ativo")
    public List<Produto> findByAtivo(@Param("ativo")boolean ativo);

    @Query("SELECT e FROM Produto e WHERE DATE(e.registro) = :registro")
    List<Produto> findByDiaRegistro(@Param("registro") LocalDate registro);

    @Query("SELECT e FROM Produto e WHERE DATE(e.atualizar) = :atualizar")
    List<Produto> findByDiaAtualizar(@Param("atualizar") LocalDate atualizar);
}
