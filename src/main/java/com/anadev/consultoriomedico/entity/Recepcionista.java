package com.anadev.consultoriomedico.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "recepcionista")
@Getter
@Setter

public class Recepcionista extends Usuario {
}