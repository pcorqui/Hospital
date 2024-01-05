package com.medical.Hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Citas{
    @Id
    @Column(name = "idCita", nullable = false, unique = true,length = 15)
    private Integer idCita;
    @Column
    private Integer IdConsultorio;
    @Column
    private Integer IdDoctor;
    @Column
    private Date horarioConsulta;
    @Column
    private String nombrePaciente;
}