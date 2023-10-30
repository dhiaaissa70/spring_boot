package com.esprit.dhiaaissa4sim1.service;

import com.esprit.dhiaaissa4sim1.entities.Chambre;
import com.esprit.dhiaaissa4sim1.repository.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class ChambreService {

    private final ChambreRepository chambreRepository;

    @Autowired
    public ChambreService(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

    public Chambre saveChambre(Chambre chambre) {

        return chambreRepository.save(chambre);
    }

    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    public Optional<Chambre> getChambreById(Long id) {
        return chambreRepository.findById(id);
    }

    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }


}





