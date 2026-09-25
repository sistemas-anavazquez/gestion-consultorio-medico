package com.anadev.consultoriomedico.repository;

import com.anadev.consultoriomedico.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}