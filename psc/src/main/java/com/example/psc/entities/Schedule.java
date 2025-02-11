package com.example.psc.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scheduleID;

    //parameters:
    private LocalDate dateDebut;
    private LocalDate dateFin;

    //relations:
    @ManyToOne
    @JoinColumn(name = "profID", nullable = false) // FK column in sessions table
    private Prof prof;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<Session> sessions;
}
