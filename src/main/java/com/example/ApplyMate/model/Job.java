package com.example.ApplyMate.model;


import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name="job_tracker")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="job_position")
    private String jobPosition;

    @Column(name="job_description")
    private String jobDescription;

    @Column(name="date_posted")
    private Date datePosted;

    @Column(name="date_applied")
    private Date dateApplied;

    @Column(name="keywords")
    private String[] keywords;

    @Column(name="response")
    private String response;

    public Job(Long id, String jobPosition, String jobDescription, Date datePosted, Date dateApplied, String[] keywords, String response) {
        this.id = id;
        this.jobPosition = jobPosition;
        this.jobDescription = jobDescription;
        this.datePosted = datePosted;
        this.dateApplied = dateApplied;
        this.keywords = keywords;
        this.response = response;
    }

    public Job(String jobPosition, String jobDescription, Date datePosted, Date dateApplied, String[] keywords, String response) {
        this.id = 12L;
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
        return "Job{" +
                "Id=" + id +
                ", jobPosition='" + jobPosition + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", datePosted=" + datePosted +
                ", dateApplied=" + dateApplied +
                ", keywords=" + Arrays.toString(keywords) +
                ", response='" + response + '\'' +
                '}';
    }
}
