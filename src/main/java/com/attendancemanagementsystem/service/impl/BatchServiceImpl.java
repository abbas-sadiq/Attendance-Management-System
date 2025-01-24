package com.attendancemanagementsystem.service.impl;

import com.attendancemanagementsystem.model.Batch;
import com.attendancemanagementsystem.repository.BatchRepo;
import com.attendancemanagementsystem.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchServiceImpl implements BatchService {

    @Autowired
    private BatchRepo batchRepo;

    public Batch saveBatch(Batch batch) {
        return batchRepo.save(batch);
    }

    public List<Batch> getAllBatches() {
        return batchRepo.findAll();
    }

    public Batch getBatchById(Long id) {
        return batchRepo.findById(id).orElse(null);
    }

    public void deleteBatch(Long id) {
        batchRepo.deleteById(id);
    }
}
