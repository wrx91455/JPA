package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.entity.VisitEntity;
import com.capgemini.wsb.service.impl.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class VisitServiceTest {

    @Autowired
    private VisitService visitService;

    @Test
    public void testFindVisitsByPatientId() {
        List<VisitEntity> visits = visitService.findVisitsByPatientId(1L);
        assertThat(visits).isNotEmpty();
    }
}
