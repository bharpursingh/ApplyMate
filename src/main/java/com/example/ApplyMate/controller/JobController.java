package com.example.ApplyMate.controller;

import com.example.ApplyMate.dto.JobDto;
import com.example.ApplyMate.dto.JobDtoCreate;
import com.example.ApplyMate.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // Add Employee REST Api
    @PostMapping
    public ResponseEntity<JobDto> createJob(@RequestBody JobDtoCreate jobDto){
        JobDto savedJob = jobService.createJob(jobDto);
        return new ResponseEntity<>(savedJob, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<JobDto> getJobById(@PathVariable("id") Long jobid){
        JobDto jobDto = jobService.getJobById(jobid);
        return ResponseEntity.ok(jobDto);
    }
}
