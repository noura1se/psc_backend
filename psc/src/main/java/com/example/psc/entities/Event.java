package com.example.psc.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

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


    //geters & seters


    public long getEventID() {
        return eventID;
    }

    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
