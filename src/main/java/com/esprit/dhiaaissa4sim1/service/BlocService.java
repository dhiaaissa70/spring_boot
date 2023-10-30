package com.esprit.dhiaaissa4sim1.service;

import com.esprit.dhiaaissa4sim1.entities.Bloc;
import com.esprit.dhiaaissa4sim1.repository.BlocRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service
public class BlocService {

    private final BlocRepository blocRepository;

    @Autowired
    public BlocService(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    public Bloc saveBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

    public Optional<Bloc> getBlocById(Long id) {
        return blocRepository.findById(id);
    }

    public void deleteBloc(Long id) {
        blocRepository.deleteById(id);
    }

}
