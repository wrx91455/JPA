package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.service.impl.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Test
    public void testFindAllPatients() {
        List<PatientEntity> patients = patientService.findAll();
        assertThat(patients).isNotEmpty();
    }
}
