package com.example.psc.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
@Getter
@Setter
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleID;

    //parameters:
    private LocalDate dateDebut;   //debut month and year of a semester
    private LocalDate dateFin;     //end month and year of a semester

    //relations:
    @ManyToOne
    @JoinColumn(name = "profID", nullable = false) // FK column in sessions table
    private Prof prof;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<Session> sessions;

    //constructor:

    public Schedule(long scheduleID, LocalDate dateDebut, LocalDate dateFin, Prof prof, List<Session> sessions) {
        this.scheduleID = scheduleID;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prof = prof;
        this.sessions = sessions;
    }
}
