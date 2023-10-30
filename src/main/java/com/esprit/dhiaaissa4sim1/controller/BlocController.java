package com.esprit.dhiaaissa4sim1.controller;
import com.esprit.dhiaaissa4sim1.entities.Bloc;
import com.esprit.dhiaaissa4sim1.service.BlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/blocs")

public class BlocController {


    private final BlocService blocService;

    @Autowired
    public BlocController(BlocService blocService) {
        this.blocService = blocService;
    }
    public BlocController() {
        blocService=null;
    }

    @PostMapping("/add")
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.saveBloc(bloc);
    }

    @GetMapping("/all")
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }

    @GetMapping("/{id}")
    public Optional<Bloc> getBlocById(@PathVariable Long id) {
        return blocService.getBlocById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }

}
