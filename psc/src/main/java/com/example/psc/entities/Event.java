package com.example.psc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Event {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long eventID;

        //parameters:
   private String name;
   private String period;
   private LocalDate date;
   private String description;

    @ManyToOne
    @JoinColumn(name = "roomID", nullable = false) // FK column in Pointage table
    private Room room ;
    //constructor:

    public Event(long eventID,
                 String name,
                 String period,
                 LocalDate date,
                 String description,
                 Room room) {
        this.eventID = eventID;
        this.name = name;
        this.period = period;
        this.date = date;
        this.description = description;
        this.room = room;
    }

    public Event() {
    }

}
