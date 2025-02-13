package com.saudeDigital.service;


import com.saudeDigital.entities.Agendamentos;
import com.saudeDigital.repositories.AgendamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentosService {

    @Autowired
    private AgendamentosRepository repository;

    public Agendamentos agendarConsulta(Agendamentos agendamentos) {
        return repository.save(agendamentos);
    }
    public List<Agendamentos> listarAgendamentos() {
        return repository.findAll();
    }
    public void cancelarAgendamentos(Long id) {
        repository.deleteById(id);
    }
}
