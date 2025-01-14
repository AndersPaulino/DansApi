package com.dansapi.app.service;

import com.dansapi.app.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoService {
    private TipoRepository tipoRepository;

    @Autowired
    public TipoService(TipoRepository tipoRepository){
        this.tipoRepository = tipoRepository;
    }
}
