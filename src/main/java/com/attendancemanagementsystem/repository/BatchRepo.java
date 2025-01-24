package com.attendancemanagementsystem.repository;

import com.attendancemanagementsystem.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchRepo extends JpaRepository<Batch, Long> {
    Batch findByBatchName(String batchName);
}
