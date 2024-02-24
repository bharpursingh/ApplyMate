package com.example.ApplyMate.dto;

import java.util.Date;

public class JobDtoCreate {

    private String jobPosition;

    private String jobDescription;

    private Date datePosted;

    private Date dateApplied;

    private String[] keywords;

    private String response;

    public String getJobPosition() {
        return jobPosition;
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

}
