package com.br.fiap.vacinas.repository;

import com.br.fiap.vacinas.model.Vacinas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<Vacinas, Long> {


}
