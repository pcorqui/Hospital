package com.medical.Hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Consultorio{

    @Id
    @Column(name = "id",nullable = false,unique = true,length = 15)
    private Integer Id;
    @Column
    private Integer NoConsultorio;
    @Column
    private Integer Piso;
}