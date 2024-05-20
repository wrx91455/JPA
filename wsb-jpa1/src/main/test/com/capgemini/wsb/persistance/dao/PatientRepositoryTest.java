package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PatientRepositoryTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testFindPatientsByLastName() {
        List<PatientEntity> patients = patientRepository.findPatientsByLastName("Smith");
        assertThat(patients).isNotEmpty();
    }
}
    @Test
    public void testFindPatientsWithMoreThanXVisits() {
        List<PatientEntity> patients = patientRepository.findPatientsWithMoreThanXVisits(1L);
        assertThat(patients).isNotEmpty();
    }
    @Test
    public void testFindPatientsByAgeGreaterThan() {
        List<PatientEntity> patients = patientRepository.findPatientsByAgeGreaterThan(30);
        assertThat(patients).isNotEmpty();
    }
