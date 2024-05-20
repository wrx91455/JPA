package com.capgemini.wsb.mapper;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.persistence.entity.DoctorEntity;
import com.capgemini.wsb.dto.PatientTO;
import com.capgemini.wsb.dto.VisitTO;
import com.capgemini.wsb.dto.DoctorTO;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class PatientMapper {

    public PatientTO toPatientTO(PatientEntity entity) {
        if (entity == null) {
            return null;
        }

        PatientTO to = new PatientTO();
        to.setId(entity.getId());
        to.setFirstName(entity.getFirstName());
        to.setLastName(entity.getLastName());
        to.setTelephoneNumber(entity.getTelephoneNumber());
        to.setEmail(entity.getEmail());
        to.setPatientNumber(entity.getPatientNumber());
        to.setDateOfBirth(entity.getDateOfBirth());
        to.setAge(entity.getAge()); // new field

        if (entity.getVisits() != null) {
            to.setVisits(entity.getVisits().stream()
                    .map(this::toVisitTO)
                    .collect(Collectors.toList()));
        }

        return to;
    }

    private VisitTO toVisitTO(VisitEntity visit) {
        VisitTO to = new VisitTO();
        to.setId(visit.getId());
        to.setDescription(visit.getDescription());
        to.setTime(visit.getTime());
        to.setDoctor(toDoctorTO(visit.getDoctor()));
        return to;
    }

    private DoctorTO toDoctorTO(DoctorEntity doctor) {
        DoctorTO to = new DoctorTO();
        to.setId(doctor.getId());
        to.setFirstName(doctor.getFirstName());
        to.setLastName(doctor.getLastName());
        to.setTelephoneNumber(doctor.getTelephoneNumber());
        to.setEmail(doctor.getEmail());
        to.setDoctorNumber(doctor.getDoctorNumber());
        to.setSpecialization(doctor.getSpecialization().toString());
        return to;
    }
}
