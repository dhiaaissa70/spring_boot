package com.esprit.dhiaaissa4sim1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import jakarta.persistence.OneToMany;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

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

public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long idUniversite;
    @NonNull
    private String nomUniversite;
    @NonNull
    private String adresse;
    @JsonIgnore
    @OneToMany(mappedBy = "universite") // "universite" fait référence à l'attribut dans la classe Etudiant
    private List<Etudiant> etudiants;





}
