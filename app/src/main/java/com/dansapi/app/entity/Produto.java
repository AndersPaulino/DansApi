package com.dansapi.app.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_produto", schema = "public")
public class Produto extends AbstractEntity{
    @Getter @Setter
    @Column(name = "cl_nome_produto", nullable = false, length = 50)
    private String nomeProduto;

    @Getter @Setter
    @ManyToOne
    @JoinColumn(name = "cl_tipo_id")
    private Tipo tipo;

    @Getter @Setter
    @Column(name = "cl_descricao", nullable = false, length = 255)
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
