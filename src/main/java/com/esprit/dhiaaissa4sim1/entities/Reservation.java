package com.esprit.dhiaaissa4sim1.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReservation;
    private Date anneUniversitaire;
    private boolean estValide;
    @ManyToOne
    @JoinColumn(name = "chambre_id")
    private Chambre chambre;


    public Date getAnneUniversitaire() {
        return anneUniversitaire;
    }

    public boolean isEstValide() {
        return estValide;
    }

    public long getIdReservation() {
        return idReservation;
    }


    public void setAnneUniversitaire(Date anneUniversitaire) {
        this.anneUniversitaire = anneUniversitaire;
    }

    public void setEstValide(boolean estValide) {
        this.estValide = estValide;
    }

    public void setIdReservation(long idReservation) {
        this.idReservation = idReservation;
    }
}
