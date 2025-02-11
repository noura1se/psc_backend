package com.example.psc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Admin extends User {

    private long adminID;

    // Constructor
    public Admin(long adminID) {
        this.adminID = adminID;
    }
}
