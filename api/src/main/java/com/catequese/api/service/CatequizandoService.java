package com.catequese.api.service;

import com.catequese.api.model.Catequizando;
import com.catequese.api.model.dto.CatequizandoDto;
import com.catequese.api.repository.CatequizandoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CatequizandoService {
    private final CatequizandoRepository catequizandoRepository;

    public CatequizandoDto cadastroCatequizando(CatequizandoDto dto){
        Catequizando catequizando = new Catequizando();
        catequizando.setNome(dto.getNome());
        catequizando.setNascimento(dto.getNascimento());
        catequizando.setTelefone(dto.getTelefone());
        catequizandoRepository.save(catequizando);
        return new CatequizandoDto(catequizando);
    }

}
