package com.saudeDigital.repositories;

import com.saudeDigital.entities.Agendamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentosRepository extends JpaRepository<Agendamentos, Long> {
}
