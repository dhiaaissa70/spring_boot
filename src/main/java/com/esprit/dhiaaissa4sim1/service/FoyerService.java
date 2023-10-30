package com.esprit.dhiaaissa4sim1.service;

import com.esprit.dhiaaissa4sim1.entities.Foyer;
import com.esprit.dhiaaissa4sim1.repository.FoyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class FoyerService {

    private final FoyerRepository foyerRepository;

    @Autowired
    public FoyerService(FoyerRepository foyerRepository) {
        this.foyerRepository = foyerRepository;
    }

    public Foyer saveFoyer(Foyer foyer) {

        return foyerRepository.save(foyer);
    }

    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    public Optional<Foyer> getFoyerById(Long id) {
        return foyerRepository.findById(id);
    }

    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }


}
