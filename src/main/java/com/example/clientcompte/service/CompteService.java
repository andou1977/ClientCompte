package com.example.clientcompte.service;


import com.example.clientcompte.allinterface.CompteInterface;
import com.example.clientcompte.entity.Client;
import com.example.clientcompte.entity.Compte;
import com.example.clientcompte.repository.ClientRepository;
import com.example.clientcompte.repository.CompteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService implements CompteInterface {

    CompteRepository compteRepository;
    ClientRepository clientRepository;
    CompteService compteService;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;

    }


    public double calculerSommeSoldesParClient( int idClient) {
        List<Compte> comptes = compteRepository.findByClientId(idClient);
        double montant=0.0;

        for(Compte compte : comptes) {
            montant=montant+compte.getSolde();
        }

        return montant;
    }


    @Override
    public Compte savecompte(Compte compte) {
        return compteRepository.save(compte);
    }
}
