package com.example.clientcompte.repository;

import com.example.clientcompte.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Integer> {


    Client findClientById(int id);
}
