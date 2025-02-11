package com.example.psc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long alertID;

    //parameters:
    private String phonenum;

    //constructor:
    public Alert(long alertID, String phonenum) {
        this.alertID = alertID;
        this.phonenum = phonenum;
    }

    public Alert() {
    }

}
