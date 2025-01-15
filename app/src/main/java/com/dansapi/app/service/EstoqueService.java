package com.dansapi.app.service;

import com.dansapi.app.dto.EstoqueDTO;
import com.dansapi.app.entity.Estoque;
import com.dansapi.app.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    @Transactional(readOnly = true)
    public List<EstoqueDTO> findAll(){
        List<Estoque> estoques = estoqueRepository.findAll();
        return estoques.stream().map(EstoqueDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public EstoqueDTO findByNomeEstoque(String nomeEstoque){
        Estoque estoque = estoqueRepository.findByNomeEstoque(nomeEstoque);
        return new EstoqueDTO(estoque);
    }

}
