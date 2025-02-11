package com.example.psc.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
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
}
