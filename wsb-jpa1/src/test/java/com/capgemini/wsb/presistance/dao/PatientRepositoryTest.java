package com.capgemini.wsb.presistance.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.dao.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PatientRepositoryTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testFindPatientsByLastName() {
        List<PatientEntity> patients = patientRepository.findPatientsByLastName("Smith");
        assertThat(patients).isNotEmpty();
    }
}
