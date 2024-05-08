package com.example.ApplyMate.service;

import com.example.ApplyMate.dto.JobDto;
import com.example.ApplyMate.dto.JobDtoCreate;

public interface JobService {
    public JobDto createJob(JobDtoCreate jobDtoCreate);
}
