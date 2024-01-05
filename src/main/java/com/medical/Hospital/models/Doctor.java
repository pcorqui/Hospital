package com.medical.Hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "Doctores")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Doctor{

    @Id
    @Column(name = "id_doctor", nullable = false,unique = true,length = 15)
    private Integer IdDoctor;
    @Column
    private String Nombre;
    @Column
    private String Apellido;
    @Column
    private String ApellidoMaterno;
    @Column
    private String specialidad;

}