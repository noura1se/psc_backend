package com.example.psc.entities;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Prof extends User{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long profID;

    //relations:
    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
    private List<Session> sessions;

    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
    private List<Historique> historiques;

    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
    private List<Schedule> schedules;


    //constructor

    public Prof(long profID) {
        this.profID = profID;
    }

    //geters & seter

    public long getProfID() {
        return profID;
    }

    public void setProfID(long profID) {
        this.profID = profID;
    }
}
