package com.example.Api_Oficina.Repository;

import com.example.Api_Oficina.Model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EstoqueRepository extends JpaRepository<Model, UUID>{
}
