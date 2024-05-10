package com.example.ApplyMate.service.impl;

import com.example.ApplyMate.dto.JobDto;
import com.example.ApplyMate.dto.JobDtoCreate;
import com.example.ApplyMate.dto.JobMapper;
import com.example.ApplyMate.exception.ResourceNotFoundException;
import com.example.ApplyMate.model.Job;
import com.example.ApplyMate.repository.JobRepository;
import com.example.ApplyMate.service.JobService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<JobDto> getAllJobs() {
        List<Job> jobs = jobRepository.findAll();
        return jobs.stream().map((job)->JobMapper.mapToJobDto(job)).collect(Collectors.toList());
    }

    @Override
    public JobDto updateJob(Long jobid, JobDto jobDto) {

        Job job = jobRepository.findById(jobid)
                .orElseThrow(()-> new ResourceNotFoundException("Job does not exist with id: "+jobid));

        job.setDateApplied(jobDto.getDateApplied());
        job.setJobDescription(jobDto.getJobDescription());
        job.setJobPosition(jobDto.getJobPosition());
        job.setDatePosted(jobDto.getDatePosted());
        job.setResponse(jobDto.getResponse());
        job.setKeywords(jobDto.getKeywords());

        Job updatedJob = jobRepository.save(job);

        return JobMapper.mapToJobDto(updatedJob);
    }
}
