package com.esprit.dhiaaissa4sim1.service;
import com.esprit.dhiaaissa4sim1.entities.Universite;
import com.esprit.dhiaaissa4sim1.repository.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class UniversiteService {

    private final UniversiteRepository universiteRepository;

    @Autowired
    public UniversiteService(UniversiteRepository universiteRepository) {
        this.universiteRepository = universiteRepository;
    }

    public Universite saveUniversite(Universite universite) {

        return universiteRepository.save(universite);
    }

    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    public Optional<Universite> getUniversiteById(Long id) {
        return universiteRepository.findById(id);
    }

    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

}
