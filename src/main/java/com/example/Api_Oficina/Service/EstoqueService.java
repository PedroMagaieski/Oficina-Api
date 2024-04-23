package com.example.Api_Oficina.Service;

import com.example.Api_Oficina.Model.Model;
import com.example.Api_Oficina.Repository.EstoqueRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class EstoqueService {
    final EstoqueRepository estoqueRepository;
    public EstoqueService(EstoqueRepository estoqueRepository) {this.estoqueRepository = estoqueRepository;}
    @Transactional
    public Model save(Model estoqueModel){return estoqueRepository.save(estoqueModel);}

    public Page<Model> findAll(Pageable pageable) {return estoqueRepository.findAll(pageable);}

    public Optional<Model> findById(UUID id){return estoqueRepository.findById(id);}
    @Transactional
    public void delete(Model estoqueModel){estoqueRepository.delete(estoqueModel);}
}
