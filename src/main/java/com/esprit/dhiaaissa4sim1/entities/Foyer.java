package com.esprit.dhiaaissa4sim1.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Foyer implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private long idFoyer;
    private  String nomfoyer;
    private long capaciteFoyer;
    @ManyToOne
    @JoinColumn(name = "foyer_id")
    private Foyer foyer;
    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;
    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setNomfoyer(String nomfoyer) {
        this.nomfoyer = nomfoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    public long getIdFoyer() {
        return idFoyer;
    }

    public String getNomfoyer() {
        return nomfoyer;
    }

    public long getCapaciteFoyer() {
        return capaciteFoyer;
    }
}
