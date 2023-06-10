package com.catequese.api.repository;

import com.catequese.api.model.Catequizando;
import com.catequese.api.model.dto.CatequizandoDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatequizandoRepository extends JpaRepository<Catequizando, Long> {

}
