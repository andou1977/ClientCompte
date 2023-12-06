package com.example.clientcompte.repository;

import com.example.clientcompte.entity.Client;
import com.example.clientcompte.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte,Integer> {


    List<Compte> findByClientId(int idClient);
}
