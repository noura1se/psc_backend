package com.example.psc.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reportID;

    //parameters:
    private String status;
    private String description;
    private LocalDate dateR;
    private LocalTime timeR;

    //relations:
    @ManyToOne
    @JoinColumn(name = "userID", nullable = false) // FK column in sessions table
    private User user;

    //constructor:

    public Report(long reportID, String status, String description, LocalDate dateR, LocalTime timeR, User user) {
        this.reportID = reportID;
        this.status = status;
        this.description = description;
        this.dateR = dateR;
        this.timeR = timeR;
        this.user = user;
    }

    //getters and setters:

    public long getReportID() {
        return reportID;
    }

    public void setReportID(long reportID) {
        this.reportID = reportID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateR() {
        return dateR;
    }

    public void setDateR(LocalDate dateR) {
        this.dateR = dateR;
    }

    public LocalTime getTimeR() {
        return timeR;
    }

    public void setTimeR(LocalTime timeR) {
        this.timeR = timeR;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
