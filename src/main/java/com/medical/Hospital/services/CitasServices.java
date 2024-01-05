package com.medical.Hospital.services;

import com.medical.Hospital.Entity.Appointment;
import com.medical.Hospital.repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.medical.Hospital.models.Citas;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CitasServices {

    @Autowired
    CitasRepository citasRepository;

    public List<Citas> getCitasByDoctorByDateByConsultorio(Appointment appointment){
        return citasRepository.findCitasByDoctorByDateByConsultorio(appointment.getDoctor(),appointment.getFecha(),appointment.getConsultorio());
    }

    public Citas updateCita(Citas cita){
        Citas citaActualizada = citasRepository.findById(cita.getIdCita()).get();
        if(citaActualizada != null){
            citasRepository.save(cita);
        }
        return citaActualizada;
    }

    public Citas cancelarCita(Integer citaId){
        Date fecha = new Date();
        Citas cita = citasRepository.findById(citaId).get();
        if (fecha.compareTo(cita.getHorarioConsulta()) <= 0){
            citasRepository.deleteById(citaId);
        }

        return cita;
    }
}
