package com.example.testes_service.controller;

import com.example.testes_service.domain.teste.Teste;
import com.example.testes_service.service.TesteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/testes")
public class TesteController {

    private final TesteService service;

    public TesteController(TesteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Teste> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Teste save(@RequestBody Teste t) {
        return service.save(t);
    }

    @GetMapping("/{id}")
    public Teste findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }
}