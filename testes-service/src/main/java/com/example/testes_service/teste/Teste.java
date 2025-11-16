package com.example.testes_service.domain.teste;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "teste")
@Getter
@Setter
@NoArgsConstructor
public class Teste {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column
    private String descricao;

}