package com.example.psc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prof extends User{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long profID;


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
