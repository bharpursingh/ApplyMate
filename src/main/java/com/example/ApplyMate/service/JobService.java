package com.example.ApplyMate.service;

import com.example.ApplyMate.dto.JobDto;
import com.example.ApplyMate.dto.JobDtoCreate;

import java.util.List;

public interface JobService {
    JobDto createJob(JobDtoCreate jobDtoCreate);

    JobDto getJobById(Long jobId);

    List<JobDto> getAllJobs();
}
