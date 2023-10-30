package com.esprit.dhiaaissa4sim1.controller;

import com.esprit.dhiaaissa4sim1.entities.Universite;

import com.esprit.dhiaaissa4sim1.service.UniversiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/universites")

public class UniversiteController {

    private final UniversiteService universiteService;

    @Autowired
    public UniversiteController(UniversiteService universiteService) {
        this.universiteService = universiteService;
    }

    @PostMapping("/add")
    public Universite createUniversite(@RequestBody Universite universite) {
        return universiteService.saveUniversite(universite);
    }

    @GetMapping("/all")
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @GetMapping("/{id}")
    public Optional<Universite> getUniversiteById(@PathVariable Long id) {
        return universiteService.getUniversiteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
    }
}
