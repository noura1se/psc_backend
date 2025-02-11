package com.example.psc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

    //setters & getters


    public long getAlertID() {
        return alertID;
    }

    public void setAlertID(long alertID) {
        this.alertID = alertID;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

}
