package com.example.psc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Specify the inheritance strategy
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)  // Discriminator column
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    // parameters:
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String email;
    private String password;
    private String role;

    // constructors:
    public User() {
    }

    public User(Long userID, String firstName, String lastName, LocalDate dob, String email, String password, String role) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
