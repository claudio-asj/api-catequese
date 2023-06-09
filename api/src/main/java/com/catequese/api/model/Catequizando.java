package com.catequese.api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name="catequizando")
public class Catequizando {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String nascimento;
    private String telefone;

    @ManyToMany
    @JoinTable(
            name = "turma",
            joinColumns = @JoinColumn(name = "catequizando_id"),
            inverseJoinColumns = @JoinColumn(name = "turma_id")
    )
    private List<Turma> turmas;

    public Catequizando() {

    }
    public Catequizando(Long id) {
        this.id = id;
    }
}
