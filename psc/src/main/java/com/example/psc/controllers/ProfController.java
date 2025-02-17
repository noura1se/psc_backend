package com.example.psc.controllers;


import com.example.psc.entities.Schedule;
import com.example.psc.entities.Session;
import com.example.psc.services.ProfService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("Profs/{profID}")
public class ProfController {
    //calling service layers :
    private final ProfService profService;

    public ProfController(ProfService profService){
        this.profService = profService;
    }
    //requests :
    @GetMapping("/schedule/init")
    public ResponseEntity<?> fetchSchedule(@PathVariable("profID") Long profID){
        //fetch prof's schedules
        Schedule currentSchedule = profService.findActiveSchedule(profID);
        if (currentSchedule == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No active schedule found for this teacher");
        }

        //fetch sessions of currentSchedule
        List<Session> sessions = profService.findSessions(currentSchedule);
        return sessions.isEmpty()
                ? ResponseEntity.status(HttpStatus.NOT_FOUND).body("No sessions found for this schedule")
            : ResponseEntity.ok(sessions);
    }




}
