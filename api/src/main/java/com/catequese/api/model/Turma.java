package com.catequese.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "turma")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @OneToMany
    @JoinColumn(name = "cateuizando_id")
    private List<Catequizando> catequizandos;
    @OneToMany
    @JoinColumn(name = "catequista_id")
    private List<Catequista> catequistas;


}
