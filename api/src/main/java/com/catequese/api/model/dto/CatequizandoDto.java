package com.catequese.api.model.dto;

import com.catequese.api.model.Catequizando;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class CatequizandoDto {
    private Long id;
    private String nome;
    private String nascimento;
    private String telefone;

    public CatequizandoDto(Catequizando catequizando){
        this.id = catequizando.getId();
        this.nome = catequizando.getNome();
        this.nascimento = catequizando.getNascimento();
        this.telefone = catequizando.getTelefone();
    }

}
