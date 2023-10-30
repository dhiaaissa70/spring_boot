package com.esprit.dhiaaissa4sim1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
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
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private long idFoyer;
    @NonNull
    private String nomFoyer;
    @NonNull
    private long capaciteFoyer;
    @JsonIgnore
    @OneToMany(mappedBy = "foyer") // "foyer" fait référence à l'attribut dans la classe Bloc
    private List<Bloc> blocs;


}
