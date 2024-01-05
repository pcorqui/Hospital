package com.medical.Hospital.controller;

import com.medical.Hospital.Entity.Appointment;
import com.medical.Hospital.models.Doctor;
import com.medical.Hospital.services.CitasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.medical.Hospital.models.Citas;

import java.util.List;

@RestController
@RequestMapping("/api/v1/citas")
public class CitasController {

    @Autowired
    CitasServices citasServices;

    @PostMapping
    public ResponseEntity<List<Citas>> getCitas(@RequestBody Appointment appointment){
        return ResponseEntity.ok(this.citasServices.getCitasByDoctorByDateByConsultorio(appointment));
    }

    @PutMapping("/{idCita}")
    public ResponseEntity<Citas> updateCita(@RequestBody Citas cita){
         return ResponseEntity.ok(citasServices.updateCita(cita));
    }

    @DeleteMapping("/{idCita}")
    public ResponseEntity<Citas> cancelarCita(@PathVariable int idCita){
        Citas cita = citasServices.cancelarCita(idCita);
        return ResponseEntity.ok(cita);
    }


}
