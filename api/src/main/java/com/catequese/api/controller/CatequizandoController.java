package com.catequese.api.controller;

import com.catequese.api.model.dto.CatequizandoDto;
import com.catequese.api.service.CatequizandoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CatequizandoController {
    private final CatequizandoService catequizandoService;

    @PostMapping("/cadastroCatequizando")
    public ResponseEntity<?> cadastroCatequizando(@RequestBody CatequizandoDto dto){
        return ResponseEntity.ok().body(catequizandoService.cadastroCatequizando(dto));
    }
}
