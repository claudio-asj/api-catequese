package com.catequese.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Catequista {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String telefone;
    private String endereco;
    private String localSacramento;
    private String dataSacramento;

    @ManyToMany
    @JoinTable(
            name = "turma",
            joinColumns = @JoinColumn(name = "catequista_id"),
            inverseJoinColumns = @JoinColumn(name = "turma_id")
    )
    private List<Turma> turmas;
}
