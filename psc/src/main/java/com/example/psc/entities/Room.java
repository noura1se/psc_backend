package com.example.psc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Room {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long roomID;

    //parameters:
   private String name;
   private String Type;
   private String Capacity;
   private String  Equipment;
   private  String Status;


    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Session> session;


    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Event> event;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    private List<Historique> historique;


    //constructor:


    public Room(long roomID,
                String name,
                String type,
                String capacity,
                String equipment,
                String status,
                List<Session> session,
                List<Event> event,
                List<Historique> historique) {
        this.roomID = roomID;
        this.name = name;
        Type = type;
        Capacity = capacity;
        Equipment = equipment;
        Status = status;
        this.session = session;
        this.event = event;
        this.historique = historique;
    }

    public Room() {
    }


}
