package com.example.testes_service.service;

import com.example.testes_service.domain.teste.Teste;
import com.example.testes_service.repository.TesteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TesteService {

    private final TesteRepository repository;

    public TesteService(TesteRepository repository) {
        this.repository = repository;
    }

    public List<Teste> findAll() {
        return repository.findAll();
    }

    public Teste save(Teste t) {
        return repository.save(t);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public Teste findById(UUID id) {
        return repository.findById(id).orElse(null);
    }
}