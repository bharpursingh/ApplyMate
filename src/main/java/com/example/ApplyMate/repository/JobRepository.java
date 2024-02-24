package com.example.ApplyMate.repository;

import com.example.ApplyMate.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
