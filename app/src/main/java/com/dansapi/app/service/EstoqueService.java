package com.dansapi.app.service;

import com.dansapi.app.dto.EstoqueDTO;
import com.dansapi.app.entity.Estoque;
import com.dansapi.app.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
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

    @Transactional(readOnly = true)
    public List<EstoqueDTO> findByAtivo(boolean ativo){
        List<Estoque> estoques = estoqueRepository.findByAtivo(ativo);
        return estoques.stream()
                .map(EstoqueDTO::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public List<EstoqueDTO> findByDiaRegistro(LocalDate registro){
        List<Estoque> estoques = estoqueRepository.findByDiaRegistro(registro);
        return estoques.stream()
                .map(EstoqueDTO::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public List<EstoqueDTO> findByDiaAtualizar(LocalDate atualizar){
        List<Estoque> estoques = estoqueRepository.findByDiaAtualizar(atualizar);
        return estoques.stream()
                .map(EstoqueDTO::new)
                .toList();
    }

    public void validarEstoque(final Estoque estoque){
        String nomeEstoque = estoque.getNomeEstoque();

        if (nomeEstoque == null || nomeEstoque.isEmpty()){
            throw new IllegalArgumentException("Nome do Estoque não informado!");
        }

        if (!nomeEstoque.matches("[a-zA-Z0-9 ]+")){
            throw new IllegalArgumentException("Nome do EStoque inválido!");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    public void cadastrar(Estoque estoque){
        validarEstoque(estoque);
        estoqueRepository.save(estoque);
    }
}
