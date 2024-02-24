package com.example.ApplyMate.dto;

import jakarta.persistence.Column;

import java.util.Arrays;
import java.util.Date;

public class JobDto {

    private Long id;
    private String jobPosition;

    private String jobDescription;

    private Date datePosted;

    private Date dateApplied;

    private String[] keywords;

    private String response;

    public JobDto(Long id, String jobPosition, String jobDescription, Date datePosted, Date dateApplied, String[] keywords, String response) {
        this.id = id;
        this.jobPosition = jobPosition;
        this.jobDescription = jobDescription;
        this.datePosted = datePosted;
        this.dateApplied = dateApplied;
        this.keywords = keywords;
        this.response = response;
    }

    public Long getId() {
        return id;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public Date getDateApplied() {
        return dateApplied;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public String getResponse() {
        return response;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public void setDateApplied(Date dateApplied) {
        this.dateApplied = dateApplied;
    }

    public void setKeywords(String[] keywords) {
        this.keywords = keywords;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "JobDto{" +
                "id=" + id +
                ", jobPosition='" + jobPosition + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", datePosted=" + datePosted +
                ", dateApplied=" + dateApplied +
                ", keywords=" + Arrays.toString(keywords) +
                ", response='" + response + '\'' +
                '}';
    }

}
