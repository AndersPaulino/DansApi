package com.dansapi.app.dto;

import com.dansapi.app.entity.Tipo;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter @Setter
public class TipoDTO {
    private Long id;
    private boolean ativo;
    private LocalDateTime registro;
    private LocalDateTime atualizar;
    private String nomeTipo;

    public TipoDTO(Tipo tipo){
        id = tipo.getId();
        ativo = tipo.isAtivo();
        registro = tipo.getRegistro();
        atualizar = tipo.getAtualizar();
        nomeTipo = tipo.getNomeTipo();
    }

    public TipoDTO(Long id, boolean ativo, LocalDateTime registro, LocalDateTime atualizar, String nomeTipo){
        this.id = id;
        this.ativo = ativo;
        this.registro = registro;
        this.atualizar = atualizar;
        this.nomeTipo = nomeTipo;
    }

}
