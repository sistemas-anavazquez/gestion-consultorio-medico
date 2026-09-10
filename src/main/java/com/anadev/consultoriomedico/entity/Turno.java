package com.anadev.consultoriomedico.entity;

import com.anadev.consultoriomedico.enums.EstadoTurno;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(
    name = "turno",
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uk_turno_medico_fecha_hora",
            columnNames = {"id_medico", "fecha", "hora"}
        )
    }
)
@Getter
@Setter
public class Turno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private LocalTime hora;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoTurno estado;

    @Column(nullable = false)
    private String motivoTurno;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false)
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_medico", nullable = false)
    private Medico medico;
}