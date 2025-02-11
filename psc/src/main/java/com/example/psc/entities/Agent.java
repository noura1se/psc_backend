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

}
