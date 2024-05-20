package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    @Query("SELECT p FROM PatientEntity p WHERE p.lastName = :lastName")
    List<PatientEntity> findPatientsByLastName(@Param("lastName") String lastName);

    @Query("SELECT v FROM VisitEntity v WHERE v.patient.id = :patientId")
    List<VisitEntity> findAllVisitsByPatientId(@Param("patientId") Long patientId);

    @Query("SELECT p FROM PatientEntity p WHERE size(p.visits) > :visitCount")
    List<PatientEntity> findPatientsWithMoreThanXVisits(@Param("visitCount") Long visitCount);

    @Query("SELECT p FROM PatientEntity p WHERE p.age > :age")
    List<PatientEntity> findPatientsByAgeGreaterThan(@Param("age") int age);
}
