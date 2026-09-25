package com.anadev.consultoriomedico.repository;

import com.anadev.consultoriomedico.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    
}
