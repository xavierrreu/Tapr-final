package com.example.projeto_service.controller;

import com.example.projeto_service.domain.projeto.Projeto;
import com.example.projeto_service.service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService service;

    public ProjetoController(ProjetoService service) {
        this.service = service;
    }

    @PostMapping
    public Projeto save(@RequestBody Projeto projeto) {
        return service.save(projeto);
    }

    @GetMapping
    public List<Projeto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Projeto findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}