package com.esprit.dhiaaissa4sim1.entities;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity

public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long idChambre;
private long numeroChambre;
@Enumerated(EnumType.STRING)
private TypeChambre typeC;

    @ManyToOne
    @JoinColumn(name = "idBloc")
    private Bloc bloc;

    @ManyToMany(mappedBy = "chambres")
    private List<Etudiant> etudiants;

    public long getIdChambre() {
        return idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public TypeChambre getTypeC() {
        return typeC;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public void setTypeC(TypeChambre typeC) {
        this.typeC = typeC;
    }
}
