package com.example.psc.entities;


import jakarta.persistence.*;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDate;

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

    //getters and setters:

    public long getSessionID() {
        return sessionID;
    }

    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDateS() {
        return dateS;
    }

    public void setDateS(LocalDate dateS) {
        this.dateS = dateS;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
