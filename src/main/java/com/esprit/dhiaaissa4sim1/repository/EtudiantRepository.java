package com.esprit.dhiaaissa4sim1.repository;

import com.esprit.dhiaaissa4sim1.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
