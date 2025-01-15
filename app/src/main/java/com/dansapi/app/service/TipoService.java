package com.dansapi.app.service;

import com.dansapi.app.dto.TipoDTO;
import com.dansapi.app.entity.Tipo;
import com.dansapi.app.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TipoService {
    private TipoRepository tipoRepository;

    @Autowired
    public TipoService(TipoRepository tipoRepository){
        this.tipoRepository = tipoRepository;
    }

    @Transactional(readOnly = true)
    public Optional<TipoDTO> findById(Long id) {
        return tipoRepository.findById(id).map(TipoDTO::new);
    }

    @Transactional(readOnly = true)
    public List<TipoDTO> findAll(){
        List<Tipo> tipos = tipoRepository.findAll();
        return tipos.stream().map(TipoDTO::new).toList();
    }
}
