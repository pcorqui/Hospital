package com.medical.Hospital.repository;

import com.medical.Hospital.models.Citas;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CitasRepository extends CrudRepository<Citas,Integer> {

    @Query("Select Citas from Citas" +
            "where idDoctor = :idDoctor" +
            "and fecha = :fecha " +
            "and consultorio = :consultorio")
    public List<Citas> findCitasByDoctorByDateByConsultorio(@Param("idDoctor")Integer idDoctor,
                                                           @Param("fecha") Date date,
                                                           @Param("consultorio") Integer idConsultorio);
}
