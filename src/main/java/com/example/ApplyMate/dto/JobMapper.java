package com.example.ApplyMate.dto;

import com.example.ApplyMate.model.Job;

public class JobMapper {
    public static JobDto mapToJobDto(Job job){
        return new JobDto(
          job.getId(),
          job.getJobPosition(),
          job.getJobDescription(),
          job.getDatePosted(),
          job.getDateApplied(),
          job.getKeywords(),
          job.getResponse()
        );
    }

    public static Job mapToJob(JobDto jobDto){

        return new Job(
                jobDto.getId(),
                jobDto.getJobPosition(),
                jobDto.getJobDescription(),
                jobDto.getDatePosted(),
                jobDto.getDateApplied(),
                jobDto.getKeywords(),
                jobDto.getResponse()
        );
    }

    public static Job maptoJob(JobDtoCreate jobDtoCreate){

        return new Job(
                jobDtoCreate.getJobPosition(),
                jobDtoCreate.getJobDescription(),
                jobDtoCreate.getDatePosted(),
                jobDtoCreate.getDateApplied(),
                jobDtoCreate.getKeywords(),
                jobDtoCreate.getResponse()
        );
    }
}
