package com.example.psc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends User{


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long adminID;

        //constuctor
    public Admin(long adminID) {
        this.adminID = adminID;
    }

    //geters & seters


    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }

}
