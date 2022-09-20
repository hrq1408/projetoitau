package com.br.fiap.vacinas.service;

import com.br.fiap.vacinas.repository.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    public VacinaRepository getVacinaRepository() {
        return vacinaRepository;
    }
}
