package com.esprit.dhiaaissa4sim1.controller;

import com.esprit.dhiaaissa4sim1.entities.Foyer;
import com.esprit.dhiaaissa4sim1.service.FoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foyers")

public class FoyerController {

    private final FoyerService foyerService;

    @Autowired
    public FoyerController(FoyerService foyerService) {
        this.foyerService = foyerService;
    }
    public FoyerController() {
        this.foyerService = null;
    }


    @PostMapping("/add")
    public Foyer createFoyer(@RequestBody Foyer foyer) {
        return foyerService.saveFoyer(foyer);
    }

    @GetMapping("/all")
    public List<Foyer> getAllFoyers() {
        return foyerService.getAllFoyers();
    }

    @GetMapping("/{id}")
    public Optional<Foyer> getFoyerById(@PathVariable Long id) {
        return foyerService.getFoyerById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
    }
}
