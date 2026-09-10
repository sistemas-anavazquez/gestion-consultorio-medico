package com.anadev.consultoriomedico.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(
    name = "consulta",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uk_consulta_turno",
            columnNames = {"id_turno"}
        )
    }
)
@Getter
@Setter
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private String diagnostico;

    private String tratamiento;

    private String observaciones;

    @OneToOne
    @JoinColumn(name = "id_turno", nullable = false)
    private Turno turno;
}