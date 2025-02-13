package com.saudeDigital.controller;

import com.saudeDigital.entities.Agendamentos;
import com.saudeDigital.service.AgendamentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentosController {

    @Autowired
    private AgendamentosService service;

    @PostMapping("/agendar")
    public ResponseEntity<Agendamentos> agendarConsulta(@RequestBody Agendamentos agendamentos){
        return ResponseEntity.ok(service.agendarConsulta(agendamentos));
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Agendamentos>> listarAgendamentos(){
        return ResponseEntity.ok(service.listarAgendamentos());
    }
    @DeleteMapping("/cancelar/{id}")
    public ResponseEntity<Void> cancelarAgendamentos(@PathVariable Long id){
        service.cancelarAgendamentos(id);
        return ResponseEntity.noContent().build();
    }

}
