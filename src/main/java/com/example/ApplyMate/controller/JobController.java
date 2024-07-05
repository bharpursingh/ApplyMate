package com.example.ApplyMate.controller;

import com.example.ApplyMate.dto.JobDto;
import com.example.ApplyMate.dto.JobDtoCreate;
import com.example.ApplyMate.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:3000/")
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

    @GetMapping
    public ResponseEntity<List<JobDto>> getAllJobs(){
        List<JobDto> jobs = jobService.getAllJobs();
        return ResponseEntity.ok(jobs);
    }

    @PutMapping("{id}")
    public ResponseEntity<JobDto> updateJob(@PathVariable("id") Long jobid,
                                            @RequestBody JobDto jobDto){
        JobDto jobdto = jobService.updateJob(jobid, jobDto);
        return ResponseEntity.ok(jobDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id") Long jobid){

        jobService.deleteJob(jobid);

        return ResponseEntity.ok("Job Deleted!!");
    }
}
