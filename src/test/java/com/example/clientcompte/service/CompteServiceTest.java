package com.example.clientcompte.service;

import com.example.clientcompte.entity.Client;
import com.example.clientcompte.entity.Compte;
import com.example.clientcompte.enumeration.CompteEnum;
import com.example.clientcompte.repository.ClientRepository;
import com.example.clientcompte.repository.CompteRepository;
import jakarta.validation.constraints.AssertTrue;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CompteServiceTest {
    @InjectMocks
    CompteService compteService;
    @Mock
    ClientRepository clientRepository;
    @Mock
    CompteRepository compteRepository;

    @Test
    void calculerSommeSoldesParClient() {
//        Client client = new Client();
//        client.setId(1);
//      Compte compte=new Compte(1,200.0,new Date(),CompteEnum.EPARGNE,client);
//        Compte compte1=new Compte(2,200.0,new Date(),CompteEnum.EPARGNE,client);
//
//        // Définir le comportement du mock CompteRepository
//        when(compteRepository.findByClientId(1)).thenReturn(Arrays.asList(compte, compte1));
//
//        // Appeler la méthode à tester
//        double sommeSoldes = compteService.calculerSommeSoldesParClient(1);
//
//        // Vérifier le résultat
//        assertEquals(400.0, sommeSoldes);
//
//        // Vérifier que la méthode findByClientId a été appelée une fois avec l'argument 1
//        verify(compteRepository, times(1)).findByClientId(1);
    }

    @Test
    void savecompte() {

    }
}