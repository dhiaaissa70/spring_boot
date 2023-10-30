package com.esprit.dhiaaissa4sim1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.JoinColumn;


@Slf4j
@Service
@Setter
@Getter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@ToString

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long idEtudiant;
    @NonNull
    private String nomEt;
    @NonNull
    private String prenomEt;
    @NonNull
    private long cin;
    @NonNull
    private String ecole;
    @NonNull
    private Date dateNaissance;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idChambre") // Clé étrangère vers la table Chambre
    private Chambre chambre;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idUniversite") // Clé étrangère vers la table Universite
    private Universite universite;




}


