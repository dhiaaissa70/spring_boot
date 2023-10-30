package com.esprit.dhiaaissa4sim1.repository;

import com.esprit.dhiaaissa4sim1.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
