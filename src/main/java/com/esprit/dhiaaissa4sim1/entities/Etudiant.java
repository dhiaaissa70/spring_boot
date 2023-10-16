package com.esprit.dhiaaissa4sim1.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long  idEtudiant;
   private String nomEt;
   private String prenomEt;
   private long cin;
   private String ecole ;
   private Date DateNaissance;
    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @ManyToMany
    @JoinTable(
            name = "etudiant_chambre",
            joinColumns = @JoinColumn(name = "etudiant_id"),
            inverseJoinColumns = @JoinColumn(name = "chambre_id")
    )
    private List<Chambre> chambres;

    @ManyToOne
    @JoinColumn(name = "foyer_id")
    private Foyer foyer;

    public long getIdEtudiant() {
        return idEtudiant;
    }

    public String getNomEt() {
        return nomEt;
    }

    public String getPrenomEt() {
        return prenomEt;
    }

    public long getCin() {
        return cin;
    }

    public String getEcole() {
        return ecole;
    }

    public Date getDateNaissance() {
        return DateNaissance;
    }

    public void setIdEtudiant(long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public void setNomEt(String nomEt) {
        this.nomEt = nomEt;
    }

    public void setPrenomEt(String prenomEt) {
        this.prenomEt = prenomEt;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public void setDateNaissance(Date dateNaissance) {
        DateNaissance = dateNaissance;
    }
}
