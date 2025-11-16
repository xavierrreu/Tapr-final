package com.example.testes_service.repository;

import com.example.testes_service.domain.teste.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TesteRepository extends JpaRepository<Teste, UUID> {
}