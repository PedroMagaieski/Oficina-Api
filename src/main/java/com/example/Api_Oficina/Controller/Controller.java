package com.example.Api_Oficina.Controller;

import com.example.Api_Oficina.Dto.Dto;
import com.example.Api_Oficina.Model.Model;
import com.example.Api_Oficina.Repository.EstoqueRepository;
import com.example.Api_Oficina.Service.EstoqueService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/estoque")
public class Controller {
    @Autowired
    private final EstoqueService estoqueService;
    @Autowired
    private EstoqueRepository estoqueRepository;

    public Controller(EstoqueService estoqueService){this.estoqueService = estoqueService;}

    @PostMapping
    public ResponseEntity<Object> saveEstoque (@RequestBody @Valid Dto EstoqueDto){
        var estoqueModel = new Model();
        BeanUtils.copyProperties(EstoqueDto, estoqueModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(estoqueService.save(estoqueModel));
    }
    @GetMapping
    public ResponseEntity<Object> getAllEstoque(@PageableDefault(page=0,size=10,sort = "Id",direction = Sort.Direction.ASC)Pageable pageable){
        return ResponseEntity.status(HttpStatus.OK).body(estoqueService.findAll(pageable));
    }
    @GetMapping("{Id}")
    public ResponseEntity<Object> getEstoqueById(@PathVariable(value = "Id") UUID Id){
        Optional<Model> optionalModel = estoqueService.findById(Id);
        if(!optionalModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estoque nao encontrado");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalModel.get());
    }
    @DeleteMapping("{Id}")
    public ResponseEntity<Object> deleteEstoque(@PathVariable(value = "Id") UUID Id){
        Optional<Model> optionalModel = estoqueService.findById(Id);
        if(!optionalModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estoque nao encontrado");
        }
        estoqueService.delete(optionalModel.get());
        return ResponseEntity.status(HttpStatus.OK).body("Deletado com sucesso");
    }
    @PutMapping("{Id}")
    public ResponseEntity<Object> putEstoque(@PathVariable(value = "Id") UUID Id, @RequestBody @Valid Dto estoqueDto){
        Optional<Model> optionalModel = estoqueService.findById(Id);
        if(!optionalModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estoque nao encontrado");
        }
        var estoqueModel = new Model();
        BeanUtils.copyProperties(estoqueDto, estoqueModel);
        estoqueModel.setId(optionalModel.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(estoqueService.save(estoqueModel));
    }


}
