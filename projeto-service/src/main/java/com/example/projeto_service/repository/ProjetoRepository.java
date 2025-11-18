package com.example.projeto_service.repository;

import com.example.projeto_service.domain.projeto.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}