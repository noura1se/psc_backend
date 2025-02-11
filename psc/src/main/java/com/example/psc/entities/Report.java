package com.example.psc.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
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

}
