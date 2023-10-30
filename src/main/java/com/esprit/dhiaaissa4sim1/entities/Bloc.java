package com.esprit.dhiaaissa4sim1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long idBloc;
    @NonNull
    private String nomBloc;
    @NonNull
    private long capaciteBloc;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idFoyer") // Nom de la colonne de la clé étrangère dans la table Bloc
    private Foyer foyer;
    @JsonIgnore
    @OneToMany(mappedBy = "bloc") // "bloc" fait référence au nom de l'attribut dans la classe Chambre
    private List<Chambre> chambres;

}
