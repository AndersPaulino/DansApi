package com.dansapi.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false, unique = true)
    private Long id;
    @Getter @Setter
    @Column(name = "ativo", nullable = false)
    private boolean ativo;
    @Getter @Setter
    @Column(name = "registro", nullable = false)
    private LocalDateTime registro;
    @Getter @Setter
    @Column(name = "atualizar")
    private LocalDateTime atualizar;

    @PrePersist
    void prePersist(){
        this.registro = LocalDateTime.now();
        this.ativo = true;
    }
    @PreUpdate
    void preUpdate(){
        this.atualizar = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public LocalDateTime getRegistro() {
        return registro;
    }

    public LocalDateTime getAtualizar() {
        return atualizar;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setRegistro(LocalDateTime registro) {
        this.registro = registro;
    }

    public void setAtualizar(LocalDateTime atualizar) {
        this.atualizar = atualizar;
    }
}
