package com.example.psc.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Historique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long resID;

    //parameters:
    private String period;
    private String status;
    private LocalDate dateRes;
    private String classe;

    @ManyToOne
    @JoinColumn(name = "roomID", nullable = false) // FK column in sessions table
    private Room room;

    @ManyToOne
    @JoinColumn(name = "profID", nullable = false) // FK column in sessions table
    private Prof prof;

    //constructor:

    public Historique(long resID, String period, String status, LocalDate dateRes, String classe, Room room, Prof prof) {
        this.resID = resID;
        this.period = period;
        this.status = status;
        this.dateRes = dateRes;
        this.classe = classe;
        this.room = room;
        this.prof = prof;
    }

    //getters and setters:

    public long getResID() {
        return resID;
    }

    public void setResID(long resID) {
        this.resID = resID;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateRes() {
        return dateRes;
    }

    public void setDateRes(LocalDate dateRes) {
        this.dateRes = dateRes;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Prof getProf() {
        return prof;
    }

    public void setProf(Prof prof) {
        this.prof = prof;
    }
}
