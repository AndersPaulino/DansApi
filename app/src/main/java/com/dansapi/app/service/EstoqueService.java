package com.dansapi.app.service;

import com.dansapi.app.dto.EstoqueDTO;
import com.dansapi.app.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EstoqueService {
    private EstoqueRepository estoqueRepository;

    @Autowired
    public EstoqueService(EstoqueRepository estoqueRepository){
        this.estoqueRepository = estoqueRepository;
    }

    @Transactional(readOnly = true)
    public Optional<EstoqueDTO> findById(Long id){
        return estoqueRepository.findById(id).map(EstoqueDTO::new);
    }
}
