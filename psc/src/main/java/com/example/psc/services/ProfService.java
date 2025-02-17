package com.example.psc.services;


import com.example.psc.entities.Schedule;
import com.example.psc.entities.Session;
import com.example.psc.repositories.ScheduleRepository;
import com.example.psc.repositories.SessionRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProfService {
    private final ScheduleRepository scheduleRepository;
    private final SessionRepository sessionRepository;

    public ProfService(ScheduleRepository scheduleRepository,
                       SessionRepository sessionRepository) {
        this.scheduleRepository = scheduleRepository;
        this.sessionRepository = sessionRepository;
    }

    //public List<Schedule> findSchedule(Long profID){
      //  List<Schedule> schedules = scheduleRepository.findByProfID(profID);
        //return schedules;
    //}

    public Schedule findActiveSchedule(Long profID) {
        return scheduleRepository.findActiveSchedule(profID, LocalDate.now());
    }


    public List<Session> findSessions(Schedule currentSchedule){
        List<Session> sesssions = sessionRepository.findByScheduleID(currentSchedule.getScheduleID());
        return sesssions;
    }
}
