package com.example.psc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "userID")
public class Agent extends User {

    private Long agentID;
    private String typeAgt;

    // Constructor
    public Agent(Long agentID, String typeAgt) {
        this.agentID = agentID;
        this.typeAgt = typeAgt;
    }
}
