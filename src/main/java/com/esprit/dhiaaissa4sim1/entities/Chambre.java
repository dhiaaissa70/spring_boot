package com.esprit.dhiaaissa4sim1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


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

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long idChambre;
    @NonNull
    private long numeroChambre;
    @NonNull
    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idBloc") // Clé étrangère vers la table Bloc
    private Bloc bloc;

    public enum TypeChambre {
        SIMPLE,
        DOUBLE,
        TRIPLE
    }




}

