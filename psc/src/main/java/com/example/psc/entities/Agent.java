package com.example.psc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agent extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long agentID;

    private String typeAgt;



    //constructor:

    public Agent(Long agentID, String typeAgt) {
        this.agentID = agentID;
        this.typeAgt = typeAgt;
    }

    //getters and setters:

    public Long getAgentID() {
        return agentID;
    }

    public void setAgentID(Long agentID) {
        this.agentID = agentID;
    }

    public String getTypeAgt() {
        return typeAgt;
    }

    public void setTypeAgt(String typeAgt) {
        this.typeAgt = typeAgt;
    }

}
