package com.capgemini.wsb.service.impl;

import com.capgemini.wsb.persistence.dao.VisitRepository;
import com.capgemini.wsb.persistence.entity.VisitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService {

    private final VisitRepository visitRepository;

    @Autowired
    public VisitService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    public List<VisitEntity> findVisitsByPatientId(Long patientId) {
        return visitRepository.findAllVisitsByPatientId(patientId);
    }
}
