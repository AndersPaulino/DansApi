package com.dansapi.app.dto;

import com.dansapi.app.entity.Produto;
import com.dansapi.app.entity.Tipo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class ProdutoDTO {
    private Long id;
    private boolean ativo;
    private LocalDateTime registro;
    private LocalDateTime atualizar;
    private String nome;
    private String descricao;
    private String codigo;
    private Tipo tipo;

    public ProdutoDTO(Produto produto){
        id = produto.getId();
        ativo = produto.isAtivo();
        registro = produto.getRegistro();
        atualizar = produto.getAtualizar();
        nome = produto.getNomeProduto();
        descricao = produto.getDescricao();
        tipo = produto.getTipo();
    }

    public ProdutoDTO(Long id, boolean ativo, LocalDateTime registro, LocalDateTime atualizar, String nome, String descricao, Tipo tipo){
        this.id = id;
        this.ativo = ativo;
        this.registro = registro;
        this.atualizar = atualizar;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }
}
