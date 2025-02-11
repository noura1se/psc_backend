package com.example.psc.entities;

import jakarta.persistence.*;

@Entity

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
    private List<historique> historique;


    //constructor:

    public Room(long roomID,
                String name,
                String type,
                String capacity,
                String equipment,
                String status,
                List<Session> session,
                List<Event> event,
                List<historique> historique) {


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

    //geters & seters


    public long getRoomID() {
        return roomID;
    }

    public void setRoomID(long roomID) {
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String capacity) {
        Capacity = capacity;
    }

    public String getEquipment() {
        return Equipment;
    }

    public void setEquipment(String equipment) {
        Equipment = equipment;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<Session> getSession() {
        return session;
    }

    public void setSession(List<Session> session) {
        this.session = session;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public List<historique> getHistorique() {
        return historique;
    }

    public void setHistorique(List<historique> historique) {
        this.historique = historique;
    }
}
