package com.example.psc.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sessionID;

    //parameters:
    private String period;        //(S1,S2,S3,S4,S5
    private String type;          //(reserved or primary)
    private LocalDate dateS;
    private String status;
    private String classe;

    //relations:
    @ManyToOne
    @JoinColumn(name = "profID", nullable = false) // FK column in sessions table
    private Prof prof;

    @ManyToOne
    @JoinColumn(name = "scheduleID", nullable = false) // FK column in sessions table
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "roomID", nullable = false) // FK column in sessions table
    private Room room;

    //constructor:


    public Session(long sessionID, String period, String type, LocalDate dateS, String status, String classe, Prof prof, Schedule schedule, Room room) {
        this.sessionID = sessionID;
        this.period = period;
        this.type = type;
        this.dateS = dateS;
        this.status = status;
        this.classe = classe;
        this.prof = prof;
        this.schedule = schedule;
        this.room = room;
    }


}
