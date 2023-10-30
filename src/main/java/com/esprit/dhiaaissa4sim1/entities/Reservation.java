package com.esprit.dhiaaissa4sim1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

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

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long idReservation;
    @NonNull
    private Date anneeUniversitaire;
    @NonNull
    private boolean estValide;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idEtudiant") // Clé étrangère vers la table Etudiant
    private Etudiant etudiant;

    public Reservation(Date anneeUniversitaire, boolean estValide) {
        this.anneeUniversitaire = anneeUniversitaire;
        this.estValide = estValide;
    }


}
