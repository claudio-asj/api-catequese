package com.catequese.api.controller;

import com.catequese.api.model.dto.CatequizandoDto;
import com.catequese.api.service.CatequizandoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CatequizandoController {
    private final CatequizandoService catequizandoService;

    @PostMapping("/cadastroCatequizando")
    public ResponseEntity<?> cadastroCatequizando(@RequestBody CatequizandoDto dto){
        return ResponseEntity.ok().body(catequizandoService.cadastroCatequizando(dto));
    }

    @GetMapping("/catequizandos")
    public ResponseEntity<?> todosCatequizandos(){
        return ResponseEntity.ok().body(catequizandoService.catequizandos());
    }

    @GetMapping("/catequizandos/{id}")
    public ResponseEntity<?> getCatequizando(@PathVariable Long id){
        if (catequizandoService.getCatequizando(id).isPresent()){
            return ResponseEntity.ok().body(catequizandoService.getCatequizando(id));
        } else return ResponseEntity.ok().body("Esse catequizando não está cadastrado");
    }
}
