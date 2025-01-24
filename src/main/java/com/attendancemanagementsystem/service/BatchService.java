package com.attendancemanagementsystem.service;

import com.attendancemanagementsystem.model.Batch;

import java.util.List;

public interface BatchService {
    Batch saveBatch(Batch batch);

    List<Batch> getAllBatches();

    Batch getBatchById(Long id);

    void deleteBatch(Long id);
}
