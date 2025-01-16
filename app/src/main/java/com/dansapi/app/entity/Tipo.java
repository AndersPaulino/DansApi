package com.dansapi.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_tipo",schema = "public")
public class Tipo extends AbstractEntity{
    @Getter @Setter
    @Column(name = "cl_tipo")
    private String nomeTipo;

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }
}
