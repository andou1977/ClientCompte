package com.example.clientcompte.controller;


import com.example.clientcompte.entity.Client;
import com.example.clientcompte.entity.Compte;
import com.example.clientcompte.repository.ClientRepository;
import com.example.clientcompte.repository.CompteRepository;
import com.example.clientcompte.service.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class CompteController {

    CompteRepository compteRepository;
    CompteService compteService;
    ClientRepository clientRepository;

    public CompteController(CompteRepository compteRepository, CompteService compteService, ClientRepository clientRepository) {
        this.compteRepository = compteRepository;
        this.compteService = compteService;
        this.clientRepository = clientRepository;
    }

    @PostMapping("/savecompte")
    public Compte savecompte(Compte compte) {
        return compteRepository.save(compte);

    }

    @GetMapping("/listercompte")
    public List<Compte> listercompte() {
        return compteRepository.findAll();
    }


    @GetMapping("/sommeSoldes/{idClient}")
    public double calculerSommeSoldesParClient(int idClient) {
        return compteService.calculerSommeSoldesParClient(idClient);
    }
}















