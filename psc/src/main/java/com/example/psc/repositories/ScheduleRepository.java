package com.example.psc.repositories;

import com.example.psc.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByProfID(Long profID);

    @Query("SELECT s FROM Schedule s WHERE s.profID = :profID AND :currentDate BETWEEN s.dateDebut AND s.dateFin")
    Schedule findActiveSchedule(@Param("profID") Long profID, @Param("currentDate") LocalDate currentDate);
}
