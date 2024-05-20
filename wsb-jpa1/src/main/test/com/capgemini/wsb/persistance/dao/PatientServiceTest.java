package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.persistence.dao.PatientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PatientServiceTest {

    @Mock
    private PatientRepository patientRepository;

    @InjectMocks
    private PatientService patientService;

    public PatientServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindVisitsByPatientId() {
        Long patientId = 1L;
        when(patientRepository.findVisitsByPatientId(patientId)).thenReturn(List.of(new VisitEntity()));
        List<VisitEntity> visits = patientService.findVisitsByPatientId(patientId);
        assertThat(visits).isNotEmpty();
    }
}
