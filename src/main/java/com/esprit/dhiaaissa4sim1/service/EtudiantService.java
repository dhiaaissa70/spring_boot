package com.esprit.dhiaaissa4sim1.service;

import com.esprit.dhiaaissa4sim1.entities.Etudiant;
import com.esprit.dhiaaissa4sim1.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class EtudiantService {

    private final EtudiantRepository etudiantRepository;

    @Autowired
    public EtudiantService(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    public Etudiant saveEtudiant(Etudiant etudiant) {

        return etudiantRepository.save(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }

    public Optional<Etudiant> getEtudiantById(Long id) {
        return etudiantRepository.findById(id);
    }

    public void deleteEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

}

