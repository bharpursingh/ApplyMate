package com.example.ApplyMate.service.impl;

import com.example.ApplyMate.dto.JobDto;
import com.example.ApplyMate.dto.JobDtoCreate;
import com.example.ApplyMate.dto.JobMapper;
import com.example.ApplyMate.exception.ResourceNotFoundException;
import com.example.ApplyMate.model.Job;
import com.example.ApplyMate.repository.JobRepository;
import com.example.ApplyMate.service.JobService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl implements JobService {
    private JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public JobDto createJob(JobDtoCreate jobDtoCreate) {

        Job job = JobMapper.maptoJob(jobDtoCreate);
        Job savedEmployee = jobRepository.save(job);
        return JobMapper.mapToJobDto(savedEmployee);
    }

    @Override
    public JobDto getJobById(Long jobId) {


        Job job = jobRepository.findById(jobId)
               .orElseThrow(()-> new ResourceNotFoundException("Job does not exist with given id : " + jobId));

        return JobMapper.mapToJobDto(job);
    }
}
