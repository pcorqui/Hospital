package com.medical.Hospital.Entity;

import com.medical.Hospital.models.Consultorio;
import com.medical.Hospital.models.Doctor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Appointment {
    private Date fecha;
    private Integer doctor;
    private Integer consultorio;
}
