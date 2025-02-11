package com.example.psc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@DiscriminatorValue("PROF")  // Discriminator value for the Prof entity
public class Prof extends User {

    // Child-specific fields (no need for @Id here)
    private long profID;

    // Relations
    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
    private List<Session> sessions;

    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
    private List<Historique> historiques;

    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL)
    private List<Schedule> schedules;

    // Constructors
    public Prof(long profID) {
        this.profID = profID;
    }
}
